package Java;

public class ShellSort {

/**

 * Ï£¶ûÅÅÐò

 *

 * @param array

 * @return

 */

public static int[] ShellSort(int[] array) {

	int len = array.length;

	int temp, gap = len / 2;

	while (gap > 0) {

		for (int i = gap; i < len; i++) {

			temp = array[i];

			int preIndex = i - gap;

			while (preIndex >= 0 && array[preIndex] > temp) {

				array[preIndex + gap] = array[preIndex];

				preIndex -= gap;

			}

			array[preIndex + gap] = temp;

		}

		gap /= 2;

	}

	return array;

}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={8,7,1,0,1,3,4};
		ShellSort sh=new ShellSort();
		int [] array=sh.ShellSort(a);
		for (int i= 0; i < array.length; i++) {
			System.out.println("Ï£¶û:"+array[i]);
		}
	}

}
