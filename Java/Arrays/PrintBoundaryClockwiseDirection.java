package Arrays;

// *Given square matrix arr[N][N], print boundary in clockwise direction.
// *Time complexity - O(n), Space complexity - O(1)

public class PrintBoundaryClockwiseDirection {

    public static void printBoundaryClockwiseDirection(int[][] arr)
    {
        int n = arr.length;
        int i = 0;
        int j = 0;
        for(int k=0;k<n-1;k++)
        {
            System.out.print(arr[i][j]+" ");
            j++;
        }
        for(int k=0;k<n-1;k++)
        {
            System.out.print(arr[i][j]+" ");
            i++;
        }
        for(int k=0;k<n-1;k++)
        {
            System.out.print(arr[i][j]+" ");
            j--;
        }
        for(int k=0;k<n-1;k++)
        {
            System.out.print(arr[i][j]+" ");
            i--;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,0,1,2},
            {3,4,5,6}
        };
        printBoundaryClockwiseDirection(arr);
    }
}
