package CollectionAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApi {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums2 = new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums2.add(2);
        nums2.add(2);
        nums2.add(2);
        nums2.add(2);
        for(int n : nums){
            System.out.println(n);
        }
        System.out.println(nums);
        System.out.println(nums2.get(0));
    }
}
