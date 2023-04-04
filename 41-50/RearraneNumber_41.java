import java.util.Arrays;

public class RearraneNumber_41 {
    public static int rearrangeDigits(int num) {
        // Step 1: Convert the integer to a string
        String numStr = Integer.toString(num);

        // Step 2: Convert the string to a character array and sort the array in ascending order
        char[] sortedNumArr = numStr.toCharArray();
        Arrays.sort(sortedNumArr);

        // Step 3: Find the first non-zero digit and swap it with the first digit in the array
        int i = 0;
        while (i < sortedNumArr.length && sortedNumArr[i] == '0') {
            i++;
        }
        if (i > 0 && i < sortedNumArr.length) {
            char temp = sortedNumArr[0];
            sortedNumArr[0] = sortedNumArr[i];
            sortedNumArr[i] = temp;
        }

        // Step 4: Convert the rearranged character array to an integer and return it
        String rearrangedNumStr = new String(sortedNumArr);
        int rearrangedNum = Integer.parseInt(rearrangedNumStr);
        return rearrangedNum;
    }

    public static void main(String[] args) {
        // rearrangeDigits(310);
        System.out.println(rearrangeDigits(310));
    }
}
