package Arrays;
//Given an array with N elements, check if there exists a pair{i,j} that a[i]+a[j]==k and i!=j
//Time complexity - O(n), Space complexity - O(1)

import java.util.HashSet;

public class findPair {
    public static boolean ifPairFound(int[] arr, int k)
    {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(set.contains(k-arr[i]))
            {
                System.out.println("Pair found - {" + arr[i] + ", " + (k-arr[i]) +"}");
                return true;
            }
            else{
                set.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,-2,1,4,3,6,8};
        boolean result = ifPairFound(arr,12);
        System.out.println(result);
    }
}
