import java.util.HashMap;
import java.util.Scanner;

public class FindSumPairs_43 {

    public static void efficient_approach(int a[],int k) {
       int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(k - a[i])) {
                count++;
            }
            map.put(a[i], i);
        }

        System.out.println(count);
    }

    static void my_approach(int a[],int k)
    {
        int count=0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]+a[j]==k) {
                    System.out.println("a["+i+"]"+"+"+"a["+j+"]"+"="+k);
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        int a[]={1,5,7,1};

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter k:");
        int k=sc.nextInt();
        
        my_approach(a, k);
        efficient_approach(a, k);

        sc.close();
    }
}
