package com.izeye.sample.openaiquickstartjava.openapi;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * {@link ConfigurationProperties} for {@link OpenAiApiService}.
 *
 * @author Johnny Lim
 */
@ConfigurationProperties("openai-api")
public class OpenAiApiProperties {

    private final String apiKey;

    public OpenAiApiProperties(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

}
