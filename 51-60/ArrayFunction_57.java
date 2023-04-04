public class ArrayFunction_57 {

    static int check(int a[])
    {
        int s=0;
        for (int i = 0; i < a.length; i++) {
            if (i!=a.length-1 && a[i]<=a[i+1]) {
                s++;
            }
        }

        if (s==a.length-1) {
            int c=0,v=0;

            for (int i = 0; i < a.length; i++) {
                v=a[i];
                for (int j = i+1; j < a.length; j++) {
                    if (v==a[j]) {
                        c++;
                    }
                    if (c>=3) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        // int a[]={1,1,1,3,3,3,3};
        // int a[]={1,1,1,2,2};
        int a[]={2,2,2,1,1,1};

        System.out.println(check(a));
    }
}
