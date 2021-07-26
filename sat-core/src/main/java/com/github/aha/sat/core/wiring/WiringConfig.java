package com.github.aha.sat.core.wiring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WiringConfig {

	@Bean
	public Beverage iceTea() {
		return () -> "Ice Tea";
	}

}
