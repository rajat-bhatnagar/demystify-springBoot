package com.thoughtworks.boot.controller;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.thoughtworks.boot.controller.HomeController;


public class AppTest {
	@Test
    public void testApp()
    {
		HomeController homeController = new HomeController();
		String result = homeController.home();
		assertEquals(result, "Spring Boot, Reporting for duty");
    }
}
