package Arrays;

// *Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
// *Time complexity - O(n), Space complexity - O(1)

public class SortNumbers {

    public static void sort012(int arr[])
    {
        int zero=0;
        int one=0;
        int two=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
            else if(arr[i]==1)
            {
                one++;
            }
            else
            {
                two++;
            }
        }
        int index=0;
        for(int i=0;i<zero;i++)
        {
            arr[index]=0;
            index++;
        }
        for(int i=0;i<one;i++)
        {
            arr[index]=1;
            index++;
        }
        for(int i=0;i<two;i++)
        {
            arr[index]=2;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,1,0,2,1};
        sort012(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
