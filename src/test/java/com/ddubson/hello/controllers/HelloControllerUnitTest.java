package com.ddubson.hello.controllers;

import org.junit.Test;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.Assert.assertEquals;

public class HelloControllerUnitTest {
	@Test
	public void sayHello_shouldReturn() {
		HelloController controller = new HelloController();
		String result = controller.sayHello("Bee", new BindingAwareModelMap());
		assertEquals("hello", result);
	}
}