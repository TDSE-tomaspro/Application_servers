package org.example.demo;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MicroSpringBootTest {

    @Test
    void shouldExtractControllerNamesIgnoringOptions() {
        List<String> names = MicroSpringBoot.extractControllerNames(new String[]{
                "--port=8080",
                "org.example.demo.HelloController",
                "org.example.demo.GreetingController"
        });

        assertEquals(List.of("org.example.demo.HelloController", "org.example.demo.GreetingController"), names);
    }

    @Test
    void shouldDiscoverAnnotatedControllersFromClasspath() throws Exception {
        Set<Class<?>> controllers = MicroSpringBoot.discoverControllerClasses(List.of());

        assertTrue(controllers.contains(HelloController.class));
        assertTrue(controllers.contains(GreetingController.class));
    }
}