public class CountingSort_27 {

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

    public static void main(String[] args) {
        
        int a[]={3,6,4,1,3,4,1,4,2};

        int max=findmax(a);

        int c[]=new int[max+1];
        int b[]=new int[a.length];

        for (int i = 0; i < a.length; i++) {
            ++c[a[i]];
        }

        for (int i = 1; i <=max; i++) {
            c[i]=c[i]+c[i-1];
        }

        parray(c);

        for (int i = a.length-1; i >= 0; i--) {
            b[--c[a[i]]]=a[i];
        }

        parray(b);
    }
}
