package classproject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Band extends Artist {
    @Id
    @SequenceGenerator(name = "band_gen", sequenceName = "band_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "band_gen")
    private Integer numberOfMembers;

}