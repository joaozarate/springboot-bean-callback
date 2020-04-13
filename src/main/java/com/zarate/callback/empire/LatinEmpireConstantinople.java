package com.zarate.callback.empire;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class LatinEmpireConstantinople {

	@PostConstruct
	public void init() {
		System.out.println("Latin Empire of Constantinople initialized");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Latin Empire of Constantinople destroyed");
	}

}
