package com.izeye.sample.openaiquickstartjava.openapi;

import com.izeye.sample.openaiquickstartjava.AnimalNamingSpec;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link OpenAiApiService}.
 *
 * @author Johnny Lim
 */
@SpringBootTest
class OpenAiApiServiceTests {

    @Autowired
    private OpenAiApiService service;

    @Test
    void createCompletion() {
        CreateCompletionRequest request = new CreateCompletionRequest(
                AnimalNamingSpec.MODEL,
                AnimalNamingSpec.PROMPT_TEMPLATE.formatted("Dog"),
                AnimalNamingSpec.TEMPERATURE);
        CreateCompletionResponse response = this.service.createCompletion(request);
        System.out.println(response);
        assertThat(response.getChoices()).isNotEmpty();
    }

}