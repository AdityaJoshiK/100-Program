import java.util.Scanner;

public class MaxMinAvgWithoutArrayAndWithoutInbuiltFunction_12 {
    public static void main(String[] args) {
        double min=0,max=0,flag=0,sum=0,numbers=0;

        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("Enter n:");
            double number=sc.nextDouble();

            if (number>0) {
                numbers++;
                sum+=number;

                if (number>max) {
                    max=number;
                }

                if (flag==0) {
                    min=number;
                    flag++;
                }
                if (number<min && number!=0) {
                    min=number;
                }
            }

            else{
                break;
            }
        }

        System.out.println("min:"+min);
        System.out.println("max:"+max);
        System.out.println("Avg:"+sum/numbers);

        sc.close();
    }
}
