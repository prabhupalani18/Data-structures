package Arrays;

//Given an 2 array of N*M elements, find sum of each row.
//Time complexity - O(n*m), Space complexity - O(1)

public class RowWiseSum {

    public static void findRowWiseSum(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<m;j++)
            {
                sum=sum+arr[i][j];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,5},
            {14,5,7,2,-1}
        };
        findRowWiseSum(arr);
    }
}
