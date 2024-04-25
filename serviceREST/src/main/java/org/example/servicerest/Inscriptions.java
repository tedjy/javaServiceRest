package org.example.servicerest;

import jakarta.persistence.*;
import org.springframework.data.jdbc.core.JdbcAggregateOperations;

@Entity
@Table(name = "Inscriptions") // Remplacez <nom_de_table> par le
public class Inscriptions
{
    public static JdbcAggregateOperations wssRepository;

    @Id
    @Column(name = "idinscriptions") // Assurez-vous que le nom de la colonne correspond à votre champ de base de données
    private Long idInscriptions;

    public Long getIdInscriptions() {
        return idInscriptions;
    }

    public void setIdInscriptions(Long id) {
        this.idInscriptions = idInscriptions;
    }

    @Column(name = "idparticipant")
    private Long idParticipant;

    public Long getIdParticipant() {
        return idParticipant;
    }

    public void setIdParticipant(Long idParticipant) {
        this.idParticipant = idParticipant;
    }

    @Column(name = "idcourse")
    private Long idCourse;

    public Long getIdCourse() {
        return idCourse;
    }
    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }
    @Column(name = "chrono")
    private int chrono;

    public int getChrono() {
        return chrono;
    }

    public void setChrono(int chrono) {
        this.chrono = chrono;
    }
    @Column(name = "statutinscription")
    private int statutInscription;

    public int getStatutInscription() {
        return statutInscription;
    }

    public void setStatutInscription(int statutInscription) {
        this.statutInscription = statutInscription;
    }

    @Column(name = "tagrfid")
    private String tagRFID;

    public String getTagRFID() {
        return tagRFID;
    }
    public void setTagRFID(String tagRFID) {
        this.tagRFID = this.tagRFID;
    }

    @Column(name = "numerodossard")
    private int numeroDossard;

    public int getNumeroDossard() {
        return numeroDossard;
    }
    public void setNumeroDossard(int numeroDossard) {
        this.numeroDossard = this.numeroDossard;
    }
}
