package Java;

public class QuickSort {

/**

 * �������򷽷�

 * @param array

 * @param start

 * @param end

 * @return

 */

public static int[] QuickSort(int[] array, int start, int end) {

	if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;

	int smallIndex = partition(array, start, end);

	if (smallIndex > start)

		QuickSort(array, start, smallIndex - 1);

	if (smallIndex < end)

		QuickSort(array, smallIndex + 1, end);

	return array;

}

/**

 * ���������㷨����partition

 * @param array

 * @param start

 * @param end

 * @return

 */

public static int partition(int[] array, int start, int end) {

	int pivot = (int) (start + Math.random() * (end - start + 1));

	int smallIndex = start - 1;

	swap(array, pivot, end);

	for (int i = start; i <= end; i++)

		if (array[i] <= array[end]) {

			smallIndex++;

			if (i > smallIndex)

				swap(array, i, smallIndex);

		}

	return smallIndex;

}

 

/**

 * ��������������Ԫ��

 * @param array

 * @param i

 * @param j

 */

public static void swap(int[] array, int i, int j) {

	int temp = array[i];

	array[i] = array[j];

	array[j] = temp;

}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={8,7,1,0,1,3,4};
		QuickSort q=new QuickSort();
		int [] array=q.QuickSort(a,0, 6);
		for (int i= 0; i < array.length; i++) {
			System.out.println("����:"+array[i]);
		}
	}

}
