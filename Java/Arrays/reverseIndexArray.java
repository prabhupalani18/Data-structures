package Arrays;

//Given N array elements, reverse the specified index sub array with constant space complexity:
//Start index 'si' and End index 'ei' should be positive and lesser than size of the array. si<=ei
//Time complexity - O(n), Space complexity - O(1)

public class reverseIndexArray {
    public static void revIndexArray(int[] arr, int si, int ei)
    {
        int n = arr.length;
        while(si<ei)
        {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
        for(int i=0; i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,8,0,3,8,2,7,6};
        revIndexArray(arr, 3, 7);
    }
}
