package Arrays;

//Given a string, find  the pattern and count the pairs that contain 'a' character and then 'g' and can contain any number of gap in between them: 
// Condition: find the pairs a-->g not g-->a : i<j
//Time complexity for countPattern1 - O(n^2), Space complexity - O(1)
//Time complexity for countPattern2 - O(n), Space complexity - O(1)

public class CountStringPattern {
    public static void countPattern1(String str)
    {
        int n = str.length();
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i) == 'a')
            {
                for(int j=i+1;j<n;j++)
                {
                    if(str.charAt(j) == 'g')
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void countPattern2(String str)
    {
        int n = str.length();
        int count_a = 0;
        int res = 0;
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i) == 'a')
            {
                count_a++;
            }
            else if(str.charAt(i) == 'g')
            {
                res = res + count_a;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        String s = "adfgedsagga";
        countPattern1(s);
        countPattern2(s);
    }
}
