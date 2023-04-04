import java.util.Scanner;

public class FindElementInArrayUsingRecursion_25 {

    static int isInArray(int a[],int m,int i)
    {
        if (a.length==i) {
            return -1;
        }

        if (a[i]==m) {
            return i;
        }

        return isInArray(a, m, i+1);
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int a[]={1,2,3,4,5};

        System.out.print("Enter Element:");;
        int m=sc.nextInt();
        
        int result=isInArray(a, m, 0);

        if (result==-1) {
            System.out.println("Element Not Found!");
        }

        else{
            System.out.println("Element Found At Index "+result);
        }

        sc.close();
    }
}
