package Arrays;

// *Given square matrix arr[N][N], print values in spiral in clockwise direction.
// *Time complexity - O(n), Space complexity - O(1)

public class PrintSpiralMatrix {

    public static void printSpiralClockwise(int[][] arr)
    {
        int n = arr.length;
        int i=0;
        int j=0;
        while(n>1)
        {
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
            i++;
            j++;
            n-=2;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {2,4,6,8},
            {1,3,5,7},
            {4,8,2,6},
            {1,5,9,7}
        };
        printSpiralClockwise(arr);
    }
}
