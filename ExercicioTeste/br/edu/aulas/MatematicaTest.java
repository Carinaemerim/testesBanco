package br.edu.aulas;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatematicaTest {
	Matematica matematica;

	@Before
	public void setup() {
		matematica = new Matematica();
	}

	@BeforeClass
	public static void testSetup() {
	}

	@AfterClass
	public static void testCleanup() {
		// Limpa os dados usados no Test Case
	}

	@Test(expected = IllegalArgumentException.class)
	public void testaOLancamentoDaExcecao() {
		matematica.multiplica(1000, 5);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testa0LancamentoDaExcecao(){
		try{
			matematica.multiplica(1000, 5);	
		}catch (IllegalArgumentException e){
			assertEquals ("mensagem de erro","X deve ser menor que 1000", e.getMessage());
			throw e;
		}
		
	}

	@Test
	public void testMultiplica() {
		assertEquals(" 10 x 5 deve ser 50", 50, matematica.multiplica(10, 5));
	}
	
	@Test
	public void testMultiplicaNegativo() {
		assertEquals(" 10 x -5 deve ser -50", -50, matematica.multiplica(10, -5));
	}
	
	@Test
	public void testMultiplicaZero() {
		assertEquals(" 10 x 0 deve ser 0", 0, matematica.multiplica(10, 0));
	}
	
	@Test
	public void testMultiplicaDoisNegativos(){
		assertEquals(" (-10) x (-5) deve ser 50", 50, matematica.multiplica(-10, -5));
		
	}
	
	@Test
	public void testSoma(){
		assertEquals (" 10 + 5 deve ser 15", 15, matematica.soma(10, 5));
		
	}
	
	@Test
	public void testSomaNegativo(){
		assertEquals (" 10 + (-5) deve ser 5", 5, matematica.soma(10, -5));
		
	}
	
	@Test
	public void testSomaDoisNegativos(){
		assertEquals (" (-10) + (-5) deve ser -15", -15, matematica.soma(-10, -5));
		
	}
	
	@Test
	public void testSomaNull(){
		assertEquals (" 10 + null deve ser 10", 10, matematica.soma(10, null));
		
	}
	
	public void testSomaDoisNull(){
		assertEquals (" null + null deve ser null", null, matematica.soma(null, null));
		
	}
	
	@Test
	public void testSubtracao(){
		assertEquals (" 10 - 5 deve ser 5", 5, matematica.subtracao(10, 5));
		
	}
	
	public void testSubtracaonegativo(){
		assertEquals (" 10 - 15 deve ser -5", -5, matematica.subtracao(10, -15));
		
	}
	
	public void testSubtracaoDoisnegativos(){
		assertEquals (" -10 - (-15) deve ser 5", 5, matematica.subtracao(-10, -15));
		
	}
	
	public void testSubtracaoNull(){
		assertEquals (" 10 - null deve ser 10", 10, matematica.subtracao(10, null));
		
	}
	
	public void testSubtracaoDoisNull(){
		assertEquals (" 10 - null deve ser 10", 10, matematica.subtracao(10, null));
		
	}
	
	
	
	
}