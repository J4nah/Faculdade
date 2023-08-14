package Exercicios;

import java.util.Scanner;

/*
 * Calcule a quantidade de litros de combustivel gasta em uma viagem,
utilizando um automÛvel que faz 12 Km por litro. Para obter o
calculo, o usu·rio deve fornecer o tempo gasto na viagem e a
velocidade mÈdia. Desta forma, ser·Å possÌÅvel obter a dist‚ncia
percorrida com a fÛrmula DISTANCIA = TEMPO * VELOCIDADE. Tendo
o valor da dist‚Çncia, basta calcular a quantidade de litros de
combustiÃÅvel utilizada na viagem com a foÅrmula LITROS_USADOS =
DISTANCIA / 12. O programa deve apresentar os valores da
velocidade mÈdia, tempo gasto, dist‚Çncia percorrida e quantidade de
litros utilizada na viagem. Dica: trabalhe com valores reais.
 */
public class Exercicio2Aula1 {

	public static void main(String[] args) {

		System.out.println("Qual o tempo gasto durante a viagem? ");
		Scanner ler = new Scanner(System.in);
		double tempo = ler.nextDouble();

		System.out.println("Qual a velocidade mÈdia durante a viagem? ");
		double velocidade = ler.nextDouble();

		double distancia = tempo * velocidade;
		double litrosUsados = distancia / 12;

		System.out.printf("A velocidade mÈdia È: %.2fKm/h\n" + "O tempo Gasto: %.2fH\n" + "A distancia percorrida: %.2fKm\n"
				+ "Quantidade de combustivel utilizado: %.2fL.", velocidade, tempo, distancia, litrosUsados);

		ler.close();

	}
}
