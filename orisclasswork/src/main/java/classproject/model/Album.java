package classproject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Album {
    @Id
    @SequenceGenerator(name = "album_gen", sequenceName = "album_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "album_gen")
    private Long id;
    private String title;
    private Integer releaseYear;
    @ManyToOne
    private Artist artist;

}
