package Arrays;

// *Given an array of N elements, return max subarray sum of length K, where k>=1.
//*Time complexity for findMaxSubArraySum1 - O(N^2), Space complexity - O(1)
//*Time complexity for findMaxSubArraySum2 - O(N), Space complexity - O(n)

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

    public static void findMaxSubArraySum2(int[] arr, int k)
    {
        int n = arr.length;
        int[] pSum = prefixSum(arr);
        int s = 0;
        int e = k-1;
        int max=0;
        while(e<n)
        {
            int sum = 0;
            if(s==0)
            {
                sum = pSum[e];
            }
            else{
                sum = pSum[e]-pSum[s-1];
            }
            max=Math.max(max,sum);
            s++;
            e++;
        }
        System.out.println(max);
    }

    public static int[] prefixSum(int[] arr)
    {
        int n = arr.length;
        int[] pSum = new int[n];
        pSum[0]= arr[0];
        for(int i=1;i<n;i++)
        {
            pSum[i] = arr[i] + pSum[i-1];
        }
        return pSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        findMaxSubArraySum1(arr, 3);
        findMaxSubArraySum2(arr, 3);
    }
}
