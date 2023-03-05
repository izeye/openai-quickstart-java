package com.izeye.sample.openaiquickstartjava;

import com.izeye.sample.openaiquickstartjava.openapi.Choice;
import com.izeye.sample.openaiquickstartjava.openapi.CreateCompletionRequest;
import com.izeye.sample.openaiquickstartjava.openapi.OpenAiApiService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Default {@link AnimalNamingService}.
 *
 * @author Johnny Lim
 */
@Service
public class DefaultAnimalNamingService implements AnimalNamingService {

    private final OpenAiApiService openAiApiService;

    public DefaultAnimalNamingService(OpenAiApiService openAiApiService) {
        this.openAiApiService = openAiApiService;
    }

    @Override
    public List<String> generate(String animalType) {
        String prompt = AnimalNamingSpec.PROMPT_TEMPLATE.formatted(StringUtils.capitalize(animalType));
        CreateCompletionRequest request = new CreateCompletionRequest(
                AnimalNamingSpec.MODEL,
                prompt,
                AnimalNamingSpec.TEMPERATURE);
        return this.openAiApiService.createCompletion(request)
                .getChoices()
                .stream()
                .map(Choice::getText)
                .toList();
    }

}
