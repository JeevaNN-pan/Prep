###Imagine you are part of a software development team at a
tech company, and your manager has assigned you a task
related t Inancial data anal s• The com an Is accounting
system has just reporte four eyfinancial metric fora
project, denoted as a, b, c, and d. However, there is a twist:
some of these metrics might be negative, indicating a loss.
Your task is to identify and sum up all the negative metrics.
If there are no negative values, the system should return O,
ensuring no incorrect financial interpretation. Your solution
will help the finance team quickly assess any losses that need
immediate attention.###





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
