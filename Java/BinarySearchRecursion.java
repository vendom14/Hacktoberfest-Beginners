import java.util.Scanner;

/**
 * Implements the Binary Search algorithm using recursion
 * Note: The input array must be sorted for this to work
 */

class BinarySearchRecursion {

    /**
     * The core recursive function that performs the search
     * @param nums The array to search in
     * @param lb The lower bound (starting index) of the current search space
     * @param ub The upper bound (ending index) of the current search space.
     * @param key The element to find
     * @return The index of the key if found, otherwise -1
     * 
     * Time Complexity: O(log n), because the search space is halved in each step.
     * Space Complexity: O(log n), due to the recursion call stack depth.
     */

    public static int search(int[] nums, int lb, int ub, int key) {
        // Base Case: If the lower bound crosses the upper bound, the element is not in the array
        if (lb > ub) {
            return -1;
        }

        int mid = lb + (ub - lb) / 2; // A safe way to calculate mid to avoid overflow

        // Recursive Step: Check the middle element and decide which half to search next
        if (nums[mid] == key) {
            return mid; // Key found
        } else if (nums[mid] < key) {
            // If the key is larger, search the right half of the array
            return search(nums, mid + 1, ub, key);
        } else {
            // If the key is smaller, search the left half of the array
            return search(nums, lb, mid - 1, key); // BUG FIX: Was mid + 1
        }
    }

    /**
     * A helper function to start the binary search from the full array range
     */

    public static int binarySearch(int[] nums, int key) {
        // Initial call to the recursive search function.
        return search(nums, 0, nums.length - 1, key);
    }

    public static void main(String[] args) {
        int a[];
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();

        a = new int[n];

        System.out.println("Enter sorted values into array:");
        for (int i = 0; i < n; ++i) {
            System.out.printf("Enter element at index %d: ", i);
            a[i] = sc.nextInt();
        }

        System.out.print("Enter an element to search: ");
        int key = sc.nextInt();

        int position = binarySearch(a, key);

        if (position == -1) {
            System.out.println("Key not found :(");
        } else {
            System.out.println("Key found at " + (position + 1) + " position");
        }
    }
}