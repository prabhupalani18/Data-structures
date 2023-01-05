package Arrays;

//Given N array elements and Q queries, For each query, count all even elements in range [L,R]:
//Time complexity - O(n+q), Space complexity - O(n)

public class CountEvenInRange {

    public static void countEven(int[] arr,int l,int r)
    {
        int n = arr.length;
        int[] e = new int[n];
        //Creating an array for finding even element index
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                e[i]=1;
            }
            else{
                e[i]=0;
            }
        }
        //Prefix sum for that index array
        for(int i=1;i<n;i++)
        {
            e[i] = e[i-1] + e[i];
        }
        int count=0;
        if(l==0)
        {
            count=e[r];
        }
        else{
            count=e[r]-e[l-1];
        }
        System.out.print(count+" ");
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,9,7,8,12,11};
        int l=0;
        int r=4;
        countEven(arr, l, r);
    }
}
