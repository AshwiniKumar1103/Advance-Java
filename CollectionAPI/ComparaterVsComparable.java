package CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class ComparaterVsComparable {

    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Comparator<Student> stud = (i, j) -> i.age > j.age ? 1 : -1;
        List<Integer> nums = new ArrayList<>();
        nums.add(41);
        nums.add(59);
        nums.add(28);
        nums.add(32);

        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Ashwini", 22));
        studs.add(new Student("Ashish", 19));
        studs.add(new Student("Ahzam", 21));
        studs.add(new Student("Rini", 20));

        Collections.sort(nums, com);
        System.out.println(nums);
        Collections.sort(studs);
        System.out.println(studs);
    }
}
