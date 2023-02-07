package Bit_Manipulations;

// * Construct a binary number with A is followed by B 0's, and return decimal value of number formed.
// * Time complexity - O(A), Space complexity - O(1)

public class ConstructBinaryNumber {

    public static int constructBinaryNumber(int A, int B)
    {
        int ans=0;
        int C = A+B;
        for(int i=C-1;i>B-1;i--)
        {
            ans=ans|(1<<i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int res = constructBinaryNumber(3, 2);
        System.out.println(res);
    }
}
