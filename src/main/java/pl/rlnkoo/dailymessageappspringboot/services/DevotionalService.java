package pl.rlnkoo.dailymessageappspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.rlnkoo.dailymessageappspringboot.models.Devotional;
import pl.rlnkoo.dailymessageappspringboot.repositories.DevotionalRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DevotionalService {

    private final DevotionalRepository devotionalRepository;

    public Optional<Devotional> getDaily(){
        LocalDate today = LocalDate.now();

        return devotionalRepository.findByPublishedAt(today);
    }

    public List<Devotional> getAllDevotions() {
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
