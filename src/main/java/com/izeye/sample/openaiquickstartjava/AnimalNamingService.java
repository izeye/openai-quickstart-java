package com.izeye.sample.openaiquickstartjava;

import java.util.List;

/**
 * Service for animal naming.
 *
 * @author Johnny Lim
 */
public interface AnimalNamingService {

    List<String> generate(String animalType);

}
