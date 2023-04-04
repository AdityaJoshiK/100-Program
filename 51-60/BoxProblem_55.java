public class BoxProblem_55 {

    //wrong
    public static void main(String[] args) {
        int a[]={1,3,2,2,2,3,4,3,1};

        int count=1,point=0,end=0,s=0,ind=0;

        for (int i = 0; i < a.length-1; i++) {
            if (a[i]==a[i+1]) {
                System.out.println("Called for "+i);
                for (int j = i+1; a[j]==a[i]; j++) {
                    // System.out.println(count+" "+a[j]);
                    System.out.println(a[i]+" "+a[j]);
                    if (a[i]==a[j]) {
                        count++;
                    }
                }
                s=count;
                ind=i+count;
                while (s!=0) {
                    for (int j = ind; j < a.length; j++) {
                        a[j-1]=a[j];
                    }
                    s--;
                    ind--;
                }

                end=a.length-count;
            }
            point=count*count;
            
            if(i==2)
                break;

            // break;
        }

        System.out.println(point);

        for (int i = 0; i < end; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
