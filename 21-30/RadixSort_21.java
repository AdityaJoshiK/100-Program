public class RadixSort_21 {

    static int findmax(int a[])
    {
        int max=0;

        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max=a[i];
            }
        }

        return max;
    }

    static void parray(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println();
    }

    static void countSort(int a[],int max,int pos)
    {
        int c[]=new int[10];
        int b[]=new int[a.length];

        for (int i = 0; i < a.length; i++) {
            ++c[(a[i]/pos)%10];
        }

        for (int i = 1; i <= max; i++) {
            c[i]=c[i]+c[i-1];
        }

        for (int i = a.length-1; i >=0; i--) {
            b[--c[(a[i]/pos)%10]]=a[i];
        }

        for (int i = 0; i < b.length; i++) {
            a[i]=b[i];
        }
    }

    public static void main(String[] args) {
        
        int a[]={3,6,4,1,3,4,1,4,2};

        int max=findmax(a);

        for (int pos = 1; max/pos >0; ) { 
            countSort(a, max, pos);
            pos=pos*10;
        }

        parray(a);
    }
}
