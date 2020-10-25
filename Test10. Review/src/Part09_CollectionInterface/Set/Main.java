package Part09_CollectionInterface.Set;

import javax.jws.Oneway;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        testCountDuplicate();
//        testCompare();
        testHashSet();
    }

    private static void testHashSet() {
        Set<Object> list = new HashSet<>();
        list.add(1);
        list.add("a");
        list.add(1.35);


        for (Object l : list) System.out.println(l);
    }

    private static void testCompare() {
        Set<Student> listStudent = new LinkedHashSet<>();
        listStudent.add(new Student(1, "aa"));
        listStudent.add(new Student(2, "aa"));
        listStudent.add(new Student(3, "aa"));
        listStudent.add(new Student(1, "aa"));

        for (Student l : listStudent) System.out.println(l);
    }

    private static void testCountDuplicate() {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(4);
        listInt.add(4);
        listInt.add(4);
        listInt.add(4);
        listInt.add(4);
        listInt.add(3);
        listInt.add(2);
        listInt.add(2);
        listInt.add(0);
        listInt.add(0);

//        int[] listInt = {1, 3, 5, 5, 3};

        Set<Integer> listSet = new HashSet<>();
        listSet.addAll(listInt);

        for (Integer s: listSet) {
            System.out.println(s + ": " + Collections.frequency(listInt, s));
        }
    }
}
