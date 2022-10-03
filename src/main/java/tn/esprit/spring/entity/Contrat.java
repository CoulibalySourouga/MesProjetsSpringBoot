package tn.esprit.spring.entity;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Slf4j
@Service
@Table( name ="Contrat")
public class Contrat implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private int idContrat;
    private int montantContrat;
    private boolean archive;
    @Enumerated
    Specialite specialite;
    @GeneratedValue
    @Temporal(TemporalType.DATE)
    Date dateDebutContrat;
    Date dateFinContrat;
    @ManyToOne
    Etudiant etudiant;

}
