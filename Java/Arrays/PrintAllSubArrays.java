package Arrays;

//Given an array of N elements, print all the subarrays.
//Time complexity - O(n^3), Space complexity - O(1)

public class PrintAllSubArrays {

    public static void printAllSubArrays(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,8,3,7,10,4,2,1};
        printAllSubArrays(arr);
    }
}
