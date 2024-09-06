public class linear {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 8;
        int result = lineart(nums, target);
        System.out.println("Target found at index: " + result);
    }

    public static int lineart(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1; // Return -1 if the target is not found
    }
}
