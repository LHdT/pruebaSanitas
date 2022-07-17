package es.sanitas.prueba.lht.calculadora.functional;

import java.math.BigDecimal;

@FunctionalInterface
public interface FunctionalOperator {
	public BigDecimal operate(BigDecimal o1,BigDecimal o2);
}
