package by.htp.les06.main;

import java.util.Random;

public class Main8_1 {

	public static void main(String[] args) {
		// 8.Даны дроби p1/q1, p1/q2,...pn/qn, (p1, q1 - натуральные). Составить
		// программу, которая приводит эти
		// дроби к общему знаменателю и упорядочивает их в порядке возрастания.

		int[] numerators = new int[10];
		int[] denominators = new int[10];

		init(numerators, 10);
		init(denominators, 10);
		printFractions(numerators, denominators);
		bringFractionsToCommonDenominator(numerators, denominators);
		sortFractions(numerators);
		printFractions(numerators, denominators);
	}

	public static void init(int[] mas, int limit) {
		int i;
		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit) + 1;
		}
	}

	public static void bringFractionsToCommonDenominator(int[] mas1, int[] mas2) {
		int i;
		int commonDen;
		commonDen = findCommonDenominator(mas2);
		for (i = 0; i < mas1.length; i++) {
			mas1[i] = commonDen / mas2[i] * mas1[i];
			mas2[i] = commonDen;
		}
	}

	public static int findCommonDenominator(int[] mas) {
		int i;
		int commonDen = mas[0];
		int nok;
		for (i = 1; i < mas.length; i++) {
			nok = findNOD(commonDen, mas[i]);
			commonDen = commonDen * mas[i] / nok;
		}
		return commonDen;
	}

	public static int findNOD(int a, int b) {
		int nod = 1;
		int x;
		int i;
		if (a < b) {
			x = a;
		} else {
			x = b;
		}
		for (i = x; i >= 1; i--) {
			if ((a % i == 0) && (b % i == 0)) {
				nod = i;
				break;
			}
		}
		return nod;
	}

	public static void sortFractions(int[] mas) {
		int i;
		int j;
		int tmp;
		for (i = mas.length - 1; i > 0; i--) {
			for (j = 0; j < i; j++) {
				if (mas[j] > mas[j + 1]) {
					tmp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = tmp;
				}
			}
		}
	}

	public static void printFractions(int[] mas1, int[] mas2) {
		int i;
		for (i = 0; i < mas1.length; i++) {
			System.out.printf("% d /% d   ", mas1[i], mas2[i]);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
	}
}