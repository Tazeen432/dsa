import java.util.Arrays;

public class KthLargestBrute {

    static int kthLargest(int arr[], int k) {

        Arrays.sort(arr);

        return arr[arr.length-k];
    }

    public static void main(String[] args) {

        int arr[] = {3,2,1,5,6,4};

        System.out.println(kthLargest(arr,2));
    }
}