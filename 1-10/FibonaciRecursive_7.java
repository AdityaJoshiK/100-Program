import java.util.Scanner;

public class FibonaciRecursive_7 {

    //approach 1
    static int Fibonaci(int n)
    {
        if (n <= 1)
            return n;

        return Fibonaci(n-1) + Fibonaci(n-2);
    }

    //approcah 2
    static int Fibonaci(int n,int first,int second,int i)
    {

        if (i==n) {
            return 1;
        }

        int third=first+second;
        System.out.print(third+" ");

        return Fibonaci(n,second, third,i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n=sc.nextInt();

        System.out.print(0+" "+1+" ");
        Fibonaci(n, 0, 1, 2);

        System.out.println();
        for (int i = 0; i < n; i++)
            System.out.print(Fibonaci(i) + " ");

        sc.close();
    }
}
