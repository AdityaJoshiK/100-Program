import java.util.Scanner;

public class anglebetweenhourandminutehand_14 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter hour:");
        int h=sc.nextInt();

        System.out.println("Enter minute:");
        int m=sc.nextInt();

        double hangle=(h*60+m)*0.5;
        double mangle=m*6;

        double angle=Math.abs(hangle-mangle);

        if (angle<=180.0) {
            System.out.println(angle);
        }
        else{
            System.out.println(360.0-angle);
        }
        
        sc.close();
    }
}
