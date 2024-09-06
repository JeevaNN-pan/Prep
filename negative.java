public class negative {
    public static void sumofneg(int a, int b, int c, int d) {
        int[] nums = { a, b, c, d };
        int sumneg = 0;
        for (int num : nums) {
            if (num < 0) {
                sumneg += num;

            }

        }
        System.out.println(sumneg);

    }

    public static void main(String[] args) {
        int a = -3, b = 7, c = -1, d = 4;
        sumofneg(a, b, c, d);

    }
}
