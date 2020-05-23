package com.upis.strategy.project;

public class TesteCalculadora {

	public static void main(String[] args) {
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		ICMS icms = new ICMS(100.0);
		IPI ipi = new IPI(100.0);
		System.out.println(calculadora.calcular(icms));
		System.out.println(calculadora.calcular(ipi));

	}

}
