public class FindLargestBrute {

    static int largest(int arr[]) {

        int max = arr[0];

        for(int i=1;i<arr.length;i++) {

            if(arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    public static void main(String[] args) {

        int arr[] = {4,10,3,5,1};

        System.out.println(largest(arr));
    }
}