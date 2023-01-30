package Arrays;

// *Given an 2D array of square matrix, Rotate the array 90 degree with space complexity O(1).
//*Time complexity - O(N^2), Space complexity - O(1)

public class RotateSquareMatrix {

    public static void rotateMatrix(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<n;j++) //* Transpose square matrix */
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++) //* Reverse each row */
        {
            int endColIndex = m-1;
            int startRowIndex = 0;
            while(startRowIndex<endColIndex)
            {
                int temp = arr[i][startRowIndex];
                arr[i][startRowIndex] = arr[i][endColIndex];
                arr[i][endColIndex] = temp;
                endColIndex--;
                startRowIndex++;
            }
        }
        for(int i=0;i<n;i++) //* Print square matrix */
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,0},
            {2,4,6,8,1},
            {3,5,7,9,2},
            {4,8,1,4,9}
        };
        rotateMatrix(arr);
    }
}
