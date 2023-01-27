package Arrays;

// *Given an array of N elements, return max subarray sum of length K, where k>=1.
//*Time complexity for findMaxSubArraySum1 - O(N^2), Space complexity - O(1)

public class MaxSubArraySum {

    public static void findMaxSubArraySum1(int[] arr,int k)
    {
        int n = arr.length;
        int max = 0;
        int s = 0;
        int e = k-1;
        while(e<n)
        {
            int sum=0;
            for(int i=s;i<=e;i++)
            {
                sum+=arr[i];
            }
            max=Math.max(max,sum);
            s++;
            e++;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        findMaxSubArraySum1(arr, 3);
    }
}
