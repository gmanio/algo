/**
 * Created by Park on 2016-10-01.
 */
public class BinarySearch {
    public static int[] generateRandomArray(int count) {
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        return arr;
    }

    public void sort(int[] src) {
        for (int i = 0; i < src.length - 1; i++) {
            for (int j = i + 1; j < src.length; j++) {
                if (src[i] > src[j]) {
                    int temp = src[i];
                    src[i] = src[j];
                    src[j] = temp;
                }
            }
        }
    }

    public int binarySearch(int searchTarget, int left, int right, int[] src) {

        while (left<=right){
            int pivot = (left + right) / 2;
            System.out.println("pivottt  "+String.valueOf(pivot));

            if (searchTarget == src[pivot]) {
                return pivot;
            } else if (searchTarget > src[pivot]) {
                left = pivot + 1;
            } else if (searchTarget < src[pivot]) {
                right = pivot -1;
            }
        }

        return -1;
    }

}
