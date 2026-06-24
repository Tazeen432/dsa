public class FindClosestNumberToZeroOptimal {

    static int findClosest(int arr[]) {

        int closest = arr[0];

        for(int i=1;i<arr.length;i++) {

            if(Math.abs(arr[i]) < Math.abs(closest)) {
                closest = arr[i];
            }

            if(Math.abs(arr[i]) == Math.abs(closest) && arr[i] > closest) {
                closest = arr[i];
            }
        }

        return closest;
    }

    public static void main(String[] args) {

        int arr[] = {-4,-2,1,4,8};

        System.out.println(findClosest(arr));
    }
}