package Bit_Manipulations;

// *Given an array of size n, add all elements where 1<=n<=10^5 and 1<=arr[i]<=10^6.
// * addArray1 won't work since the limit of the size of an array exceeds int data type which covers (2^31)-1 ~= +2*10^9 to -2^31 ~= -2*10^9
// * addArray2 work because we are using long data type which covers (2^63)-1 ~= +9*10^18 to 2^63 ~= -9*10^18
// *Time complexity for addArray1 - O(n), Space complexity - O(1)

public class AddArrayElements {

    public static int addArray1(int[] arr)
    {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }

    public static long addArray2(int[] arr)
    {
        int n = arr.length;
        long sum = 0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int res1 = addArray1(arr);
        long res2 = addArray2(arr);
        System.out.println(res1);
        System.out.println(res2);
    }
}
