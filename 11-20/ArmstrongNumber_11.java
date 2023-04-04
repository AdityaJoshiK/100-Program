import java.util.Scanner;

public class ArmstrongNumber_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter n:");
        String n=sc.nextLine();

        int len=n.length(); 
        
        int num=Integer.parseInt(n);
        int originalnum=num,digit;
        double sum=0;

        while (originalnum!=0) {
            digit=originalnum%10;
            sum=sum+Math.pow(digit,len);
            originalnum=originalnum/10;
        }

        if (sum==num) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        sc.close();
    }
}
