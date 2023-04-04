import java.util.Scanner;

public class OddEvenWithoutModulo_9 {

    static void oddevenwithdivmul(int n)
    {
        if ((n/2)*2==n) {
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n=sc.nextInt();

        oddevenwithdivmul(n);

        sc.close();
    }
}
