import java.util.Scanner;

public class DeletElementAtSpecificPositionArray_24 {

    static void parray(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5,6,7,8,9,10,11};

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Position:");
        int n=sc.nextInt();

        n=n-1;

        int flag=0;

        for (int i = 0; i < a.length; i++) {
            
            if (i==n) {
                flag=1;
                for (int j = i+1; j < a.length; j++) {
                    a[j-1]=a[j];
                }
                a[a.length-1]=0;
            }

            }
            
            if (flag==0) {
                System.out.println("Element Not Found!");
            
        }

        parray(a);

        sc.close();
    }
}
