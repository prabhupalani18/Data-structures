package Arrays;

//Given an 2 array of N*N square matrix, print leading and trailing diagonal matrix.
//Time complexity - O(n), Space complexity - O(1)

public class PrintDiagonalMatrix {

    public static void printLeadingDiagonal(int[][] arr){
        int n = arr.length;
        int i = 0;
        int j = 0;
        System.out.println("Leading diagonal");
        while(i<n && j<n)
        {
            System.out.println(arr[i][j]);
            i++;
            j++;
        }
    }

    public static void printTrailingDiagonal(int[][] arr){
        int n = arr.length;
        int i=0,j=n-1;
        System.out.println("Trailing diagonal");
        while(i<n && j>=0)
        {
            System.out.println(arr[i][j]);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {3,4,5,6,7},
            {1,2,3,4,5},
            {6,5,4,3,2},
            {0,8,6,4,2},
            {1,3,5,7,9}
        };
        printLeadingDiagonal(arr);
        printTrailingDiagonal(arr);
    }
}
