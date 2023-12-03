import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers :");
        int n = sc.nextInt();
        int temp=n;


        int ans =returnarmstrong(n);
        if(ans==temp){
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }



    }

   static int sum=0;


    private static int returnarmstrong(int n) {

        while (n > 0) {
            int lastdigit = n % 10;
            sum = sum + lastdigit * lastdigit * lastdigit;
            n /= 10;
        }
       return sum;
    }
}