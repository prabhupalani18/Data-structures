package Bit_Manipulations;

// *Unset ith bit of a number if it is set, otherwise don't change.
// *Time complexity - O(n), Space complexity - O(1)

public class UnsetBit {

    public static void unsetBit(int n,int i)
    {
        boolean flag = (n^(1<<i))<n;
        /*
         * Other flag options
         * (n|(1<<i)) == n
         * (n&(1<<i)) == (i<<1)
         */
        if(flag)
        {
            n=n^(1<<i);
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        unsetBit(45, 5);
    }
    
}
