import java.util.Scanner;

public class Rev_digit {
    public static int returnRev(int x)
    {
        int rev=0;
        while(x!=0)
        {
            int lastdigit=x%10;
            rev=rev*10+lastdigit;
            x/=10;

        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numbers :");
        int x= sc.nextInt();
        int ans = returnRev(x);
        System.out.println("reversed number :"+ans);
    }
}
