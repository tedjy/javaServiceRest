package org.example.servicerest.controller;

import org.example.servicerest.Participants;
import org.example.servicerest.repository.ParticipantsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/participants")
public class ParticipantsController {
    private final ParticipantsRepository participantsRepository;

    public ParticipantsController(ParticipantsRepository participantsRepository) {
        this.participantsRepository = participantsRepository;
    }

    @GetMapping
    public Iterable<Participants> getAllCourses()
    {
       return participantsRepository.findAll();
    }
}
