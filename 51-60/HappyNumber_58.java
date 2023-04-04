import java.util.HashSet;

public class HappyNumber_58 {
    public static void main(String[] args) {
        int n=50,s=n,digit=0,sum=0;

        HashSet<Integer> set = new HashSet<>();

        while (n!=1 && !set.contains(n)) {
            set.add(n);
            // System.out.println(n);
            while(n>0){
            digit=n%10;
            sum+=digit*digit;
            n=n/10;
            }
            n=sum;
            // System.out.println(sum);
            sum=0;
        }

        if (n == 1) {
            System.out.println("The number " + s + " is a happy number.");
        } else {
            System.out.println("The number " + s + " is not a happy number.");
        }
        
        
    }
}
