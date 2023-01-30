package Arrays;

// *Given an array of N elements and a number B, find minimum number of swaps to bring all numbers <=B together.
//*Time complexity - O(), Space complexity - O()

public class MinimumSwaps {

    public static void findMinimumNumberOfSwaps(int[] arr, int B)
    {
        int n = arr.length;
        int k=0; // to count the numbers which <=B
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=B)
            {
                k++;
            }
        }
        if(k==0 || k==1) // Edge case
        {
            System.out.println("0");
        }
        else
        {
            int bad=0;
            for(int i=0;i<k;i++)
            {
                if(arr[i]>B)
                {
                    bad++;
                }
            }
            int ans = bad;
            int s=1;
            int e=k;
            while(e<n)
            {
                if(arr[s-1]>B)
                {
                    bad--;
                }
                if(arr[e]>B)
                {
                    bad++;
                }
                ans = Math.min(ans,bad);
                s++;
                e++;
            }
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,1,7,32,6,1,3,7,21};
        findMinimumNumberOfSwaps(arr, 8);
    }
}
