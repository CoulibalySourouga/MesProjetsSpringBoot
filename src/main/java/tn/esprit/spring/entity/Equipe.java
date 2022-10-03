package tn.esprit.spring.entity;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Slf4j
@Service
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipe")
    private int idEquipe;
    private String nomEquipe;
    @Enumerated
    Niveau niveau;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
    @OneToOne
    private DetailEquipe detailEquipe;
}
