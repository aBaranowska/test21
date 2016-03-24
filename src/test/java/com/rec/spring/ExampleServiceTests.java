package com.rec.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ExampleServiceTests {

	private ApplicationContext context;

	@Before
	public void setUp() {
		context = new AnnotationConfigApplicationContext(AppConfig.class);
	}

	@After
	public void tearDown() {
		((AbstractApplicationContext) context).close();
	}

	@Test(expected = NullPointerException.class)
	public void getBean() {
		Foo bean = context.getBean(Foo.class);
		bean.getMessage();
	}

}
