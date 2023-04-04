//In this code, the larger of the two numbers is divided by the smaller one by repeatedly subtracting the divisor from the dividend until the dividend is less than the divisor. The number of subtractions performed is the quotient, and the final value of the dividend is the remainder.

public class QuotientAndRemainderWithoutModulo_29 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 4;
        int quotient = 0;
    
        if (num1 < num2) {
          int temp = num1;
          num1 = num2;
          num2 = temp;
        }
    
        while (num1 >= num2) {
          num1 -= num2;//num1=num1-num2
          quotient++;
        }
    
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + num1);
      
    }
}
