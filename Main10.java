package by.htp.les06.main;

public class Main10 {

	public static void main(String[] args) {
		// 10. Сортировка подсчетом. Выходной массив заполняется значениями -1. Затем
		// для каждого элемента определяется его место в выходном массиве путем подсчета
		// количества элементов строго меньших данного. Естественно, что все одинаковые элементы
		// попадают на одну позицию, за которой следует ряд значений -1. После этого оставшиеся в
		// выходном массиве позиции со значением -1 заполняются копией предыдущего значения.

		int[] mas = { 15, 9, 2, 6, 3, 4, 7, 5, 10, 14, 12, 13, 1, 11, 8 };
		mas = sort(mas);
		print(mas);
	}

	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println("mas [ " + i + " ] = " + mas[i]);
		}
	}

	public static int[] sort(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = -1;
		}
		for (int i = 0; i < array.length; i++) {
			int num = 0;
			int j = 0;
			while (j < array.length) {
				if (array[j] < array[i]) {
					num++;
				}
				j++;
			}
			result[num] = array[i];
		}
		for (int i = 0; i < result.length - 1; i++) {
			if (result[i + 1] == -1) {
				result[i + 1] = result[i];
			}
		}
		return result;
	}
}