package Arrays;

// *Given an array of N elements, return max subarray sum of length K, where k>=1.
//*Time complexity for findMaxSubArraySum1 - O(N^2), Space complexity - O(1)
//*Time complexity for findMaxSubArraySum2 - O(N), Space complexity - O(n)
//*Time complexity for findMaxSubArraySum3 - O(N), Space complexity - O(1)

public class MaxSubArraySum {

    public static void findMaxSubArraySum1(int[] arr,int k) //Brute force approach
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

    public static void findMaxSubArraySum2(int[] arr, int k) //Prefix sum
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

    public static void findMaxSubArraySum3(int[] arr, int k) //Sliding window
    {
        int n = arr.length;
        int sum=0;
        for(int i=0;i<k-1;i++)
        {
            sum+=arr[i];
        }
        int s=1;
        int e=k;
        int max=sum;
        while(e<n)
        {
            sum=sum-arr[s-1]+arr[e];
            max = Math.max(max, sum);
            s++;
            e++;
        }
        sum=sum-arr[s-2]+arr[n-1];
        max = Math.max(max, sum);
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
        findMaxSubArraySum3(arr, 3);
    }
}