import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // USE ONLY SORTED ARRAY
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Enter the key to search: "); // Added prompt for user input
        int key = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int flag = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at position " + mid); // Changed print to println for cleaner output
                flag = 1; // Changed flag = flag+1 to flag =1 for simplicity
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (flag == 0) {
            System.out.println("Element not found");
        }
        sc.close(); // Close scanner to release resources
    }
}