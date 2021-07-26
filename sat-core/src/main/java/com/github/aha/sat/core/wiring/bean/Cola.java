package com.github.aha.sat.core.wiring.bean;

import org.springframework.stereotype.Component;

import com.github.aha.sat.core.wiring.AbstractCarbonatedBeverage;

@Component
public class Cola extends AbstractCarbonatedBeverage {

	@Override
	public String getName() {
		return "Cola";
	}

}
