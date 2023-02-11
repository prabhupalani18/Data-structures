package Arrays;

//* Given an array, find the product of all elements in it except the index element itself.
//* Time complexity - O(n), Space complexity - O(n)

public class ProductOfArray {

    public static int[] findProductOfArray(int[] arr)
    {
        int n = arr.length;
        int[] result = new int[n];
        int[] prefixMul = new int[n];
        int[] suffixMul = new int[n];
        prefixMul[0] = arr[0];
        suffixMul[n-1] = arr[n-1];

        for(int i=1;i<n;i++)  //* Prefix multiplication
        {
            prefixMul[i]=arr[i]*prefixMul[i-1];
        }

        for(int i=n-2;i>=0;i--) //* Suffix multiplication
        {
            suffixMul[i]=arr[i]*suffixMul[i+1];
        }

        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                result[i]=suffixMul[i+1];
            }
            else if(i==n-1)
            {
                result[i]=prefixMul[n-2];
            }
            else
            {
                result[i]=prefixMul[i-1]*suffixMul[i+1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,13,5};
        int[] result = findProductOfArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
