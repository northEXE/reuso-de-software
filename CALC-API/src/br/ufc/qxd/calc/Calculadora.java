package br.ufc.qxd.calc;

import java.util.Scanner;

public class Calculadora {
	Scanner s = new Scanner(System.in);

	public void soma() {
		Double valor1 = 0.0, valor2 = 0.0, resp = 0.0;
		System.out.println("Você escolheu somar!! Digite os dois valores: \n");
		valor1 = s.nextDouble();
		valor2 = s.nextDouble();
		resp = valor1 + valor2;
		System.out.println("O resultado é: " + resp);
	}

	public void subtracao() {
		Double valor1 = 0.0, valor2 = 0.0, resp = 0.0;
		System.out.println("Você escolheu subtrair!! Digite os dois valores: \n");
		valor1 = s.nextDouble();
		valor2 = s.nextDouble();
		resp = valor1 - valor2;
		System.out.println("O resultado é: " + resp);
	}

	public void multiplicar() {
		Double valor1 = 0.0, valor2 = 0.0, resp = 0.0;
		System.out.println("Você escolheu multiplicar!! Digite os dois valores: \n");
		valor1 = s.nextDouble();
		valor2 = s.nextDouble();
		resp = valor1 * valor2;
		System.out.println("O resultado é: " + resp);
	}

	public void dividir() {
		Double valor1 = 0.0, valor2 = -999.0, resp = 0.0, resto = 0.0;
		System.out.println("Você escolheu dividir!! Digite os dois valores: \n");
		valor1 = s.nextDouble();
		valor2 = s.nextDouble();
		if (valor2 != 0) {
			resp = valor1 / valor2;
			resto = valor1 % valor2;
			System.out.println("O resultado é: " + resp + " resto: " + resto);
		} else {
			System.err.println("O divisor não pode ser 0!!");
		}

	}
}