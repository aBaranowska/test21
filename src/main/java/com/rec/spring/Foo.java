package com.rec.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Foo {

	@Autowired(required = false)
	private Service service;

	public String getMessage() {
		return service.getMessage();
	}

}
