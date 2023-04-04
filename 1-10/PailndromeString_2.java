import java.util.Scanner;

public class PailndromeString_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String:");
        String s=sc.nextLine();

        int p=s.length()-1,ans=0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==s.charAt(p)) {
                ans=ans+1;
            }
            p--;
        }
            
        if (ans==s.length()) {
            System.out.println("Pailndrome");
        }
        else{
            System.out.println("Not");
        }
        sc.close();
    }
}
