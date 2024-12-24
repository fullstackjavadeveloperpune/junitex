package com.fullstack.controller.test;

import com.fullstack.controller.ArithmeticApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArithmeticApplicationTest {

    ArithmeticApplication arithmeticApplication = new ArithmeticApplication();

    @Test
    public void addTest(){
        Assertions.assertEquals(7, arithmeticApplication.add(4, 3));
    }

    @Test
    public void subTest(){
        Assertions.assertEquals(10, arithmeticApplication.sub(20, 10));
    }
}
