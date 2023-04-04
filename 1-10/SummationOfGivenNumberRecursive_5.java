import java.util.Scanner;

public class SummationOfGivenNumberRecursive_5 {

    static int Sum(int n)
    {
        if (n==0) {
            return 0;
        }
        return n%10+Sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n:");
        int n=sc.nextInt();

        System.out.println(Sum(n));

        sc.close();
    }
}
