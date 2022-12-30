package Arrays;
//Given an array with N elements, check if there exists a pair{i,j} that a[i]+a[j]==k and i!=j
//Time complexity for ifPairFound1 - O(n), Space complexity - O(n)
//Time complexity for ifPairFound2 - O(n^2), Space complexity - O(1)

import java.util.HashSet;

public class findPair {
    public static boolean ifPairFound1(int[] arr, int k)
    {
        System.out.println("ifPairFound1");
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

    public static boolean ifPairFound2(int[] arr, int k)
    {
        System.out.println("ifPairFound2");
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j = i+1; j<n;j++)
            {
                if(arr[i]+arr[j] == k)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,-2,1,4,3,6,8};
        boolean result1 = ifPairFound1(arr,12);
        boolean result2 = ifPairFound2(arr,12);
        System.out.println(result1);
        System.out.println(result2);
    }
}
