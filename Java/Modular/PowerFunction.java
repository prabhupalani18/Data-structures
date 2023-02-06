package Modular;

// *Given a, n, p, calculate (a^n)%p without using built-in functions.
// * Constraints - 1<=a<=10^9, 2<=p<=10^9, 1<=n<=10^9
// *Time complexity for findPowerMod1 - O(n), Space complexity - O(1)

public class PowerFunction {

    public static int findPowerMod1(int a,int n, int p){
        int ans=1;
        for(int i=0;i<n;i++)
        {
            ans=ans*a;
        }
        return a%p;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 6;
        int p = 3;
        int res1 = findPowerMod1(a, n, p); 
        System.out.println(res1);
    }
}
