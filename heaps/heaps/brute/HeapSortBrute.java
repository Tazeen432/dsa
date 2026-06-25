import java.util.Arrays;

public class HeapSortBrute {

    public static void main(String[] args) {

        int arr[] = {4,10,3,5,1};

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}