import java.util.Scanner;

public class Digit {
    static int count;

    public static int countNumber(int n)
    {
       while(n>0)
       {
           n=n/10;
           count+=1;
       }
       return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of digits :");
        int n= sc.nextByte();
        int ans = countNumber(n);
        System.out.println("number of digits in the number are :"+ans);
    }

}
