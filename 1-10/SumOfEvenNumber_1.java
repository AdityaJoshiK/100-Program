import java.util.Scanner;

/**
 * SumOfEvenNumber
 */
public class SumOfEvenNumber_1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Number:");
        int n=sc.nextInt();

        int sum=0;

        for (int i = 0; i <=n; i++) {
            if (i%2==0) {
                sum+=i;
            }
        }

        System.out.println("Sum:"+sum);
        sc.close();

    }
}