import java.util.Scanner;

public class DecimalToBinary_30 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter N:");
        int n=sc.nextInt();

        int a[]=new int[32];
        int l=0;

        while (n!=0) {
            a[l]=n%2;
            System.out.println(n%2 +" "+n/2);
            l++;
            n=n/2;
        }
        for (int i = l-1; i >=0; i--) {
            System.out.print(a[i]);
        }
        
        sc.close();
    }
}
