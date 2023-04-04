import java.util.Scanner;

public class BinaryToDecimal_26 {

    static int getDecimal(int binary)
    {
        int decimal=0,n=0,temp;

        while (binary!=0) {
            temp=binary%10;
            decimal+=temp*Math.pow(2, n);
            n++;
            binary=binary/10;
        }

        return decimal;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Binary:");
        int n=sc.nextInt();

        System.out.println(getDecimal(n));

        sc.close();
    }
}
