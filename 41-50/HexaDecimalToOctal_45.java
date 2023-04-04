public class HexaDecimalToOctal_45 {

    static int HexaDecimalToDecimal(String n)
    {
        double decimal=0;
        int d=0,j=0;
        String hexDigits="0123456789ABCDEF";

        // for (int i = 0; i < n.length(); i++) {
        //     d=hexDigits.indexOf(n.charAt(i));
        //     System.out.print(d+" ");
        //     decimal=decimal*16+d;
        //     System.out.println(decimal);
        // }

        for (int i = n.length()-1; i >=0; i--) {
            d=hexDigits.indexOf(n.charAt(i));
            decimal=d*Math.pow(16, j)+decimal;
            j++;
        }

        return (int)decimal;
    }

    static void decimalToOctal(int n)
    {
        int digit=0,i=0;
        int r[]=new int[32];

        while (n!=0) {
            digit=n%8;
            r[i]=digit;
            i++;
            n=n/8;
        }

        for (int j = i-1; j >=0; j--) {
            System.out.print(r[j]);
        }
    }
    public static void main(String[] args) {
        String n="9d";

        int decimal=HexaDecimalToDecimal(n.toUpperCase());

        decimalToOctal(decimal);
    }
}
