package com.zarate.callback.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zarate.callback.empire.ByzantineEmpire;

@Configuration
public class ByzantineEmpireConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public ByzantineEmpire byzantineEmpire() {
		return new ByzantineEmpire();
	}

}
