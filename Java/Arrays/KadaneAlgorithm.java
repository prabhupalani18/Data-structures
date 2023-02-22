package Arrays;

//* Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum..
//* Time complexity - O(n), Space complexity - O(1)

public class KadaneAlgorithm {

    public static long MaxSubArraySum(int[] arr)
    {
        int n=arr.length;
        long sum=0;
        long max=arr[0];
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        long result = MaxSubArraySum(arr);
        System.out.println(result);
    }
}
