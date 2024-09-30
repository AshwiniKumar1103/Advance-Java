package CollectionAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer>nums= new ArrayList<>(10000);
        Random ran = new Random();
        for(int i=0;i<10000;i++){
            nums.add(ran.nextInt(100));
        }
        long seq1= System.currentTimeMillis();
        int sum1 = nums.stream()
                .map(i->i*2)
                .mapToInt(i->i)
                .sum();
        long end1=System.currentTimeMillis();
        long seq2=System.currentTimeMillis();
        int sum2 = nums.stream()
                .map(i->i*2)
                .mapToInt(i->i)
                .sum();
        long end2=System.currentTimeMillis();
        System.out.println(sum1+" "+sum2);
        System.out.println("time Taken by sum1 "+ (end1-seq1));
        System.out.println("time Taken by sum2 "+ (end2-seq2));
    }

}
