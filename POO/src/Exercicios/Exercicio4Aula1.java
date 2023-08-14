package Exercicios;

import java.util.Scanner;

/*
 *  Considerando a fórmula a seguir, calcule a média:
 Média Final = (AC1 * 0,15) + (AC2 *0,30) + (AG * 0,10) + (AF * 0,45)
 Os valores AC1, AC2, AG e AF serão passados por parâmetros e só poderão
aceitar números reais de 0 a 10.

 */
public class Exercicio4Aula1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Nota AC1: ");
		double ac1 = ler.nextDouble();
		System.out.println("Nota AC2: ");
		double ac2 = ler.nextDouble();
		System.out.println("Nota AG: ");
		double ag = ler.nextDouble();
		System.out.println("Nota AF: ");
		double af = ler.nextDouble();

		double mf = (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);

		System.out.printf("AC1: %.2f\nAC2: %.2f\nAG: %.2f\nAF: %.2f\nM�dia Final: %.2f", ac1, ac2, ag, af, mf);

		ler.close();
	}
}
