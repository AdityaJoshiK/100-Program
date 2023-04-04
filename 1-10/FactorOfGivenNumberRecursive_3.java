import java.util.Scanner;

public class FactorOfGivenNumberRecursive_3 {

    static int Factor(int n,int i)
    {
        if (n%i==0) {
            System.out.print(i+" ");
        }

        if (i==n) {
            return 1;
        }

        return Factor(n, i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n:");
        int n=sc.nextInt();

        Factor(n, 1);
        sc.close();
    }
}
