package tn.esprit.spring.entity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name ="Etudiant")
@Slf4j
@Service
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated
    Option opt;
    @GeneratedValue
    @Temporal(TemporalType.DATE)
    Date d;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
    private Set<Contrat> contrat;
    @ManyToOne
    Departement departement;
    @ManyToMany(mappedBy="etudiants", cascade = CascadeType.ALL)
    private Set<Equipe> equipes;

// Constructeur et accesseurs (getters) et mutateurs (setters)


    public Etudiant() {
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }
}
