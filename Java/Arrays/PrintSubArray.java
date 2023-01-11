package Arrays;

//Given an array of N elements, print the specified range of subarray: f,l <= n
//Time complexity - O(n), Space complexity - O(1)

public class PrintSubArray {

    public static void subArray(int[] arr,int f, int l)
    {
        for(int i=f;i<=l;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,7,9,4,-8,2,1};
        subArray(arr, 2, 5);
    }
}
