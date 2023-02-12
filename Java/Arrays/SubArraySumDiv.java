package Arrays;

//* Given an array of length n and an integer k, find the count of all non-empty subarrays of the array that have a sum divisible by k.
//* Time complexity for findDivCount1 - O(n^3), Space complexity - O(1) ~ 10^15 TLE

public class SubArraySumDiv {

    public static int findDivCount1(int[] arr,int k)
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int c=i;c<=j;c++)
                {
                    sum=sum+arr[c];
                }
                if(sum%k==0)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,6,1,4,5};
        int res1 = findDivCount1(arr, 3);
        System.out.println(res1);
    }
}
