package es.sanitas.prueba.lht.calculadora.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import es.sanitas.prueba.lht.calculadora.functional.FunctionalOperator;
import es.sanitas.prueba.lht.calculadora.service.CalculatorService;
import es.sanitas.prueba.lht.calculadora.exception.MethodNotAllowedException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public BigDecimal operate(BigDecimal o1, BigDecimal o2, String operation) {
		FunctionalOperator operator = getOperator(operation);

		return operator.operate(o1, o2);
	}

	private static FunctionalOperator getOperator(String operation) {
		FunctionalOperator operator = null;
		switch (operation) {
		case "suma":
			operator = (op1, op2) -> op1.add(op2);
			break;
		case "resta":
			operator = (op1, op2) -> op1.subtract(op2);
			break;
		default:
			throw new MethodNotAllowedException();
		}
		return operator;
	}

}
