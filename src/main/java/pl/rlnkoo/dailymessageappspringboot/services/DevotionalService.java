package pl.rlnkoo.dailymessageappspringboot.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;



import lombok.AllArgsConstructor;
import pl.rlnkoo.dailymessageappspringboot.models.Devotional;
import pl.rlnkoo.dailymessageappspringboot.repositories.DevotionalRepository;

@Service
@AllArgsConstructor
public class DevotionalService {

    private final DevotionalRepository devotionalRepository;

    public Optional<Devotional> getDaily() {
        LocalDate today = LocalDate.now();
        return devotionalRepository.findByPublishedAt(today);
    }

    public List<Devotional> getAllDailies() {
        return devotionalRepository.findAll();
    }

    public Devotional save(Devotional devotional) {
        if (devotional.getId() == null) {
            devotional.setCreatedAt(LocalDateTime.now());
        }

        devotional.setUpdatedAt(LocalDateTime.now());
        return devotionalRepository.save(devotional);
    }

}