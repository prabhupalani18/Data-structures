package Arrays;

//Given an array of N elements, find sum of each and every subarrays.
//Time complexity for findTotalSumOfSubArray1 - O(n^2), Space complexity - O(1)
//Time complexity for findTotalSumOfSubArray2 - O(n), Space complexity - O(1)

public class TotalSumOfSubArrays {

    public static void findTotalSumOfSubArray1(int[] arr)
    {
        int n = arr.length;
        int totalSum=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                totalSum+=sum;
            }
        }
        System.out.println(totalSum);
    }

    public static void findTotalSumOfSubArray2(int[] arr)
    {
        int n = arr.length;
        int totalSum=0;
        for(int i=0;i<n;i++)
        {
            totalSum+=arr[i]*(i+1)*(n-i);
        }
        System.out.println(totalSum);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,6,-5,1,8,2};
        findTotalSumOfSubArray1(arr);
        findTotalSumOfSubArray2(arr);
    }
}
