package com.vulab.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class VulabApplicationTests {

    // bind the above RANDOM_PORT
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testAPIRespons() throws Exception {

        ResponseEntity<String> response = restTemplate.getForEntity(new URL("http://localhost:" + port + "/api").toString(), String.class);
        assertEquals("Running", response.getBody());

    }

}



