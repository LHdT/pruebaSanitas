package es.sanitas.prueba.lht.calculadora.controller;

import java.math.BigDecimal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.sanitas.prueba.lht.calculadora.service.CalculatorService;
import lombok.RequiredArgsConstructor;

@RestController("api/v1")
@RequiredArgsConstructor
public class Calculator {
	
	private final CalculatorService calculatorService;

	@GetMapping("calculadora/{operation}")
	@ResponseStatus(HttpStatus.OK)
	public BigDecimal operate(BigDecimal o1,BigDecimal o2,@PathVariable("operation") String operation) {
		return null;
	}
}
