/*
 * Ryan Weston - CIT 360
 * Hibernate attempt
 * Yes... it made me want to go hibernate like a bear!  ;) 
 */

package hibernate;

public class Hibernate {

    /**
     * here it will save new or changed Assets
     * This is based on my actual work keeping track of computers
     * using an "Asset Tag ID".  I hope I am on the right track.
     */
    
    computer assetIdImp(Long ID);
    computer getAssetById(String Name);
    computer getAssetByTitle(String Title);
    Computer saveAsset(Asset b);
    void deleteAsset(Asset b);
    
         // Implement the Computer Asset interface.
        public class AssetIdImpl implements AssetRepository {
 
    private EntityManager em;
     
    public AssetIdImpl(EntityManager em) {
        Integer assetId1 = em.addAsset("Workstations", 1001);
        Integer assetId2 = em.addAsset("Sales", 1002);
        Integer assetId3 = em.addAsset("DataCenter", 1003);
        
        //list all records for assets
        em.listAsset();
        //update a record
        em.updateAsset(assetId2, 1051);
        //delete an asset from the database
        em.deleteAsset(assetId3);
        //create new list of assets
        em.listAsset();
        this.em = em;
    }
    // get the asset by asset ID
    public Asset getAssetById(Long id) {
        return em.find(Asset.class, id);
    } 
    // get the asset by title (the department title)
    // I tried using a for asset below, but it was too confusing so I used "b"
    public Asset getAssetByTitle(String title) {
        TypedQuery<Asset> a = em.createQuery("SELECT b FROM Asset b WHERE b.title = :title", Asset.class);
        a.setParameter("title", title);
        return a.getSingleResult();
    }
    // Save the asset
    public Asset saveAsset(Asset b) {
        if (b.getId() == null) {
            em.persist(b);
        } else {
            b = em.merge(b);
        }
        return b;
    }
    // if the asset is no longer needed, then the method to delete the asset
    public void deleteAsset(Asset b) {
        if (em.contains(b)) {
            em.remove(b);
        } else {
            em.merge(b);
        }
    }
    }
}
