package tn.esprit.spring.entity;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Slf4j
@Service
@Table(name = "DetailEquipe")
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetailEquipe")
    private int idDetailEquipe;
    private int salle;
    private String thematique;
    @OneToOne(mappedBy="detailEquipe")
    private Equipe equipe;
}
