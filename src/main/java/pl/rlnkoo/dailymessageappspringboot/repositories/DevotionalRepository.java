package pl.rlnkoo.dailymessageappspringboot.repositories;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlnkoo.dailymessageappspringboot.models.Devotional;


public interface DevotionalRepository extends JpaRepository<Devotional, Long> {

    Optional<Devotional> findByPublishedAt(LocalDate date);

    Optional<Devotional> findById(Integer id);
}