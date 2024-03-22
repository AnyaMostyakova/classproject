package classproject.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import classproject.model.Track;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class TrackRepository {

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager entityManager;

    public Track save(Track track) {
        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(track);
        entityManager.getTransaction().commit();
        entityManager.close();
        return track;
    }
}
