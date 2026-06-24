import java.util.Arrays;

public class LongestCommonPrefixOptimal {

    static String longestPrefix(String arr[]) {

        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length-1];

        String result = "";

        for(int i=0;i<Math.min(first.length(),last.length());i++) {

            if(first.charAt(i)==last.charAt(i))
                result += first.charAt(i);
            else
                break;
        }

        return result;
    }

    public static void main(String[] args) {

        String arr[]={"flower","flow","flight"};

        System.out.println(longestPrefix(arr));
    }
}