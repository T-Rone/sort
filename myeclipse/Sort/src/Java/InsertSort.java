package Java;

public class InsertSort {

	/**
	 * 
	 * ²åÈëÅÅĞò
	 * 
	 * @param array
	 * 
	 * @return
	 */

	public static int[] insertionSort(int[] array) {
		if (array.length == 0)
			return array;
		int current;
		for (int i = 0; i < array.length - 1; i++) {

			current = array[i + 1];

			int preIndex = i;

			while (preIndex >= 0 && current < array[preIndex]) {

				array[preIndex + 1] = array[preIndex];

				preIndex--;

			}
			array[preIndex + 1] = current;
		}

		return array;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 8, 7, 1, 0, 1, 3, 4 };
		InsertSort in = new InsertSort();
		int[] array = in.insertionSort(a);
		for (int i = 0; i < array.length; i++) {
			System.out.println("²åÈë:" + array[i]);
		}
	}

}
