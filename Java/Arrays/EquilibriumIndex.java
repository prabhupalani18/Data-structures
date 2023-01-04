package Arrays;

//Given N array elements, Count the no. of equilibrium index. i.e: sum of all elements on left of ith index == sum of all elements on right of ith index
//Time complexity - O(n), Space complexity - O(n)

public class EquilibriumIndex {
    public static int[] prefixSum(int[] arr)
    {
        int n = arr.length;
        int[] pSum = new int[n];
        pSum[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            pSum[i] = pSum[i-1] + arr[i];
        }
        return pSum;
    }

    public static int countEqIndex(int[] arr)
    {
        int[] pSum = prefixSum(arr);
        int count = 0;
        int n = arr.length;
        if(pSum[n-1]-pSum[0] == 0) // Checking for 0th index as left sum of 0th index in zero
        {
            count++;
        }
        for(int i=1;i<n;i++)
        {
            if(pSum[i-1] == pSum[n-1]-pSum[i])
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {-7,1,5,2,-4,3,0};
        System.out.println(countEqIndex(arr));
    }
}