package Arrays;

//Given an array of N elements, find sum of each and every subarrays.
//Time complexity for printSumOfSubArrays1 - O(n^3), Space complexity - O(1)
//Time complexity for printSumOfSubArrays2 - O(n^2), Space complexity - O(n)
//Time complexity for printSumOfSubArrays3 - O(n^2), Space complexity - O(1)

public class SumAllSubArrays {

    public static int[] prefixSum(int[] arr)
    {
        int n = arr.length;
        int[] pSum = new int[n];
        pSum[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            pSum[i] = arr[i] + pSum[i-1];
        }
        return pSum;
    }

    public static void printSumOfSubArrays1(int[] arr)
    {
        System.out.println("printSumOfSubArrays1");
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+arr[k];
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }

    public static void printSumOfSubArrays2(int[] arr)
    {
        System.out.println("printSumOfSubArrays2");
        int n = arr.length;
        int[] pSum = prefixSum(arr);
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(i==0)
                {
                    System.out.print(pSum[j]+" ");
                    continue;
                }
                System.out.print((pSum[j] - pSum[i-1])+" ");
            }
            System.out.println();
        }
    }

    public static void printSumOfSubArrays3(int[] arr)
    {
        System.out.println("printSumOfSubArrays3");
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,7,3,4,9,6,-8,-1,5};
        printSumOfSubArrays1(arr);
        printSumOfSubArrays2(arr);
        printSumOfSubArrays3(arr);
    }    
}
