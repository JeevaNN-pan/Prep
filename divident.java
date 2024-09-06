import java.util.Arrays;
public class divident {
    public static int div(int[] a,int d,int q,int r){
        int divi=d*q+r;
        for(int i=0;i<a.length;i++){
            if(a[i]==divi){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {15, 10, 30, 25, 50};
        int D = 5, Q = 2, R = 5;
        int result = div(A, D, Q, R);
        System.out.println(result); // Output: 0
    }
}
