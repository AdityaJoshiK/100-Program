import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayIntersection_35 {

    //my approach
    static void parray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    static int[] interSection(int num1[],int num2[])
    {
        int flength;

        if (num1.length>num2.length) {
            flength=num1.length;
        }
        
        else{
            flength=num2.length;
        }

        int a[]=new int[flength];
        int e;

        for (int i = 0; i < num1.length; i++) {
            e=num1[i];

            for (int j = 0; j < num2.length; j++) {
                if (e==num2[j]) {
                    a[i]=e;
                }
            }
        }

        return a;
    }

        //more efficient(chatgpt approach)
        public static int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> result = new ArrayList<>();
            
            for (int num : nums1) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            
            for (int num : nums2) {
                if (map.containsKey(num) && map.get(num) > 0) {
                    result.add(num);
                    map.put(num, map.get(num) - 1);
                }
            }
            
            int[] res = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                res[i] = result.get(i);
            }
            
            return res;
        }
        
    public static void main(String[] args) {
        // int num1[]={1, 2, 2, 1};
        // int num2[]={2, 2};

        int[] num1 = {4, 9, 5};
        int[] num2 = {9, 4, 9, 8, 4};

        parray(interSection(num1, num2));
        parray(intersect(num1, num2));
    }
}
