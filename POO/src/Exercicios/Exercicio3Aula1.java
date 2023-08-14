package Exercicios;

import java.util.Scanner;

/*
 *Ler uma temperatura em graus Fahrenheit e apresenta-la convertida
em graus Celsius. A formula de conversaƒo a ser utilizada pode ser C =
((F - 32) * 5) / 9, em que a variavel F e a temperatura em graus
Fahrenheit e a variavel C e a temperatura em graus Celsius.

 */
public class Exercicio3Aula1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o valor da Temperatura em ºF que deseja fazer a conversão para ºC ? ");
		double f = ler.nextDouble();
		
		double c = ((f - 32)* 5) / 9;
		
		System.out.printf("A temperatura: %.2fºF\n"
				+ "em Celcius é: %.2fºC", f, c);
		ler.close();
	}

}
