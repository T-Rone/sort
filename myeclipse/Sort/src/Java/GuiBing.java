package Java;

public class GuiBing {


	public static int[] sort(int[] a,int low,int high){
        int mid = (low+high)/2;
        if(low<high){
            sort(a,low,mid);
            sort(a,mid+1,high);
            //���ҹ鲢
            merge(a,low,mid,high);
        }
        return a;
    }
     
    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i= low;
        int j = mid+1;
        int k=0;
        // �ѽ�С�������Ƶ���������
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        // �����ʣ������������� 
        while(i<=mid){
            temp[k++] = a[i++];
        }
        // ���ұ߱�ʣ�������������
        while(j<=high){
            temp[k++] = a[j++];
        }
        // ���������е�������nums����
        for(int x=0;x<temp.length;x++){
            a[x+low] = temp[x];
        }

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={8,7,1,0,1,3,4};
		GuiBing g=new GuiBing();
		int [] tmp=g.sort(a, 0, 6);
		for (int i= 0; i < tmp.length; i++) {
			System.out.println("�鲢:"+tmp[i]);
		}
	}

}
