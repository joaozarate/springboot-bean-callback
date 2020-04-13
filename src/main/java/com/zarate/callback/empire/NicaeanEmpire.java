package com.zarate.callback.empire;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component //Can be initialized by @Bean
public class NicaeanEmpire implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Nicaean Empire initialized");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Nicaean Empire destroyed");
	}

}
