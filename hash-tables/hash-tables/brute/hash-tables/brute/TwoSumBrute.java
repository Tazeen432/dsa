public class TwoSumBrute {

    static void twoSum(int arr[], int target) {

        for(int i=0;i<arr.length;i++) {

            for(int j=i+1;j<arr.length;j++) {

                if(arr[i]+arr[j]==target) {

                    System.out.println("Indexes: "
                            + i + " , " + j);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[]={2,7,11,15};

        twoSum(arr,9);
    }
}