package org.kontza.liquified;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/stuff")
public class StuffRestController {
    private StuffRepository stuffRepository;

    public StuffRestController(StuffRepository stuffRepository) {
        this.stuffRepository = stuffRepository;
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<List<Stuff>> getStuff() {
        return ResponseEntity.ok(stuffRepository.findAll());
    }
}
