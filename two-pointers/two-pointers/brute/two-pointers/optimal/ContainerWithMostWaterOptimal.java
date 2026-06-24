public class ContainerWithMostWaterOptimal {

    static int maxArea(int arr[]) {

        int left = 0;
        int right = arr.length-1;

        int max = 0;

        while(left < right) {

            int area = Math.min(arr[left],arr[right]) * (right-left);

            if(area > max)
                max = area;

            if(arr[left] < arr[right])
                left++;
            else
                right--;
        }

        return max;
    }

    public static void main(String[] args) {

        int arr[] = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(arr));
    }
}