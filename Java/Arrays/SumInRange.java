package Arrays;

import java.util.Scanner;
//Given N array elements and Q queries, For each query, calculate sum of all elements in range [L,R]: (1<=N,Q<=10^5)
//Time complexity for calculateSum1 - O(n*q), Space complexity - O(1)
//Time complexity for calculateSum2 - O(n+q), Space complexity - O(n)

public class SumInRange {
    public static void calculateSum1(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queries");
        int q = sc.nextInt();
        int n = arr.length;
        for(int i=0;i<q;i++)
        {
            System.out.println("Enter left range of "+(i+1)+" query:");
            int l = sc.nextInt();
            System.out.println("Enter right range of "+(i+1)+" query:");
            int r = sc.nextInt();
            if(l>=n || r>=n || l>r)
            {
                System.out.println("Invalid input");
                continue;
            }
            int sum = 0;
            for(int j=l;j<=r;j++)
            {
                sum = sum + arr[j];
            }
            System.out.println("Sum: "+sum);
        }
    }

    public static void calculateSum2(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queries");
        int q = sc.nextInt();
        int n = arr.length;
        int[] pSum = new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum = sum+arr[i];
            pSum[i] = sum;
        }
        for(int i=0;i<q;i++)
        {
            System.out.println("Enter left range of "+(i+1)+" query:");
            int l = sc.nextInt();
            System.out.println("Enter right range of "+(i+1)+" query:");
            int r = sc.nextInt();
            if(l>=n || r>=n || l>r)
            {
                System.out.println("Invalid input");
                continue;
            }
            if(l>0)
            {
                sum = pSum[r]-pSum[l-1]; // We should start from one behind as we calculating prefix sum one behind
            }
            else
            {
                sum = pSum[r];
            }
            System.out.println("Sum: "+sum);
            sum=0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,7,2,-1,8,3,-5,10};
        calculateSum1(arr);
        calculateSum2(arr);
    }
}
