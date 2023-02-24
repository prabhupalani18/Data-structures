package Arrays;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//* Given an array and a number K where K is smaller than the size of the array. Find the K’th smallest element in the given array. Given that all array elements are distinct.
//* Time complexity - O(nlogn), Space complexity - O(n)

public class KthSmallestElement {

    public static long findKthSmall(long[] arr, long k)
    {
        int n=arr.length;
        Set<Long> s = new TreeSet<Long>();
        for (int i = 0; i < n; i++)
            s.add(arr[i]);
        Iterator<Long> itr = s.iterator();
        while (k>1) {
            itr.next();
            k--;
        }
        return itr.next();
    }

    public static void main(String[] args) {
        long[] arr = {1,45,2,67,12};
        long k = 3;
        long result = findKthSmall(arr, k);
        System.out.println(result);
    }
}
