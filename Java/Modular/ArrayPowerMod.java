package Modular;

// *Given a number in array format for eg: arr[2,3,4,5,6] for the number 23456, calculate arr[]%p. Each array element represent a single digit
// *without using built-in functions.
// * Constraints: 1<=n<=10^5, 0<=arr[i]<=9, 2<=p<=10^9
// *Time complexity for findArrayPowerMod - O(n), Space complexity - O(1)

public class ArrayPowerMod {

    public static long findArrayPowerMod(int[] arr, int p)
    {
        long t=1;
        long sum=0;
        int n=arr.length;
        for(int i=n-1;i>=0;i--)
        {
            sum=sum+(arr[i]*t)%p;
            t=(t*10)%p;
        }
        sum=sum%p;
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {6,1,3,7,9,5};
        int p = 43;
        long res = findArrayPowerMod(arr, p);
        System.out.println(res);
    }
}
