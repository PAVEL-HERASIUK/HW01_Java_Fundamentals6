package by.htp.les06.main;

import java.util.Random;

public class Main6 {

	public static void main(String[] args) {
		// 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
		// его по возрастанию. Делается это следующим образом: сравниваются два соседних
		// элемента ai и ai+1. Если ai<= ai+1, то продвигаются на один элемент вперед.
		// Если ai > ai+1, то производится
		// перестановка и сдвигаются на один элемент назад. Составить алгоритм этой
		// сортировки

		int k = 0;
		int masLenght = 10;
		Random rand = new Random();
		int[] mas = new int[masLenght];
		for (int i = 0; i < mas.length; ++i) {
			mas[i] = rand.nextInt(100);
			System.out.printf("% 3d ", mas[i]);
		}
		System.out.println();
		System.out.println(".......................................");

		for (int j = masLenght / 2; j > 0; j = j / 2)
			for (int i = j; i < masLenght; i++) {

				int tmp = mas[i];

				for (k = i; k >= j; k -= j) {
					if (tmp < mas[k - j]) {
						mas[k] = mas[k - j];
					} else {
						break;
					}
				}
				mas[k] = tmp;
			}
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("% 3d ", mas[i]);
		}
	}
}