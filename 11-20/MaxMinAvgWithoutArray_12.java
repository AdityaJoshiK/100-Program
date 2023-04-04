import java.util.Scanner;

//checkout second way without inbuilt function

public class MaxMinAvgWithoutArray_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to continue and 0 to exit:");

        System.out.println("Enter numbers:");

        double max = 0, min = 0, flag = 0, avg = 0, sum = 0, numbers = 0;

        while (true) {
            System.out.println("Enter number:");
            double number = sc.nextDouble();

            if (number > 0) {
                sum=sum+number;
                numbers++;
                max = Math.max(max, number);

                if (flag == 0) {
                    min = number;
                    flag++;
                } else {
                    min = Math.min(min, number);
                }
            }

            else {
                break;
            }

        }

        avg=sum/numbers;

        System.out.println("numbers:" + numbers);
        System.out.println("max:" + max);
        System.out.println("min:" + min);
        System.out.println("Avg:"+avg);

        sc.close();
    }
}