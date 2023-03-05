package com.izeye.sample.openaiquickstartjava;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link AnimalNamingService}.
 *
 * @author Johnny Lim
 */
@SpringBootTest
class AnimalNamingServiceTests {

    @Autowired
    private AnimalNamingService service;

    @Test
    void generate() {
        List<String> names = this.service.generate("dog");
        System.out.println(names);
        assertThat(names).isNotEmpty();
    }

}