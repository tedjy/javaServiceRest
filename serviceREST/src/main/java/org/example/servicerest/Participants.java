package org.example.servicerest;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Participants {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idParticipants;
    private String nom;
    private String prenom;
    private String adresse;
    private String licence;
    private String club;

}
