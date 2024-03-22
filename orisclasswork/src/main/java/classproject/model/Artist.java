package classproject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Artist {
    @Id
    @SequenceGenerator(name = "artist_gen", sequenceName = "artist_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "artist_gen")
    private Long id;
    private String name;
    private String Genre;
}
