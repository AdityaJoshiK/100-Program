import java.util.Arrays;

/**
 * Patterns_22
 */
public class Patterns_22 {

    static void pattern_1(int n)
    {
        int num=1,alpha=65;
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i; j++) {
                if (i%2!=0) {
                    System.out.print(num+" ");
                    num++;
                }
                else{
                    System.out.print((char)alpha+" ");
                    alpha++;
                }
            }
            System.out.println();
        }
    }

    static void pattern_2(int number)
    {
        int i, j;
        
        // Outer loop handle the number of rows
        for(i = number; i >= 1; i--)
        {
            
            // Inner loop print space
            for(j = i; j < number; j++)
            {
                System.out.print(" ");
            }
            
            // Inner loop print star
            for(j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print("*");
            }
            
            // Ending line after each row
            System.out.println("");
        } 
    }

    static void parray(char a[])
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println();
    }

    static void pattern_3(int n){
        char a[]=new char[n];

        Arrays.fill(a, '*');

        int i=0,nindex,bindex;
        parray(a);
        i++;

        if (i==1) {
            a[a.length/2]=' ';
        }
        
        nindex=a.length/2;
        bindex=a.length/2;

        parray(a);
        while (a[1]!=' ' && a[a.length-1]!=' ' ) {
            nindex=nindex+1;
            bindex=bindex-1;

            a[nindex]=' ';
            a[bindex]=' ';
            parray(a);
        }

    }
    public static void main(String[] args) {
        // pattern_1(5);
        // pattern_2(9);
        pattern_3(19);
    }
}