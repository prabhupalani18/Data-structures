package Arrays;

//Given an 2 array of N*M elements, find sum of each column.
//Time complexity - O(n*m), Space complexity - O(1)

public class ColumnWiseSum {

    public static void findColumnWiseSum(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<m;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum=sum+arr[j][i];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {4,6,2,7,2},
            {6,7,2,1,-1},
            {9,1,6,3,7}
        };
        findColumnWiseSum(arr);
    }
}
