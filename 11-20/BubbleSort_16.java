/**
 * BubbleSort_16
 */
public class BubbleSort_16 {

    static void printArray(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    static int[] bubbleSort(int a[])
    {
        int temp=0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1]) {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int a[]={45,34,56,23,12};

        printArray(a);
        bubbleSort(a);
        printArray(a);
    }
}