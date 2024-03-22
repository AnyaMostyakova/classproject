package classproject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class SoloArtist extends Artist {
    @Id
    @SequenceGenerator(name = "soloArtist_gen", sequenceName = "soloArtist_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "soloArtist_gen")
    private String instrument;

}