import java.util.Scanner;

public class insertelementarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;

        // Display original array
        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Get position and value from user
        System.out.println("\nEnter the position where you want to insert the element:");
        int position = scanner.nextInt();
        System.out.println("Enter the element:");
        int element = scanner.nextInt();

        // Check if position is a valid index for the array
        if (position < 0 || position > n) {
            System.out.println("Invalid position. Please enter a position between 0 and " + n + ".");
            return;
        }

        // Shift elements to the right of the given position
        for (int i = n-1; i >= position; i--) {
            arr[i+1] = arr[i];
        }

        // Insert the element at the given position
        arr[position] = element;

        // Update length of the array
        n++;

        // Display updated array
        System.out.println("\nArray after inserting the element:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
