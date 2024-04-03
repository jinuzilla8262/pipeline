package com.example.lab11_final;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DoubleControllerIntegrationTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testDoubleNumberEnd(){
        int inputNumber = 5;
        int expectedDouble = inputNumber *2;

        ResponseEntity<Integer> responseEntity = restTemplate.getForEntity("http://localhost:" + port + "/double?number=" + inputNumber, Integer.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(expectedDouble,responseEntity.getBody());
    }
}