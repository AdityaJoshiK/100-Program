import java.util.Scanner;

public class MultiplicationOfMatrix_13 { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int arows,acolumns;
        int brows,bcolumns;

        System.out.println("Enccter rows and columns of matrix 1");
        arows=sc.nextInt();
        acolumns=sc.nextInt();

        int a[][]=new int[arows][acolumns];

        System.out.println("Enter Elements Of Matrix 1:");

        for (int i = 0; i < arows; i++) {
            for (int j = 0; j < acolumns; j++) {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter rows and columns of matrix 2");
        brows=sc.nextInt();
        bcolumns=sc.nextInt();

        int b[][]=new int[brows][bcolumns];

        System.out.println("Enter Elements Of Matrix 2:");

        for (int i = 0; i < brows; i++) {
            for (int j = 0; j < bcolumns; j++) {
                b[i][j]=sc.nextInt(); 
            }
        }

        if (brows!=acolumns) {
            System.out.println("Error! We cannot multiply it");
        }

        else
        {
        int product[][]=new int[acolumns][brows];
        int sum=0;

        for (int i = 0; i < arows; i++) {

             for (int j = 0; j < bcolumns; j++) {

                for (int k = 0; k < brows; k++) {
                    sum+=a[i][k]*b[k][j];
                }

                product[i][j]=sum;
                sum=0;
            }
        }

        System.out.println("Product:");

        for (int i = 0; i < arows; i++) {
            
            for (int j = 0; j < bcolumns; j++) {
                
                System.out.print(product[i][j]+"\t");
            }
            System.out.println();
        }
    }
        sc.close();
    }
}