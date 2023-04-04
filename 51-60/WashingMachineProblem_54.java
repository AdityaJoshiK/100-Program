public class WashingMachineProblem_54 {
    public static void main(String[] args) {
        // greedy approach
        int a[] = { 1, 0, 5 };

        int sum = 0, d = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        if (sum % a.length == 0) {
            d = sum / a.length;

            int moves = 0;
            int total = 0;

            for (int i = 0; i < a.length; i++) {
                int diff = a[i] - sum;
                total += diff;
                // moves = Math.max(moves, Math.max(Math.abs(total), diff));
                if (Math.abs(total) > diff) {
                    moves = Math.max(moves, Math.abs(total));
                } else {
                    moves = Math.max(moves, diff);
                }
                
            }

            System.out.println(moves);
            
        }
        else
        System.out.println(-1);
    }
}
