package br.calc.calcservice.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.calc.calcservice.calc.Tax;

@RestController
@RequestMapping("/calc")
public class TaxController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TaxController.class);
	
	@GetMapping("/icms/{value}")
    public BigDecimal calcIcms(@PathVariable("value") BigDecimal value) {
		
		BigDecimal result = Tax.calcIcms().calc(value);
		
        LOGGER.info("ICMS: "+ result);
        return result;
    }
    
	@GetMapping("/iss/{value}")
    public BigDecimal calcIss(@PathVariable("value") BigDecimal value) {
		
		BigDecimal result = Tax.calcIss().calc(value);
		
        LOGGER.info("ISS: "+ result);
        return result;
    }
}
