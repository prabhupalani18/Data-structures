package Arrays;

//Given N array elements, Rotate the array from left to right by K times with constant space complexity:
//Time complexity - O(n), Space complexity - O(1)

public class rotateArray {
    public static void revIndexArray(int[] arr, int si, int ei)
    {
        while(si<ei)
        {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    
    public static void printArray(int[] arr)
    {
        int n = arr.length;
        for(int i=0; i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {9,7,3,6,7,2,8,-4,-1,5};
        int k = 4;
        int n = arr.length;
        revIndexArray(arr, 0, n-1);
        revIndexArray(arr, 0, k-1);
        revIndexArray(arr, k, n-1);
        System.out.print("Rotated array: ");
        printArray(arr);
    }
}
