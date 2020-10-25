package Part09_CollectionInterface.Map;

import java.util.EnumMap;
import java.util.Map;

public class Main {
    public enum key{One, Two, Three, Four, Five};

    public static void main(String[] args) {
        EnumMap<key, Student> enumMap = new EnumMap<key, Student>(key.class);

        enumMap.put(key.One, new Student(1, "AA"));
        enumMap.put(key.Two, new Student(2, "AAas"));
        enumMap.put(key.Three, new Student(3, "AAaa"));
        enumMap.put(key.Four, new Student(4, "AAss"));
        enumMap.put(key.Five, new Student(5, "AAff"));

        for (Map.Entry<key, Student> m : enumMap.entrySet())
            System.out.println(m.getKey() + ": " + m.getValue());
    }
}
