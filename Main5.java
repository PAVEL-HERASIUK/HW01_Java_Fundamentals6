package by.htp.les06.main;

import java.util.Random;

public class Main5 {

	public static void main(String[] args) {
		// 5. Сортировка вставками. Дана последовательность чисел a1, a2,..., an. Требуется переставить числа в порядке возрастания. Делается это следующим
		// образом. Пусть a1, a2, ai - упорядоченная последовательность, т. е.a1 <= a2<=...<= an. Берется следующее число ai+1 и вставляется в последовательность так, чтобы
		// новая последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n не будут перебраны. Примечание. Место помещения очередного элемента в
		// отсортированную часть производить с помощью двоичного поиска. Двоичный поиск оформить в виде
		// отдельной функции.

		int[] mas = new int[10];

		randomMasElement(mas, 100);
		printMas(mas);

		masSortInsert(mas);
		printMas(mas);
	}

	public static void masSortInsert(int[] mas) {
		int ins, i, j, tmp;
		for (i = 1; i < mas.length; i++) {
			ins = binarySearch(mas, 0, i, mas[i]);
			tmp = mas[i];
			for (j = i - 1; j >= ins; j--) {
				mas[j + 1] = mas[j];
			}
			mas[ins] = tmp;
		}
	}

	public static int binarySearch(int a[], int low, int high, int key) {
		int mid;
		if (low == high) {
			return low;
		}
		mid = low + ((high - low) / 2);
		if (key > a[mid]) {
			return binarySearch(a, mid + 1, high, key);
		} else if (key < a[mid]) {
			return binarySearch(a, low, mid, key);
		}
		return mid;
	}

	public static void randomMasElement(int[] mas, int a) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(a);
		}
	}

	public static int[] masCation(int i) {
		int[] mas = new int[i];
		return mas;
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("% 3d ", mas[i]);
		}
		System.out.println();
		System.out.println(".......................................");
	}
}