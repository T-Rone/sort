package Java;

public class SelectionSort {

/**

 * ѡ������

 * @param array

 * @return

 */

public static int[] selectionSort(int[] array) {
	if (array.length == 0)
		return array;
	for (int i = 0; i < array.length; i++) {
		int minIndex = i;
		for (int j = i; j < array.length; j++) {
			if (array[j] < array[minIndex]) //�ҵ���С����
				minIndex = j; //����С������������
		}
		int temp = array[minIndex];
		array[minIndex] = array[i];
		array[i] = temp;
	}

	return array;

}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={8,7,3,4};
		SelectionSort  s=new SelectionSort();
		int [] array=s.selectionSort(a);
		for (int i = 0; i < array.length; i++) {
			System.out.println("ѡ��:"+array[i]);
		}
	}
	
}
