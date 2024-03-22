package classproject.repository;

import classproject.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class BandRepository {

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager entityManager;

    public Artist save(Artist band) {
        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        if (band.getId() != null) {
            entityManager.merge(band);
        } else {
            entityManager.persist(band);
        }
        entityManager.getTransaction().commit();
        entityManager.close();


        return band;
    }

}