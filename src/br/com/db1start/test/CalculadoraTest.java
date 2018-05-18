package br.com.db1start.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1start.classe.Calculadora;

public class CalculadoraTest {

	private Calculadora calculadora = new Calculadora();

	@Before
	public void init() {

		calculadora.setValor1(23d);
		calculadora.setValor2(2d);
		Assert.assertTrue(calculadora.getValor2() == 2);
		Assert.assertTrue(calculadora.getValor1() == 23);
	}
	
	@After
	public void finaliza() {
		System.out.println("Teste Finalizado");
	}

	@Test
	public void somarTest() {

		Assert.assertTrue(25 == calculadora.somar());
	}

	@Test
	public void multiplicarTest() {
		Assert.assertTrue(46 == calculadora.multiplicar());
	}

	@Test
	public void subtrairTest() {
		Assert.assertTrue(21 == calculadora.subtrair());
	}

	@Test
	public void dividir() {
		Assert.assertTrue(11.5 == calculadora.dividir());
	}
	
	@Test
	public void zerarTest() {
		calculadora.zerar();
		Assert.assertTrue(0 == calculadora.getValor1());
		Assert.assertTrue(0 == calculadora.getValor2());
	}

}
