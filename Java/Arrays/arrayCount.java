package Arrays;
//Given N array elements, count the number of elements greater than itself:
//Time complexity - O(n), Space complexity - O(1)

class arrayCount{
    public static int findCount(int[] arr){
        int n = arr.length;
        int max = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==max)
            {
                count++;
            }
        }
        return n-count;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,1,4,6,8,0,2,8,6,8};
        int result = findCount(arr);
        System.out.println(result);
    }
}