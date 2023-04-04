import java.util.Scanner;

public class FindTotalOddEven_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n=sc.nextInt();

        int even=0,odd=0;

        while (n>0) {
            
            if ((n%10)%2==0) {
                even++;
            }
            else{
                odd++;
            }
            n=n/10;
        }

        System.out.println("even:"+even);
        System.out.println("odd:"+odd);

        sc.close();
    }
}
