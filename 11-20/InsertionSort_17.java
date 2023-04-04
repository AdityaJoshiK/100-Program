public class InsertionSort_17 {
    public static void main(String[] args) {
        
        int a[]={5,1,12,-5,16,2,12,14};

        int x;
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        for (int i = 1; i < a.length; i++) {
            x=a[i];

            for (int j = i-1; j >=0; j--) {
                if (x<a[j]) {
                    a[j+1]=a[j];
                    a[j]=x;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
