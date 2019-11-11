package Java;
public class bubbleSort {
/**

 * ц╟ещеепР

 * @param array

 * @return

 */
public static int[] bubbleSort(int[] array) {
	if (array.length == 0)
		return array;
	for (int i = 0; i < array.length; i++)
		for (int j = 0; j < array.length - 1 - i; j++)
			if (array[j + 1] < array[j]) {
				int temp = array[j + 1];
				array[j + 1] = array[j];
				array[j] = temp;
			}
	return array;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] a={8,7,3,4};
			bubbleSort b1=new bubbleSort();
			int [] array=b1.bubbleSort(a);
			for (int i = 0; i < array.length; i++) {
				System.out.println("ц╟ещ:"+array[i]);
			}
		}

}
