package com.example.lab11_final;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class DoubleControllerTest {

    @Autowired
    private IntegerController controller;

    @Test
    void ContextLoads() throws Exception{
        assertThat(controller).isNotNull();
    }
}
