package com.izeye.sample.openaiquickstartjava;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link AnimalNamingApiController}.
 *
 * @author Johnny Lim
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AnimalNamingApiControllerTests {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void generate() {
        String animal = "dog";
        List<String> responseBody = this.webTestClient.get()
                .uri("/api/generate?animal={animal}", animal)
                .exchange()
                .expectBody(new ParameterizedTypeReference<List<String>>() {})
                .value((v) -> assertThat(v).isNotEmpty())
                .returnResult()
                .getResponseBody();
        System.out.println(responseBody);
    }

}
