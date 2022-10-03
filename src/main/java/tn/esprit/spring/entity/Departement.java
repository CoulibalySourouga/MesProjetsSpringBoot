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
@Table(name = "Departement")
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepart")
    private int idDepart;
    private  String nomDepart;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="departement")
    private Set<Etudiant> etudiants;
}
