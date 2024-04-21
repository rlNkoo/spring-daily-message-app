package pl.rlnkoo.dailymessageappspringboot;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.rlnkoo.dailymessageappspringboot.models.Devotional;
import pl.rlnkoo.dailymessageappspringboot.repositories.DevotionalRepository;
import pl.rlnkoo.dailymessageappspringboot.services.DevotionalService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class DevotionalServiceTest {

    @Autowired
    private DevotionalService service;

    @Autowired
    private DevotionalRepository repository;

    @Test
    @DisplayName("find a given Devotional by its Id")
    void findATodoItemById() {
        // find a specific TodoItem by its id
        Devotional devo = new Devotional();
        devo.setQuote("foo");
        devo.setAuthor("bar");
        devo.setContent("test");

        devo = service.save(devo);

        Optional<Devotional> testItem = repository.findById(devo.getId());
        assertEquals(testItem.isPresent(), true);
        assertEquals(testItem.get().getId(), devo.getId());
    }


    @Test
    @DisplayName("saving a valid Devotional succeeds")
    void savingAValidDevotionalSucceeds() {
        Devotional item = new Devotional();
        item.setContent("todo item1");

        item = service.save(item);
        assertNotEquals(item.getId(), null);
    }


}