
import com.sun.xml.internal.ws.api.addressing.WSEndpointReference.Metadata;
import org.hibernate.Session;    
import org.hibernate.SessionFactory; 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author westo
 */

//package com.javatpoint.mypackage;       
public class StoreAssets {    
public static void main(String[] args) {    
        
    //Create typesafe ServiceRegistry object    
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
          
   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
  
SessionFactory factory;  
    factory = meta.getSessionFactoryBuilder().build();
Session session = factory.openSession();  
Transaction x = session.beginTransaction();   
            
    Asset a1=new Asset();    
    a1.setId(3200);    
    a1.setAssetName("ICCU");    
    a1.setServiceTag("1CD5GQ2");    
        
    session.save(a1);  
    x.commit();  
    System.out.println("Asset saved");    
    factory.close();  
    session.close();    
        
}    
} 
