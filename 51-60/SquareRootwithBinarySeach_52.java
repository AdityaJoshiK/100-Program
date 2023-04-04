// public class SquareRootwithBinarySeach_52 {
//     public static void main(String[] args) {
        
//         double n=625;

//         double start=0,stop=n,middle=n/2;

//         while ((middle*middle)!=n) {
//             if (middle*middle>=n) {
//                 stop=middle;
//             }
//             else{
//                 start=middle;
//             }
//             middle=(start+stop)/2;
            
//         }

//         System.out.println(middle);
//     }
// }
public class SquareRootwithBinarySeach_52 {
    public static void main(String[] args) {
        
        int n = 65;
        int start = 0, stop = n, middle = n / 2;
        int prev_middle = -1;

        while (prev_middle != middle) {
            if (middle * middle > n) {
                stop = middle;
            } else {
                start = middle;
            }
            prev_middle = middle;
            middle = (start + stop) / 2;
        }

        System.out.println(middle);
    }
}
