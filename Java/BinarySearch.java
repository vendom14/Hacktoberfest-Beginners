import java.util.Scanner;

/**
 * Implemented an iterative Binary Search Algorithm
 * Note: The input array must be sorted for this to work
 */

class BinarySearch {

    /**
     * Time Complexity: O(log n), as the search space is halved in each iteration.
     * Space Complexity: O(1), as it uses a constant amount of extra space.
     */

    public static void main(String[] args) {
        int a[];
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();

        a = new int[n];

        System.out.println("Enter sorted values into the array:");
        for (int i = 0; i < n; ++i) {
            System.out.printf("Enter element at index %d: ", i);
            a[i] = sc.nextInt();
        }

        System.out.print("Enter an element to search: ");
        int key = sc.nextInt();

        int position = binarySearch(a, a.length, key);

        if (position == -1) {
            System.out.println("Key not found :(");
        } else {
            System.out.println("Key found at " + (position + 1) + " position");
        }
    }

    /**
     * Performs a binary search on a sorted integer array
     * @param a The sorted array to search
     * @param n The size of the array
     * @param key The element to search
     * @return The index of the key if found, otherwise -1
     */

    public static int binarySearch(int a[], int n, int key) {
        int lb = 0;
        int ub = n - 1;

        while (lb <= ub) {
            int mid = (lb + ub) / 2;

            // The core logic: check the middle element
            // If it's a match, we're done
            // If the key is larger, we search the right half
            // If the key is smaller, we search the left half
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                lb = mid + 1; // Search the right half
            } else {
                ub = mid - 1; // Search the left half
            }
        }
        
        // If the loop finishes, the key was not in the array
        return -1;
    }
}