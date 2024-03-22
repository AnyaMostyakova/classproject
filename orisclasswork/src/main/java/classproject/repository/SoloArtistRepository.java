package classproject.repository;


import classproject.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class SoloArtistRepository {

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager entityManager;

    public Artist save(Artist soloArtist) {
        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        if (soloArtist.getId() != null) {
            entityManager.merge(soloArtist);
        } else {
            entityManager.persist(soloArtist);
        }
        entityManager.getTransaction().commit();
        entityManager.close();

        return soloArtist;
    }
}