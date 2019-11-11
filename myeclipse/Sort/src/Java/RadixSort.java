package Java;

import java.util.ArrayList;

public class RadixSort {


/**

 * ��������

 * @param array

 * @return

 */

public static int[] RadixSort(int[] array) {

	if (array == null || array.length < 2)

		return array;

	// 1.������������λ����

	int max = array[0];

	for (int i = 1; i < array.length; i++) {

		max = Math.max(max, array[i]);

	}

	int maxDigit = 0;

	while (max != 0) {

		max /= 10;

		maxDigit++;

	}

	int mod = 10, div = 1;

	ArrayList<ArrayList<Integer>> bucketList = new ArrayList<ArrayList<Integer>>();

	for (int i = 0; i < 10; i++)

		bucketList.add(new ArrayList<Integer>());

	for (int i = 0; i < maxDigit; i++, mod *= 10, div *= 10) {

		for (int j = 0; j < array.length; j++) {

			int num = (array[j] % mod) / div;

			bucketList.get(num).add(array[j]);

		}

		int index = 0;

		for (int j = 0; j < bucketList.size(); j++) {

			for (int k = 0; k < bucketList.get(j).size(); k++)

				array[index++] = bucketList.get(j).get(k);

			bucketList.get(j).clear();

		}

	}

	return array;

}
/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={8,7,16,0,1,38,4};
		RadixSort g=new RadixSort();
		int [] tmp=g.RadixSort(a);
		for (int i= 0; i < tmp.length; i++) {
			System.out.println("����:"+tmp[i]);
		}
	}

}
