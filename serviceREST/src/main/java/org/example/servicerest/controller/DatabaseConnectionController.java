package org.example.servicerest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DatabaseConnectionController {

    private final JdbcTemplate jdbcTemplate;

    public DatabaseConnectionController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Map<String, Object>> getInscriptions() {
        String inscription = "SELECT * FROM inscriptions";
        return jdbcTemplate.queryForList(inscription);
    }
    @GetMapping("/bdd")
    public ResponseEntity<String> test() {
        try {
            String inscription = "SELECT * FROM inscriptions";
            List<Map<String, Object>> resultsInscription = jdbcTemplate.queryForList(inscription);
            String courses = "SELECT * FROM courses";
            List<Map<String, Object>> resultsCourses = jdbcTemplate.queryForList(courses);
            return ResponseEntity.ok("Test de connexion à la base de données réussi !" + resultsInscription + "\n\t" + resultsCourses);
        }  catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erreur lors de la connexion à la base de données : " + e.getMessage());
        }
    }
}
