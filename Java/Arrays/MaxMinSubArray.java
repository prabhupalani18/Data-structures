package Arrays;

//Given an array, return the length of smallest sub array which contains both 'MAX' and 'MIN' of array subarray:
//Time complexity for findMinAndMax - O(n), Space complexity - O(1)
//Time complexity for smallestMaxMinSubArray - O(n), Space complexity - O(1)

public class MaxMinSubArray {

    public static int[] findMinAndMax(int[] arr)
    {
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            else if(min>arr[i])
            {
                min=arr[i];
            }
        }
        int[] ans = {min,max};
        return ans;
    }

    public static void smallestMaxMinSubArray(int[] arr)
    {
        int[] ans = findMinAndMax(arr);
        int min = ans[0];
        int max = ans[1];
        if(min == max) // if all the values are same
        {
            System.out.println("1");
            return;
        }
        int n = arr.length;
        int minIndex=-1;
        int maxIndex=-1;
        int result=n;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==min){
                minIndex=i;
                if(maxIndex>=0)  //If we found atleast one max value index
                {
                    result = Math.min(result,i-maxIndex+1);
                }
            }
            if(arr[i]==max){
                maxIndex=i;
                if(minIndex>=0) //If we found atleast one min value index
                {
                    result = Math.min(result,i-minIndex+1);
                }
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int[] arr = {2,8,-4,9,-1,-5,6,-12};
        smallestMaxMinSubArray(arr);
        int[] arr2 = {2,2,2,2,2,2,2,2,2,2};
        smallestMaxMinSubArray(arr2);
    }
}
