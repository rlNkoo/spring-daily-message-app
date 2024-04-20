package pl.rlnkoo.dailymessageappspringboot.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rlnkoo.dailymessageappspringboot.models.Devotional;
import pl.rlnkoo.dailymessageappspringboot.services.DevotionalService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class DevotionalController {

    private final DevotionalService devotionalService;

    @GetMapping("/devotionals")
    public ResponseEntity<?> getAllDevotionals() {
        List<Devotional> devotionals = devotionalService.getAllDevotions();
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("data", devotionals);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @GetMapping("/devotionals/daily")
    public ResponseEntity<?> getDaily() {
        Optional<Devotional> devotional = devotionalService.getDaily();
        Map<String, Object> map = new HashMap<>();

        if (devotional.isEmpty()) {
            map.put("status", 404);
            map.put("data", null);
        } else {
            map.put("status", 200);
            map.put("data", devotional.get());
        }
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
