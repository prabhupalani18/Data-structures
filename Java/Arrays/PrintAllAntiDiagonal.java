package Arrays;

//Given an 2 array of N*M elements, print all anti-diagonal matrix.
//Time complexity - O(N*M), Space complexity - O(1)

public class PrintAllAntiDiagonal {

    public static void printAllAntiDiagonalMatrix(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<m;i++){
            int colIndex=i;
            int rowIndex=0;
            while(rowIndex<n && colIndex>=0)
            {
                System.out.print(arr[rowIndex][colIndex]+" ");
                colIndex--;
                rowIndex++;
            }
            System.out.println();
        }
        for(int i=1;i<n;i++)
        {
            int rowIndex = i;
            int colIndex = m-1;
            while(rowIndex<n && colIndex>=0)
            {
                System.out.print(arr[rowIndex][colIndex]+" ");
                rowIndex++;
                colIndex--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,3,5,7,9},
            {2,4,6,8,0},
            {0,5,8,1,6}
        };
        printAllAntiDiagonalMatrix(arr);
    }
}
