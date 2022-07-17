package es.sanitas.prueba.lht.calculadora.service;

import java.math.BigDecimal;

/**
 * Service encourage of operate operands
 * @author luish
 *
 */
public interface CalculatorService {
	/**
	 * this method operates both operands
	 * @param o1        operand 1
	 * @param o2        operand 2
	 * @param operation type of operation
	 * @return
	 */
	public BigDecimal operate(BigDecimal o1, BigDecimal o2, String operation);
}
