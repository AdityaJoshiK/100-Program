public class OctalToHexaDecimal_44 {

    static int ocatlToDecimal(int n)
    {
        int b=0;
        int i=0;

        while (n!=0) {
            b+=(n%10*Math.pow(8, i));
            i++;
            n=n/10;
        }

        return b;
    }

    static String decimaltoHexa(int n)
    {
        String hex="";
        String hexDigits="0123456789ABCDEF";
        int rem;

        while (n!=0) {
            rem=n%16;
            hex=hexDigits.charAt(rem)+hex;
            n=n/16;
        }

        return hex;
    }
    public static void main(String[] args) {
        //first convert to octal to decimal

        int n=1234,i=0;
        int r[]=new int[32];

        int decimal=ocatlToDecimal(n);

        System.out.println(decimaltoHexa(decimal));
    }
}
