package com.izeye.sample.openaiquickstartjava.openapi;

/**
 * Request to create completions.
 *
 * @author Johnny Lim
 */
public class CreateCompletionRequest {

    private final String model;
    private final String prompt;
    private final double temperature;

    public CreateCompletionRequest(String model, String prompt, double temperature) {
        this.model = model;
        this.prompt = prompt;
        this.temperature = temperature;
    }

    public String getModel() {
        return model;
    }

    public String getPrompt() {
        return prompt;
    }

    public double getTemperature() {
        return temperature;
    }

}
