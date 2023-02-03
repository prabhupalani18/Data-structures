package Bit_Manipulations;

// *Given a decimal number, count it's set bits.
// *Time complexity for countSetBit1 - O(b), Space complexity - O(1)
// *Time complexity for countSetBit2 - O(logn), Space complexity - O(1)
// *where b is count of bits in the datatype.

public class CountSetBit {

    public static boolean checkBit(int n, int i)
    {
        if((n|(1<<i)) == n)
        {
            return true;
        }
        return false;
    }

    public static int countSetBit1(int n)
    {
        int ans = 0;
        for(int i=0;i<32;i++)
        {
            if(checkBit(n, i))
            {
                ans++;
            }
        }
        return ans;
    }

    public static int countSetBit2(int n)
    {
        int ans = 0;
        while(n>0)
        {
            if((n&1) == 1)
            {
                ans++;
            }
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int res1 = countSetBit1(4);
        int res2 = countSetBit2(4);
        System.out.println(res1);
        System.out.println(res2);
    }
}
