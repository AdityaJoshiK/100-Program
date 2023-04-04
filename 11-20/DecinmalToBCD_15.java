import java.util.Scanner;

public class DecinmalToBCD_15 {

    public static void BCDConversion(int n)
    {
       
        // Base Case
        if(n == 0)
        {
            System.out.print("0000");
        }
       
        // To store the reverse of n
        int rev = 0;
       
        // Reversing the digits
        while (n > 0)
        {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        System.out.println(rev);
         
        // Iterate through all digits in rev
        while(rev > 0)
        {
           
            // Find Binary for each digit
            // using bitset
            String b = Integer.toBinaryString(rev % 10);//it gives binary of digit

            b = String.format("%04d", Integer.parseInt(b));
             
              // Print the Binary conversion
            // for current digit
            System.out.print(b + " ");
           
            // Divide rev by 10 for next digit
            rev /= 10;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter N:");
        int n=sc.nextInt();

        BCDConversion(n);

        sc.close();
    }
}
