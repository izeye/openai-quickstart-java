package com.izeye.sample.openaiquickstartjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * OpenAI API Quickstart - Java example app.
 *
 * This is a Java-variant of the <a href="https://github.com/openai/openai-quickstart-node">Node.js example app</a>.
 *
 * @author Johnny Lim
 */
@SpringBootApplication
@ConfigurationPropertiesScan
public class OpenaiQuickstartJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenaiQuickstartJavaApplication.class, args);
	}

}
