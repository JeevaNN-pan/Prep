import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class mid {
    public static void midelement(int[] a){
        List<Integer> farray=new ArrayList<>();
        for(int num : a){
            if(num>=0){
                farray.add(num);

            }
        }
        Collections.sort(farray);
        int mid=(farray.size()-1)/2;
        System.out.println(farray.get(mid));
        
    


    }
    public static void main(String[] args) {
        int[] a = {7, -3, 8, 2, -5, 10, 12};
        midelement(a);
    
    }
}
