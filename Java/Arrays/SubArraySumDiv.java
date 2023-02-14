package Arrays;

import java.util.HashMap;

//* Given an array of length n and an integer k, find the count of all non-empty subarrays of the array that have a sum divisible by k.
//* Time complexity for findDivCount1 - O(n^3), Space complexity - O(1) ~ 10^15 TLE
//* Time complexity for findDivCount2 - O(n^2), Space complexity - O(1) ~ 10^10 TLE
//* Time complexity for findDivCount3 - O(n), Space complexity - O(n)

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

    public static int findDivCount2(int[] arr,int k) //* Carry forward approach
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum%k==0)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[] prefixSum(int[] arr)
    {
        int n=arr.length;
        int[] pSum = new int[n];
        pSum[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            pSum[i]=arr[i]+pSum[i-1];
        }
        return pSum;
    }

    public static int findDivCount3(int[] arr,int k)
    {
        int n=arr.length;
        int[] pSum=prefixSum(arr);
        int count=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int[] remArr = new int[n];
        for(int i=0;i<n;i++)
        {
            remArr[i]=arr[i]%k;
        }
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(remArr[i]))
            {
                count+=hm.get(remArr[i]);
                hm.put(remArr[i],hm.get(remArr[i])+1);
            }
            else{
                hm.put(remArr[i],1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,6,1,4,5};
        int res1 = findDivCount1(arr, 3);
        System.out.println(res1);
        int res2 = findDivCount2(arr, 3);
        System.out.println(res2);
        int res3 = findDivCount3(arr, 3);
        System.out.println(res3);
    }
}
