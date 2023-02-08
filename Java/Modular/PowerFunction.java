package Modular;

// *Given a, n, p, calculate (a^n)%p without using built-in functions.
// * Constraints - 1<=a<=10^9, 2<=p<=10^9, 1<=n<=10^9
// *Time complexity for findPowerMod1 - O(n), Space complexity - O(1)
// *Time complexity for findPowerMod2 - O(n), Space complexity - O(1)

public class PowerFunction {

    public static int findPowerMod1(int a,int n, int p){
        int ans=1;
        for(int i=0;i<n;i++)
        {
            ans=ans*a;
        }
        ans=ans%p;
        return ans;
    }

    public static long findPowerMod2(int a, int n, int p){
        long ans=1;
        for(int i=1;i<=n;i++)
        {
            ans=(ans*a)%p;
        }
        ans=ans%p;
        return ans;
    }

    public static void main(String[] args) {
        int a = 9;
        int n = 7;
        int p = 11;
        int res1 = findPowerMod1(a, n, p);
        long res2 = findPowerMod2(a, n, p);
        System.out.println(res1);
        System.out.println(res2);
    }
}
