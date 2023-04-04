import java.util.Scanner;

public class BucketSort_19 {

    static void printArray(int a[],int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
    }

    //another approach
    public static void sort(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        int[] buckets = new int[max + 1];

        for (int value : array) {
            buckets[value]++;
        }

        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i]; j++) {
                array[index++] = i;
            }
        }
    }

    //my approach
    static void bucketSort(int a[],int n)
    {
        int b[]=new int[n];

        for (int i = 0; i < n; i++) {
            b[i]=0;
        }

        for (int i = 0; i < n; i++) {
            (b[a[i]])++;
        }

        for (int i = 0,j=0; i < n; i++) {
            for (; b[i]>0; (b[i])--) {
                a[j++]=i;
            }
        }
    }
    public static void main(String[] args) {
        // int a[]={45,96,29,30,27,12,39,61,91};
        int a[]=new int[20];
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Element");
        int n=sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+"a["+i+"]:");
            a[i]=sc.nextInt();
        }

        printArray(a,n);
        bucketSort(a,n);
        printArray(a,n);

        sc.close();
    }
}