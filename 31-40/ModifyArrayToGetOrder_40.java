public class ModifyArrayToGetOrder_40 {

    static void parray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    /*
     * The code checks if an array of integers nums can become non-decreasing by
     * modifying at most one element.
     * 
     * It starts with a counter cnt initialized to 0, which will keep track of the
     * number of modifications made to the array.
     * 
     * Then, it iterates through the nums array starting from the second element
     * (index 1), comparing each current element with the previous one. If the
     * current element is smaller than the previous one, cnt is incremented by 1. If
     * cnt is greater than 1, the function immediately returns false, as more than
     * one modification is not allowed.
     * 
     * Otherwise, the code checks if the element two indices before the current one
     * (i - 2) is greater than the current element. If it is, then the current
     * element is modified to be equal to the previous one (nums[i] = nums[i - 1]).
     * This is because, if the previous element is greater than the current element
     * and the element two indices before is also greater than the current element,
     * then changing the previous element will result in a decreasing sequence,
     * which is not allowed.
     * 
     * If the element two indices before is not greater than the current element,
     * then the previous element is modified to be equal to the current element
     * (nums[i - 1] = nums[i]).
     * 
     * At the end of the loop, the function returns true if the number of
     * modifications is less than or equal to 1.
     */

    public static boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                cnt++;
                if (cnt > 1)
                    return false;
                if (i - 2 >= 0 && nums[i] < nums[i - 2])
                    nums[i] = nums[i - 1];
                else
                    nums[i - 1] = nums[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int a[] = { 4, 2, 3 };
        // int a[]={4,2,3,6,5,8,7};
        // int a[]={8,6,7,2,9,1,5};
        parray(a);

        // for (int i = 0; i < a.length-1; i++) {
        // if (a[i]>a[i+1]) {

        // for (int j = 1; j < 10; j++) {
        // if (i>0 && j>a[i-1] && j<a[i+1]) {
        // System.out.println(j);
        // a[i]=j;
        // }

        // else if(i==0 && j<a[i+1]){
        // a[i]=j;
        // }
        // }

        // }

        // else if (a[i]>a[i+1]) {
        // for (int j = 1; j < 10; j++) {
        // if (j>a[i-1] && j<a[i+1]) {
        // a[i]=j;
        // }
        // }
        // }
        // }

        System.out.println(checkPossibility(a));
        // checkPossibility(a);
        parray(a);
    }
}
