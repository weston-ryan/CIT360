/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author westo
 */
import static antlr.ANTLRTokdefParserTokenTypes.ID;
import java.lang.reflect.Member;
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageMember {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      
      try {
         factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      
      ManageMember ME = new ManageMember();

      /* Add a few member records in database */
      Integer memID1 = ME.addMember("Ryan", "Rye", 1000);
      Integer memID2 = ME.addMember("Heather", "Hea", 2000);
      Integer memID3 = ME.addMember("Lilly", "Lil", 3000);
      

      /* List down all the members */
      ME.listMembers();

      /* Update member's records */
      ME.updateMember(memID1, 5000);

      /* Delete an member from the database */
      ME.deleteMember(memID2);

      /* List down new list of the members */
      ME.listMembers();
   }
   
   /* Method to CREATE an member in the database */
   public Integer addMember(String fname, String lname, int salary){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer memberID = null;
      
      try {
         tx = session.beginTransaction();
         Member member = new Member(fname, lname, salary) {};
         memberID = (Integer) session.save(member); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return memberID;
   }
   
   /* Method to  READ all the members */
   public void listMembers( ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         List members = session.createQuery("FROM Member").list(); 
         for (Iterator iterator = members.iterator(); iterator.hasNext();){
            Member member = (Member) iterator.next(); 
            System.out.print("First Name: " + member.getFirstName()); 
            System.out.print("  Last Name: " + member.getLastName()); 
            System.out.println("  ID: " + member.getID()); 
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to UPDATE salary for an member */
   public void updateMember(Integer MemberID, int salary ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Member member = (Member)session.get(Member.class, MemberID); 
         member.setID( ID );
		 session.update(member); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to DELETE an member from the records */
   public void deleteMember(Integer MemberID){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Member member = (Member)session.get(Member.class, MemberID); 
         session.delete(member); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
}
