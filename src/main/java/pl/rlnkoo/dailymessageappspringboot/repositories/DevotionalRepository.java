package pl.rlnkoo.dailymessageappspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlnkoo.dailymessageappspringboot.models.Devotional;

import java.time.LocalDate;
import java.util.Optional;

public interface DevotionalRepository extends JpaRepository<Devotional, Long> {
    Optional<Devotional> findByPublishedAt(LocalDate date);
}
