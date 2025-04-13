package com.estsoft.demo;

import org.junit.jupiter.api.*;

import java.sql.SQLOutput;

public class JUnitTotalTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach");
    }

    @Test
    public void test() {
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    @AfterAll
    public static void afterALl() {
        System.out.println("@AfterAll");
    }
}
