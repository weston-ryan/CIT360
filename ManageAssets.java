/*
 * I was trying to create something to manage assets at a credit union where I work.
* when we get a new computer, we place an asset tag onto the new computer.  THis is to
*manage the tag with the computer and location.
 */
import java.util.List; 
import java.util.Iterator; 
import javax.security.auth.login.Configuration;
 

public class ManageAssets {
   private static SessioncreditUnion creditUnion; 
   public static void main(String[] args) {
      
      try {
         creditUnion = new Configuration().configure().buildSessioncreditUnion();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessioncreditUnion object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      
      ManageAssets ME = new ManageAssets();

      /* Add few Asset records in database */
      Integer assetId1 = ME.addAsset("Workstations", 1001);
      Integer assetId2 = ME.addAsset("Infastructure", 1002);
      Integer assetId3 = ME.addAsset("DataCenter", 1003);

      /* List down all the Assets */
      ME.listAsset();

      /* Update Asset's records */
      ME.updateAsset(assetId1, 5000);

      /* Delete an Asset from the database */
      ME.deleteAsset(assetId2);

      /* List down new list of the Assets */
      ME.listAsset();
   }
   
   /* Method to CREATE an Asset in the database */
   public Integer addAsset(String fname, String lname, int Location){
      Session session = creditUnion.openSession();
      Transaction tx = null;
      Integer AssetID = null;
      
      try {
         tx = session.beginTransaction();
         Asset Asset = new Asset(fname, lname, Location);
         AssetID = (Integer) session.save(Asset); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return AssetID;
   }
   
   /* Method to  READ all the Assets */
   public void listAsset( ){
      Session session = creditUnion.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         List Assets = session.createQuery("FROM Asset").list(); 
         for (Iterator iterator = Assets.iterator(); iterator.hasNext();){
            Asset Asset = (Asset) iterator.next(); 
            System.out.print("Asset Name: " + Asset.getAssetName()); 
            System.out.print("Asset Tag: " + Asset.getAssetTag()); 
            System.out.println("Asset Location: " + Asset.getLocation()); 
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to UPDATE Location for an Asset */
   public void updateAsset(Integer AssetID, int Location ){
      Session session = creditUnion.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Asset Asset = (Asset)session.get(Asset.class, AssetID); 
         Asset.setLocation( Location );
		 session.update(Asset); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to DELETE an Asset from the records */
   public void deleteAsset(Integer AssetID){
      Session session = creditUnion.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Asset Asset = (Asset)session.get(Asset.class, AssetID); 
         session.delete(Asset); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }

    private Integer addAsset(String workstations, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
