package CollectionAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numz = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                n = n * 2;
                sum += n;
            }
        }
        Predicate<Integer> p = new Predicate<Integer>() {

            public boolean test(Integer n) {
                return n % 2 == 0;
            }

        };
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        int result = s3.reduce(0, (c, e) -> c + e);
        System.out.println(result);
        System.out.println(sum);

        int result2 = numz.stream()
                .filter(p)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(result2);
    }
}