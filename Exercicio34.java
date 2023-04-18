package aula19_Arrays;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		/*
		 * Criar um vetorA com 10 elementos inteiros. Escreva um programa que imprima
		 * cada elemento do vetorA e a relação de todos os pares de 0 ate o respectivo
		 * elemento
		 */
		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[5];
		for (int x = 0; x < vetorA.length; x++) {
			System.out.println("Entre com o valor da posicao: " + x);
			vetorA[x] = ler.nextInt();
		}
		for (int x = 0; x < vetorA.length; x++) {
			System.out.println("Analisando pares proximo de: " + vetorA[x]);
			for (int y = 2; y < vetorA[x]; y++) {
				if (y % 2 == 0) {
					System.out.println(y + " E par");
				}
			}
			System.out.println();
		}
	}
}
