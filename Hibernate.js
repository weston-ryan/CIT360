/*
 * Ryan Weston - CIT 360
 * Hibernate attempt
 * Yes... it made me want to go hibernate like a bear!  ;) 
 */
package hibernate;

/**
 *
 * @author westo
 */
public interface Hibernate {

    /**
     * here it will save new or changed Assets
     * This is based on my actual work keeping track of computers
     * using an "Asset Tag ID".  I hope I am on the right track.
     * @param ID
     * @return 
     */
    computer AssetIdImp(Long ID);
    computer getAssetById(String Name);
    computer getAssetByTitle(String Title);
    Computer SaveAsset(Asset b);
    void deleteAsset(Asset b);
    
         // Implement the Computer Asset interface.
        public class AssetIdImpl implements AssetRepository {
 
    private EntityManager em;
     
    public AssetIdImpl(EntityManager em) {
        this.em = em;
    }
    // get the asset by asset ID
    public Asset getAssetById(Long id) {
        return em.find(Asset.class, id);
    } 
    // get the asset by title (the department title)
    // I tried using a for asset below, but it was too confusing so I used "b"
    public Asset getAssetByTitle(String title) {
        TypedQuery<Asset> b = em.createQuery("SELECT b FROM Asset b WHERE b.title = :title", Asset.class);
        b.setParameter("title", title);
        return b.getSingleResult();
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
    // if the asset is no longer needed, then delete the asset
    public void deleteAsset(Asset b) {
        if (em.contains(b)) {
            em.remove(b);
        } else {
            em.merge(b);
        }
    }
    }
}
