package CollectionAPI;

import java.util.HashMap;
import java.util.Map;

public class Mapz {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("ash", 60);
        students.put("harsh", 50);
        students.put("amit", 40);
        students.put("sumit", 30);
        System.out.println(students.keySet());
        for (String name : students.keySet()) {
            System.out.println(name + ":" + students.get(name));
        }
    }
}
