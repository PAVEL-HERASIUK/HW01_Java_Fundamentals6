package by.htp.les06.main;

public class Main {

	public static void main(String[] args) {
		// 1. Заданы два одномерных массива с различным количеством элементов и
		// натуральное число k. Объединить их в один массив, включив второй массив между k-м и (k+1)
		// - м элементами первого, при этом не используя дополнительный массив.

		int[] mas1 = { 12, 35, 67, 81, 93, 97, 98 };
		int[] mas2 = { 65, 78, 89, 45, 23 };

		int mas1NewLength = mas1.length + mas2.length;
		int[] mas3 = new int[mas1NewLength];

		int j = 0;

		for (int i = 0; i < mas3.length; i++) {
			int k = 3;
			if (i < k) {
				mas3[i] = mas1[i];
			} else {
				while (j < mas2.length) {
					mas3[i] = mas2[j];
					j++;
					i++;
				}
				mas3[i] = mas1[i - mas2.length];
			}
		}
		for (int i = 0; i < mas3.length; i++) {

			System.out.printf("% 3d ", mas3[i]);
		}
	}
}