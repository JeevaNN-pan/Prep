###You're working on a new feature for a data visualization tool
that processes and displays data from various sensors. Each
sensor outputs an array of readings, but some sensors can
report errors, leading to negative values in the array. Your task
is to identify the central reading of the array while ignoring
these erroneous (negative) values.
This central reading is crucial because it represents the
median-like value after filtering out the bad data, which is
often used to understand the sensor's performance. If there
are two central readings (i.e., an even number of valid
readings), the tool should return the earlier one, as it's closer
to the start of the data sequence.###




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
