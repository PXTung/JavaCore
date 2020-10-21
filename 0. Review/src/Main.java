import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args){
        var arrayList = getNumber();

        System.out.println("ORIGIN ARRAY");
        for (var a : arrayList){
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("HASHSET ARRAY");
        Set<Integer> arrayHashSet = new HashSet<>(arrayList);
        for (int a : arrayHashSet) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("TREESET ARRAY");
        Set<Integer> arrayTreeSet = new TreeSet<>(arrayList);
        for (var a : arrayTreeSet) {
            System.out.print(a + " ");
        }
        List<Integer> result = new ArrayList<>(arrayTreeSet);
        System.out.println("\nSECOND MIN: " + result.get(1));
        System.out.println();

        System.out.println("LINKEDHASHSET ARRAY");
        Set<Integer> arrayLinkedHashSet =
                new LinkedHashSet<>(arrayList);
        for (int a : arrayLinkedHashSet) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("QUEUE LINKED LIST ARRAY");
        Queue<Integer> arrayQueue = new LinkedList<>(arrayList);
        for (var a : arrayQueue) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("DEQUE ARRAY");
        Deque<Integer> arrayDeque = new ArrayDeque<>(arrayList);
        for (var a : arrayDeque) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("QUEUE PRIORITY ARRAY");
        Queue<Integer> arrayPriorityQueue = new ArrayDeque<>();
        arrayPriorityQueue.offer(25);
        arrayPriorityQueue.offer(10);
        arrayPriorityQueue.offer(15);
        for (var a : arrayPriorityQueue) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("------------LIST--------------");
        int[] array = {1, 2, 3, 5, 7, 9, 11};
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + " ");
        System.out.println();

        System.out.println("------------MAP--------------");
        Map<Integer, Integer> mapList = new HashMap<>();
        for (var a : arrayList){
            if (mapList.containsKey(a))
                mapList.put(a, mapList.get(a) + 1);
            else
                mapList.put(a, 1);
        }
        Set<Integer> keySet = mapList.keySet();
        for (var k : keySet)
            System.out.println(k + ": " + mapList.get(k));










//        printLinkedHashSetClass();
        printLoop(arrayHashSet, arrayList);
    }

    private static void printLinkedHashSetClass() {
        System.out.println("LINKEDHASHSET CLASS");
        Set<Person> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Person(1));
        linkedHashSet.add(new Person(2));
        linkedHashSet.add(new Person(3));
        linkedHashSet.add(new Person(1));
        for (var l : linkedHashSet)
            System.out.print(l.getId() + " ");
        System.out.println();
    }

    private static ArrayList<Integer> getNumber() {
        String number = "4,3,2,0,7,3,1,3,5,7,9,11,9,3,2,4,0,1,2,3,5,7";
        String[] datas = number.split(",");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (var d : datas){
            arrayList.add(Integer.parseInt(d));
        }
        return arrayList;
    }

    private static void printLoop(
            Set<Integer> arrayHashSet, ArrayList<Integer> arrayList) {
        System.out.println("COUNTER LOOP BY SET - HASHSET");
        int count = 0;
        for (var a1 : arrayHashSet){
            for(var a : arrayList){
                if (a1.equals(a)) {
                    count++;
                }
            }
            System.out.println(a1 + ": " + count);
            count = 0;
        }
    }
}
