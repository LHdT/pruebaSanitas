package es.sanitas.prueba.lht.calculadora.service.impl;

import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import es.sanitas.prueba.lht.calculadora.exception.MethodNotAllowedException;

public class CalculatorServiceImplTest {

	private static CalculatorServiceImpl calculatorService;
	
	@BeforeAll
	static void setup(){
		calculatorService=new CalculatorServiceImpl();
	}
	
	@Test
	void testOperate_SumaOK(){
		BigDecimal operationResult = calculatorService.operate(BigDecimal.valueOf(3), BigDecimal.valueOf(7), "suma");
		Assertions.assertEquals(BigDecimal.valueOf(10),operationResult);
		
	}
	
	@Test
	void testOperate_RestaOK(){
		BigDecimal operationResult = calculatorService.operate(BigDecimal.valueOf(3), BigDecimal.valueOf(7), "resta");
		Assertions.assertEquals(BigDecimal.valueOf(-4),operationResult);
		
	}
	
	@Test
	void testOperate_MethodNotAllowed(){
		Assertions.assertThrows(MethodNotAllowedException.class,()->{
			
			calculatorService.operate(BigDecimal.valueOf(3), BigDecimal.valueOf(7), "asdf");
		});
				
		
	}
	
}
