package Arrays;

//Given an 2 array of square matrix, calculate transpose of the array with space complexity O(1) (i.e: transpose array in place and print).
//Time complexity for transposeMatrix1 - O(N^2), Space complexity - O(1)

public abstract class TransposeMatrix {

    public static void transposeMatrix1(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        try{
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<m;j++)
                {
                    int temp = arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,0},
            {2,5,7,9,1},
            {1,3,5,7,9},
            {4,6,8,0,2}
        };
        transposeMatrix1(arr);
    }
}
