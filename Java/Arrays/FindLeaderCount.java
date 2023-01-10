package Arrays;

//Given an array of N elements, find the number of leaders, where leader is an element that is greater than all the elements on its left: a[i]>a[0,i-1]
//Time complexity - O(n), Space complexity - O(1)

public class FindLeaderCount {

    public static void findLeaderCount(int[] arr){
        int n = arr.length;
        int lMax = arr[0];
        int count = 1;  // First element in the array is a leader
        for(int i=1;i<n;i++)
        {
            if(lMax<arr[i])
            {
                lMax=arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr = {4,6,7,1,3,9,-1,7};
        findLeaderCount(arr);
        int[] arr2 = {2,5,3,4,17,16};
        findLeaderCount(arr2);
    }
}
