package Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BucketSort {

    public static void main(String[] args) {

        // ����Ԫ�ؾ��� [0, 10) ���������
        float[] arr = new float[] { 0.12f, 2.2f, 8.8f, 7.6f, 7.2f, 6.3f, 9.0f, 1.6f, 5.6f, 2.4f };
        bucketSort(arr);

        printArray(arr);

    }

    public static void bucketSort(float[] arr) {

        // �½�һ��Ͱ�ļ���

        ArrayList<LinkedList<Float>> buckets = new ArrayList<LinkedList<Float>>();

        for (int i = 0; i < 10; i++) {

            // �½�һ��Ͱ����������ӵ�Ͱ�ļ�����ȥ��

            // ����Ͱ��Ԫ�ػ�Ƶ���Ĳ��룬����ѡ�� LinkedList ��ΪͰ�����ݽṹ

            buckets.add(new LinkedList<Float>());

        }

        // ����������ȫ������Ͱ�в��������

        for (float data : arr) {

            int index = getBucketIndex(data);

            insertSort(buckets.get(index), data);

        }

        // ��Ͱ��Ԫ��ȫ��ȡ���������� arr �����

        int index = 0;

        for (LinkedList<Float> bucket : buckets) {

            for (Float data : bucket) {

                arr[index++] = data;

            }

        }

    }

 

    /**

     * ����õ�����Ԫ��Ӧ�÷ŵ��ĸ�Ͱ��

     */

    public static int getBucketIndex(float data) {

        // ��������д�ıȽϼ򵥣���ʹ�ø�����������������Ϊ��Ͱ������ֵ

        // ʵ�ʿ�������Ҫ���ݳ����������

        return (int) data;

    }

 

    /**

     * ����ѡ�����������ΪͰ��Ԫ������ķ��� ÿ����һ����Ԫ�ص���ʱ�����Ƕ����ø÷���������뵽ǡ����λ��

     */

    public static void insertSort(List<Float> bucket, float data) {

        ListIterator<Float> it = bucket.listIterator();

        boolean insertFlag = true;

        while (it.hasNext()) {

            if (data <= it.next()) {

                it.previous(); // �ѵ�������λ��ƫ�ƻ���һ��λ��

                it.add(data); // �����ݲ��뵽�������ĵ�ǰλ��

                insertFlag = false;

                break;

            }

        }

        if (insertFlag) {

            bucket.add(data); // ��������ݲ��뵽����ĩ��

        }

    }

 

    public static void printArray(float[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + ", ");

        }

        System.out.println();

    }

 

}

