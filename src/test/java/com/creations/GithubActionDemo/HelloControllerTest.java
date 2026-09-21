package com.creations.GithubActionDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {
    @Test
    void shouldReturnHelloMessage() {

        HelloController controller = new HelloController();

        String result = controller.hello();

        assertEquals(
                "Hello from Jyoti Sharma! Welcome back.",
                result
        );
    }
}
