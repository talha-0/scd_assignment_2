import java.util.ArrayList;
import java.util.List;

public class q3 {
    static void mergeIntervals(List<int[]> intervals) {
        for (int i=0;i<intervals.size()-1;i++){
            int[] interval1 = intervals.get(i);
            int[] interval2 = intervals.get(i+1);
            if (interval1[1] >= interval2[0]){
                interval1[1] = Math.max(interval1[1],interval2[1]);
                intervals.remove(i+1);
                i--;
            }
        }
    }
    public static void main(String[] args){
        List<int[]> intervals = new ArrayList<>();
        intervals.add(new int[]{1,3});
        intervals.add(new int[]{2,6});
        intervals.add(new int[]{8,10});
        intervals.add(new int[]{15,18});
        
        mergeIntervals(intervals);

        System.out.println("Merged intervals: \n[");
        for (int[] interval : intervals){
            System.out.println("\t[" + interval[0] + "," + interval[1] + "]");
        }
        System.out.println("]");
    }

}
