package com.izeye.sample.openaiquickstartjava;

import com.izeye.sample.openaiquickstartjava.openapi.Models;

/**
 * Specification for animal naming.
 *
 * @author Johnny Lim
 */
public final class AnimalNamingSpec {

    /**
     * Model.
     */
    public static final String MODEL = Models.TEXT_DAVINCI_003;

    /**
     * Prompt.
     */
    public static final String PROMPT_TEMPLATE = """
Suggest three names for an animal that is a superhero.

Animal: Cat
Names: Captain Sharpclaw, Agent Fluffball, The Incredible Feline
Animal: Dog
Names: Ruff the Protector, Wonder Canine, Sir Barks-a-Lot
Animal: %s
Names:
                """;

    /**
     * Temperature.
     */
    public static final double TEMPERATURE = 0.6;

}
