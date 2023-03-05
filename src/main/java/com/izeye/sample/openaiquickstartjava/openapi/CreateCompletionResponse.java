package com.izeye.sample.openaiquickstartjava.openapi;

import java.util.List;

/**
 * Response for created completions.
 *
 * @author Johnny Lim
 */
public class CreateCompletionResponse {

    private List<Choice> choices;

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    @Override
    public String toString() {
        return "CreateCompletionResponse{" +
                "choices=" + choices +
                '}';
    }

}
