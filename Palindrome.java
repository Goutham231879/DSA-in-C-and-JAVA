import java.util.Scanner;

public class Palindrome {
    public static boolean returnPalindrome(int x)
    {
        int rev=0;
        int temp=x;
        while(x!=0)
        {
            int lastdigit=x%10;
            rev=rev*10+lastdigit;
            x/=10;

        }
        if(rev==temp)
        {
          return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numbers :");
        int x= sc.nextInt();
        boolean ans = returnPalindrome(x);
        System.out.println("reversed number :"+ans);
    }
}
