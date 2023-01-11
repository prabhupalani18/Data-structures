package Arrays;

//Given an array of N elements, sum the specified range of subarray: f,l <= n
//Time complexity - O(n), Space complexity - O(1)

public class SumSubArray {

    public static void sumSubArray(int[] arr,int f,int l)
    {
        int sum=0;
        for(int i=f;i<=l;i++)
        {
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] arr = {6,7,-9,3,12,5,7};
        sumSubArray(arr, 1, 6);
    }
}
