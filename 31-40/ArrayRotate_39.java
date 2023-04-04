public class ArrayRotate_39 {

    static void parray(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};

        int k=3,temp=0;

        for (int i = 0; i < k; i++) {
            temp=a[a.length-1];
            
            for (int j = a.length-1; j >0; j--) {
                a[j]=a[j-1];
            }
            a[0]=temp;
        }
        parray(a);
    }
}
