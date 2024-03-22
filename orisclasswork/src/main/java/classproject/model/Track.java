package classproject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Track {
    @Id
    @SequenceGenerator(name = "track_gen", sequenceName = "track_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "track_gen")
    private Long id;
    private String title;
    private Integer duration;

    @ManyToOne
    private Album album;
}