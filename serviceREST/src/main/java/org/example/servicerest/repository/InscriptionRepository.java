package org.example.servicerest.repository;

import org.example.servicerest.Inscriptions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscriptions, Long> {
}
