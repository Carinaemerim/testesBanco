package br.edu.aulas;

public class Matematica {

	public int multiplica(int x, int y) {
		// O que segue é apenas um exemplo
		if (x > 999) {
			throw new IllegalArgumentException("X deve ser menor que 1000");
		}
		return x * y;
	}
	
	public int soma(Integer x, Integer y) {

		if (x > 999) {
			throw new IllegalArgumentException("X deve ser menor que 1000");
		}
		return x + y;
	}
	
	public int subtracao(Integer x, Integer y) {
		
		if (x > 999) {
			throw new IllegalArgumentException("X deve ser menor que 1000");
		}
		return x - y;
	}
	
	public int divisao(int x, int y) {

		if (y > 0) {
			throw new RuntimeException("X deve ser maior que 0");
		}
		return x / y;
	}
	
}
