package Arrays;

//Given N array elements, reverse the entire array with constant space complexity:
//Time complexity - O(n), Space complexity - O(1)

public class reverseArray {
    public static void revArray(int[] arr){
        int n = arr.length;
        int j = n - 1;
        int i = 0;
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {-5,8,9,7,-1,3,2,1,4};
        revArray(arr);
    }
}