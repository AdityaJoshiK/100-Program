public class FindDistance_53 {
    public static void main(String[] args) {
        int n1=10,n2=18;

        int xor=n1^n2;

        System.out.println(xor);
        
        int count=0;

        while (xor>0) {
            if (xor%2==1) {
                count++;
            }
            xor=xor/2;
        }

        System.out.println("Distance between " + n1 + " and " + n2 + " is " + count);

    }
}
