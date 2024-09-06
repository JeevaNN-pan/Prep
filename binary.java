public class binary {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 2;
        int result = binarys(a, target);
        System.out.println("The number is at index: " + result);
    }

    public static int binarys(int[] a, int target) {
        int low = 0;              // `low` should start at 0
        int high = a.length - 1;  // `high` should start at the last index

        while (low <= high) {
            int mid = (low + high) / 2;  // Calculate the middle index
            if (a[mid] == target) {
                return mid;              // Return the index if the target is found
            } else if (a[mid] < target) {
                low = mid + 1;           // Adjust `low` if target is in the upper half
            } else {
                high = mid - 1;          // Adjust `high` if target is in the lower half
            }
        }
        return -1;  // Return -1 if the target is not found
    }
}
