package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class tests {

    @Test
    public void testHomeController() {
        Controller homeController = new Controller();
        String result = homeController.par1();
        assertEquals(result, "Hello World!");
    }
    @Test
    public void testHomeController2() {
        Controller homeController = new Controller();
        String result = homeController.par2();
        assertEquals(result, "123");
    }
    @Test
    public void testHomeController3() {
        Controller homeController = new Controller();
        String result = homeController.par3();
        assertEquals(result, "No?!");
    }

}
