package by.htp.les06.main;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		// 2. Даны две последовательности a1 <= a2 <= ...<= an и b1<= b2 <=...<= bm.
		// Образовать из них новую последовательность чисел так, чтобы она тоже была
		// неубывающей. Примечание.Дополнительный массив не использовать.

		int[] mas1 = new int[5];

		randomMasElement(mas1, 1000);
		printMas(mas1);

		int[] mas2 = new int[10];

		randomMasElement(mas2, 1000);
		printMas(mas2);

		int[] mas3 = combineMas(mas1, mas2);

		sort(mas3);
		printMas(mas3);

	}

	public static void sort(int[] mas) {
		int indexMinElement = 0;

		for (int i = 0; i < mas.length; i++) {
			indexMinElement = i;
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[indexMinElement] > mas[j]) {
					indexMinElement = j;
				}
			}
			int temp = mas[indexMinElement];
			mas[indexMinElement] = mas[i];
			mas[i] = temp;
		}
	}
          // код объединения массива
	public static int[] combineMas(int[] mas1, int[] mas2) {

		int[] mas3 = new int[(mas1.length + mas2.length)];

		int count = 0;

		for (int i = 0; i < mas1.length; i++) {

			mas3[i] = mas1[i];
		}
		for (int i = mas1.length; i < mas3.length; i++) {
			mas3[i] = mas2[count];
			count++;
		}
		return mas3;
	}

	public static void randomMasElement(int[] mas, int a) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(a);
		}
	}
	//public static int[] masCombine(int i) {
		//int[] mas = new int[i];
		//return mas;
	//}
	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("% 3d ", mas[i]);
		}
		System.out.println();
		System.out.println("........................................");
	}
}
