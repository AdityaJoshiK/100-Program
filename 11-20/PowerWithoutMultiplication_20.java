import java.util.Scanner;

// We can calculate power by using repeated addition. For example to calculate 5^6. 

// 1) First 5 times add 5, we get 25. (5^2) 
// 2) Then 5 times add 25, we get 125. (5^3) 
// 3) Then 5 times add 125, we get 625 (5^4) 
// 4) Then 5 times add 625, we get 3125 (5^5) 
// 5) Then 5 times add 3125, we get 15625 (5^6)

public class PowerWithoutMultiplication_20 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number:");
        int n=sc.nextInt();

        System.out.print("Enter Power:");
        int p=sc.nextInt();

        int ans=n,increment=n;

        for (int i = 1; i < p; i++) {
            
            for (int j = 1; j < n; j++) {
                ans+=increment;
            }
            increment=ans;
        }

        System.out.println(ans);

        sc.close();
    }
}
