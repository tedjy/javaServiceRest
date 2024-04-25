package org.example.servicerest.controller;

import org.example.servicerest.repository.InscriptionRepository;
import org.example.servicerest.Inscriptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscriptions")
public class InscriptionController {

    @Autowired
    private InscriptionRepository inscriptionsRepository;

    // Create
    @PostMapping
    public Inscriptions createInscription(@RequestBody Inscriptions inscription) {
        return inscriptionsRepository.save(inscription);
    }

    // Read
    @GetMapping
    public List<Inscriptions> getAllInscriptions() {
        return inscriptionsRepository.findAll();
    }

    // Update
    @PutMapping("/{id}")
    public Inscriptions updateInscription(@PathVariable Long id, @RequestBody Inscriptions inscription) {
        return inscriptionsRepository.findById(id)
                .map(existingInscription -> {
                    existingInscription.setChrono(inscription.getChrono());
                    existingInscription.setStatutInscription(inscription.getStatutInscription());
                    existingInscription.setTagRFID(inscription.getTagRFID());
                    existingInscription.setNumeroDossard(inscription.getNumeroDossard());
                    return inscriptionsRepository.save(existingInscription);
                })
                .orElseThrow();
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteInscription(@PathVariable Long id) {
        inscriptionsRepository.deleteById(id);
    }
}
