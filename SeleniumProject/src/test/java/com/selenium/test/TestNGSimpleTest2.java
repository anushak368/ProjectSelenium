package com.selenium.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNGSimpleTest2 {

    @BeforeClass
    public void setup() {
        System.out.println("I am in Setup 2");
    }

    @Test
    public void testDivide() {
        String str = "TestNG is working fine1";
        assertEquals("TestNG is working fine1", str);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("I am in tearDown 2");
    }
}
