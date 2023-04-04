public class SelectionSort_18 {
    public static void main(String[] args) {
        
        int a[]={5,1,12,-5,16,2,12,14};

        int minj,minx;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < a.length-1; i++) {
            minj=i;
            minx=a[i];

            for (int j = i+1; j < a.length; j++) {
                
                if (a[j]<minx) {
                    minj=j;
                    minx=a[j];
                }
            }

            a[minj]=a[i];
            a[i]=minx;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
