package Bit_Manipulations;

// *Given an array of integers, where every element appears twise except for one element which appears once. find that unique element.
// *Time complexity - O(n), Space complexity - O(1)

public class FindUniqueElement {

    public static void findUniqueElement(int[] arr)
    {
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans^=arr[i];
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = {11,12,12,13,13};
        findUniqueElement(arr);
    }
}
