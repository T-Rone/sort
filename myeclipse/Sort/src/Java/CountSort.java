package Java;

public class CountSort {


	public static void countSort(int[] array, int downBound, int upperBound) {
		int[] countArray = new int[upperBound - downBound + 1];
		if (upperBound < downBound)
			return;
		for (int i = 0; i < array.length; i++) {
			countArray[array[i] - downBound]++;
		}
		int posSum = 0;
		for (int i = 0; i < upperBound - downBound + 1; i++) {
			posSum += countArray[i];
			countArray[i] = posSum;
		}
		int[] result = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
			result[countArray[array[i] - downBound] - 1] = array[i];
			countArray[array[i] - downBound]--;
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = result[i];
		}
		for (int i= 0; i < result.length; i++) {
			System.out.println("¼ÆÊý:"+result[i]);
		}
	}
/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={8,7,1,0,1,3,4};
		CountSort q=new CountSort();
		q.countSort(a,0,8);
		
	}

}
