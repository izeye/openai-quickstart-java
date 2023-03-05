package com.izeye.sample.openaiquickstartjava.openapi;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Default {@link OpenAiApiService}.
 *
 * @author Johnny Lim
 */
@Service
public class DefaultOpenAiApiService implements OpenAiApiService {

    private static final String URL_COMPLETIONS = "https://api.openai.com/v1/completions";

    private final OpenAiApiProperties properties;
    private final WebClient webClient;

    public DefaultOpenAiApiService(OpenAiApiProperties properties, WebClient.Builder webClientBuilder) {
        this.properties = properties;
        this.webClient = webClientBuilder.build();
    }

    @Override
    public CreateCompletionResponse createCompletion(CreateCompletionRequest request) {
        return this.webClient.post()
                .uri(URL_COMPLETIONS)
                .headers((headers) -> headers.setBearerAuth(this.properties.getApiKey()))
                .bodyValue(request)
                .retrieve()
                .bodyToMono(CreateCompletionResponse.class)
                .block();
    }

}
