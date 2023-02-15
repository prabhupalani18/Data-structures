package Arrays;

//* Given an unsorted and non-duplicate array, find the first missing positive integer with space complexity O(1).
//* Time complexity for findFirstPositiveInteger1 - O(n^2), Space complexity - O(1)

public class FirstPositiveInteger {

    public static int findFirstPositiveInteger1(int[] arr)
    {
        int n=arr.length;
        int i=1;
        for(i=1;i<=n;i++)
        {
            boolean flag=false;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==i)
                {
                    flag=true;
                }
            }
            if(!flag)
            {
                return i;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {-1,-4,7,1,2,3};
        int res1 = findFirstPositiveInteger1(arr);
        System.out.println(res1);
    }
}
