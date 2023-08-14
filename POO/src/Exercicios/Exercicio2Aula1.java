package Exercicios;

import java.util.Scanner;

/*
 * Calcule a quantidade de litros de combustivel gasta em uma viagem,
utilizando um autom�vel que faz 12 Km por litro. Para obter o
calculo, o usu�rio deve fornecer o tempo gasto na viagem e a
velocidade m�dia. Desta forma, ser� poss�vel obter a dist�ncia
percorrida com a f�rmula DISTANCIA = TEMPO * VELOCIDADE. Tendo
o valor da dist�ncia, basta calcular a quantidade de litros de
combustível utilizada na viagem com a fo�rmula LITROS_USADOS =
DISTANCIA / 12. O programa deve apresentar os valores da
velocidade m�dia, tempo gasto, dist�ncia percorrida e quantidade de
litros utilizada na viagem. Dica: trabalhe com valores reais.
 */
public class Exercicio2Aula1 {

	public static void main(String[] args) {

		System.out.println("Qual o tempo gasto durante a viagem? ");
		Scanner ler = new Scanner(System.in);
		double tempo = ler.nextDouble();

		System.out.println("Qual a velocidade m�dia durante a viagem? ");
		double velocidade = ler.nextDouble();

		double distancia = tempo * velocidade;
		double litrosUsados = distancia / 12;

		System.out.printf("A velocidade m�dia �: %.2fKm/h\n" + "O tempo Gasto: %.2fH\n" + "A distancia percorrida: %.2fKm\n"
				+ "Quantidade de combustivel utilizado: %.2fL.", velocidade, tempo, distancia, litrosUsados);

		ler.close();

	}
}
