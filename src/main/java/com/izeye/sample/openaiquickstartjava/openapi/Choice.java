package com.izeye.sample.openaiquickstartjava.openapi;

/**
 * Choice.
 *
 * @author Johnny Lim
 */
public class Choice {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Choice{" +
                "text='" + text + '\'' +
                '}';
    }

}
