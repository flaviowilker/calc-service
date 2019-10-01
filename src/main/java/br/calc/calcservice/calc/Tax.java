package br.calc.calcservice.calc;

import java.math.BigDecimal;

@FunctionalInterface
public interface Tax {

	BigDecimal calc(BigDecimal value);
	
	static Tax calcIcms() {
		return value -> value.multiply(BigDecimal.valueOf(0.1));
	}
	
	static Tax calcIss() {
		return value -> value.multiply(BigDecimal.valueOf(0.5));
	}
}
