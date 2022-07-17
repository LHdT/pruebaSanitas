package es.sanitas.prueba.lht.calculadora.controller;

import java.math.BigDecimal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.sanitas.prueba.lht.calculadora.service.CalculatorService;

@RestController
@RequestMapping("/api/v1")
public class Calculator {
	
//	injected property
	private final CalculatorService calculatorService;
	
	/**
	 * dependency injection by constructor
	 * @param calculatorService
	 */
	public Calculator(CalculatorService calculatorService) {
		this.calculatorService=calculatorService;
	}

	/**
	 * Endpoint to execute calculator
	 * @param o1 operand 1
	 * @param o2 operand 2
	 * @param operation type of operation
	 * @return it returns the result of the operation
	 */
	@GetMapping("/calculadora/{operation}")
	@ResponseStatus(HttpStatus.OK)
	public BigDecimal operate(@RequestParam("p1") BigDecimal o1,@RequestParam("p2")BigDecimal o2,@PathVariable("operation") String operation) {
		return calculatorService.operate(o1, o2, operation);
	}
}
