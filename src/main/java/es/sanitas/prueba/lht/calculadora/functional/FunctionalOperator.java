package es.sanitas.prueba.lht.calculadora.functional;

import java.math.BigDecimal;

/**
 * Functional interface to allow different implementation of the method operate
 * 
 * @author luish
 *
 */
@FunctionalInterface
public interface FunctionalOperator {
	/**
	 * operator method
	 * 
	 * @param o1 operand 1
	 * @param o2 operand 2
	 * @return it return the result of the operation
	 */
	public BigDecimal operate(BigDecimal o1, BigDecimal o2);
}
