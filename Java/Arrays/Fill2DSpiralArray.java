package Arrays;

//* Given an 1-D array and 2-D indexes, fill the array elements into 2-D array in a spiral manner.
//* Time complexity - O(n*m), Space complexity - O(n*m)

public class Fill2DSpiralArray {

    public static int[][] fillSpiralMatrix(int[] arr, int n, int m)
    {
        int[][] spiralMatrix = new int[n][m];
        int[] x = {0,1,0,-1};  // * Incremental index for row
        int[] y = {1,0,-1,0};  // * Incremental index for column
        int s = n*m;
        int j = 0;
        int rowIndex = 0;
        int colIndex = 0;
        for(int i=0;i<s;i++)
        {
            spiralMatrix[rowIndex][colIndex] = arr[i];
            rowIndex+=x[j];
            colIndex+=y[j];
            if((rowIndex>=n || colIndex>=m || rowIndex<0 || colIndex<0) || (spiralMatrix[rowIndex][colIndex]!=0)) //* Checking for edges and already filled elements in spiral matrix
            {
                rowIndex-=x[j]; // * Resetting the row edge index
                colIndex-=y[j]; // * Resetting the column edge index
                j=(j+1)%4;      // * Resetting the index of incremental arrays x,y if it reach 4 (size of the array)
                rowIndex+=x[j];
                colIndex+=y[j];
            }
        }
        return spiralMatrix;
    }

    public static void print2DMatrix(int[][] twoDArray)
    {
        int n = twoDArray.length;
        int m = twoDArray[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(twoDArray[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[][] result = fillSpiralMatrix(arr, 3, 3);
        print2DMatrix(result);
    }
}
