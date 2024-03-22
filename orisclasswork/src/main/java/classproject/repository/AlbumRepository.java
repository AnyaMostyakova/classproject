package classproject.repository;

import classproject.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class AlbumRepository {
    @Autowired
    private EntityManagerFactory emf;

    private EntityManager entityManager;

    public Album save(Album album) {
        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        if (album.getId() != null) {
            entityManager.merge(album);
        } else {
            entityManager.persist(album);
        }
        entityManager.getTransaction().commit();
        entityManager.close();

        return album;
    }
}
