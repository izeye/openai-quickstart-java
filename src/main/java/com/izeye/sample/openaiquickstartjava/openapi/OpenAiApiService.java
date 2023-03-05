package com.izeye.sample.openaiquickstartjava.openapi;

/**
 * Service for OpenAI APIs.
 *
 * @author Johnny Lim
 */
public interface OpenAiApiService {

    CreateCompletionResponse createCompletion(CreateCompletionRequest request);

}
