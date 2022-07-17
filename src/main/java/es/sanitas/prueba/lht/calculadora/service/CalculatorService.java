package es.sanitas.prueba.lht.calculadora.service;

import java.math.BigDecimal;

public interface CalculatorService {
	
	public BigDecimal operate(BigDecimal o1, BigDecimal o2, String operation);
}
