package es.sanitas.prueba.lht.calculadora.controller;

import java.math.BigDecimal;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.sanitas.prueba.lht.calculadora.service.impl.CalculatorServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

	@Mock
	private CalculatorServiceImpl calculatorService;
	
	@InjectMocks
	private Calculator calculator;
	
	@Test
	void testOperate_Ok	() {
		Mockito.when(calculatorService.operate(Mockito.any(BigDecimal.class), Mockito.any(BigDecimal.class), Mockito.anyString())).thenReturn(BigDecimal.TEN);
		Assertions.assertEquals(BigDecimal.TEN, calculator.operate(BigDecimal.valueOf(3),BigDecimal.valueOf(7), "sumar"));
	}
}
