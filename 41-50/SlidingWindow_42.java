public class SlidingWindow_42 {
    public static void main(String[] args) {
        int nums[]={1,3,-1,-3,5,3,6,7};

        int start,end,max=0;

        int k=3;
        
        int result[] = new int[nums.length - k + 1];

        start=0;
        end=k-1;
        for (int i = 0; i < nums.length; i++) {
            // System.out.println();
            // System.out.println(start+" "+end);
            max=nums[start];
            for (int j = start; j <= end; j++) {
                // System.out.print(nums[j]+",");

                if (nums[j]>max) {
                    max=nums[j];
                }
            }
            result[i]=max;
            if (start==(nums.length-k)) {
                break;
            }
            start++;
            end++;
            max=0;
        }
        System.out.println();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+",");
        }
    }
}
