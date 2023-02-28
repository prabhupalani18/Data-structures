package Arrays;

//* Given array is already sorted, and it has duplicate elements. Write a program to remove duplicate elements and return new array without any duplicate elements. The array should contain only unique elements.
//* Time complexity - O(n), Space complexity - O(n)

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr)
    {
        int n=arr.length;
        int i=1;
        int j=0;
        while(i<n)
        {
            if(arr[i]==arr[j])
            {
                i++;
            }
            else{
                arr[++j]=arr[i++];
            }
        }
        int[] result = new int[j+1];
        for(int c=0;c<=j;c++)
        {
            result[c]=arr[c];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,6,6,7};
        int[] result = removeDuplicates(arr);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
