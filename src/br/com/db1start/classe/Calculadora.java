package br.com.db1start.classe;

public class Calculadora {

	private Double valor1 = 0d;
	private Double valor2 = 0d;

	public Calculadora() {
		
	}
	
	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public Double somar() {
		Double somar;
		
		somar = valor1+valor2;
		return somar;
	}

	public Double multiplicar() {
		Double multiplicar;
		multiplicar = valor1*valor2;
		
		return multiplicar;
	}

	public Double subtrair() {
		Double subtrair;
		subtrair = valor1 - valor2;
		
		return subtrair;
	}

	public Double dividir() {
		Double divisao;
		divisao = valor1 / valor2;
		return divisao;
	}

	public void zerar() {
		valor1 = 0d;
		valor2 = 0d;
		
	}

}
