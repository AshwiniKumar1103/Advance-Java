package  CollectionAPI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<Integer>();
        num.add(50);
        num.add(690);
        num.add(42);
        num.add(10);
        num.add(100);
        Iterator<Integer> values = num.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
        System.out.println(num);
        for (int n:num){
            System.out.println(n);
        }
    }
}
