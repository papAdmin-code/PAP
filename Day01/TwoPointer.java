import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        // Use only for sorted array
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target sum: "); // Added prompt for user input
        int key = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int flag = 0;

        while (low < high) {
            int sum = arr[low] + arr[high];

            if (sum == key) {
                System.out.println("Target is found"); // Changed print to println
                flag = 1; // Changed flag++ to flag=1
                break;
            } else if (sum < key) {
                low++;
            } else {
                high--;
            }
        }

        if (flag == 0) {
            System.out.println("Target is not found"); // Changed print to println
        }
        sc.close(); // Close the scanner
    }
}