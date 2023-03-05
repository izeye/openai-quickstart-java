package com.izeye.sample.openaiquickstartjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * {@link RestController} for animal naming.
 *
 * @author Johnny Lim
 */
@RestController
@RequestMapping("/api")
public class AnimalNamingApiController {

    private final AnimalNamingService service;

    public AnimalNamingApiController(AnimalNamingService service) {
        this.service = service;
    }

    @GetMapping("/generate")
    public List<String> generate(@RequestParam String animal) {
        return this.service.generate(animal);
    }

}
