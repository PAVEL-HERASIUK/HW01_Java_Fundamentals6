package by.htp.les06.main;

import java.util.Random;

public class Main11 {

	public static void main(String[] args) {
		// 11. «Хитрая» сортировка. Из массива путем однократного просмотра выбирается
		// последовательность элементов, расположенных в порядке возрастания,
		// переносится в выходной массив и заменяется во входном на -1. Затем оставшиеся
		// элементы включаются в полученную упорядоченную последовательность методом
		// «погружения», когда очередной элемент путем ряда обменов «погружается» до требуемой позиции в уже
		// упорядоченную часть массива.

		int[] mas = new int[20];
		int[] mas2 = new int[mas.length];

		init(mas, 10);
		printMas(mas);
		sort(mas, mas2);
		printMas(mas2);
	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}

	private static void sort(int[] mas, int[] mas2) {
		int i;
		int j = 1;
		int k;
		int max;
		int tmp;

		max = mas[0];
		mas2[0] = mas[0];
		mas[0] = -1;
		for (i = 1; i < mas.length; i++) {
			if (mas[i] >= max) {
				mas2[j] = mas[i];
				max = mas[i];
				j++;
				mas[i] = -1;
			}
		}
		for (i = 1; i < mas.length; i++) {
			if (mas[i] != -1) {
				mas2[j] = mas[i];
				for (k = j; k > 0; k--) {
					if (mas2[k] < mas2[k - 1]) {
						tmp = mas2[k];
						mas2[k] = mas2[k - 1];
						mas2[k - 1] = tmp;
					} else {
						break;
					}
				}
				j++;
			}
		}
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("% 3d ", mas[i]);
		}

		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
	}
}
