package by.htp.les06.main;

public class Main7 {

	public static void main(String[] args) {
		// 7. Пусть даны две неубывающие последовательности действительных чисел a1 <=
		// a2 <=...<= an и b1 <= b2 <=...<= bm.
		// Требуется указать те места, на которые нужно вставлять элементы
		// последовательности b1 <= b2 <=...<= bm
		// в первую последовательность так, чтобы новая последовательность оставалась
		// возрастающей.

		int[] a = new int[] { 1, 3, 5, 7, 9, 11, 13, 15 };
		int[] b = new int[] { 2, 4, 6, 8, 10, 12, 14, 16 };
		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; ++i) {
			c[i] = a[i];
		}

		for (int i = 0, j = a.length; i < b.length; ++i, j++) {
			c[j] = b[i];
		}

		printMas(c);

		for (int i = c.length - 1; i > 0; i--) {
			for (int j = 0; j < i; ++j) {
				if (c[j] > c[j + 1]) {
					int buf = c[j];
					c[j] = c[j + 1];
					c[j + 1] = buf;
				}
			}
		}

		printMas(c);

		System.out.println("Position: ");

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < b.length; ++j) {
				if (c[i] == b[j]) {
					System.out.println("----> " + i);
				}
			}
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("% 3d ", mas[i]);
		}
		System.out.println();
		System.out.println("...............................................................");
	}
}