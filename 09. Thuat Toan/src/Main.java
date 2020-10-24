import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 27, 30, 4, 30, 66, 27, 8, 9, 10};
        countLoop(arr);
//        System.out.println(countLoop(arr) + " ");
    }

    private static void countLoop(int[] arr) {
        List<Integer> arrayList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Map<Integer, Integer> mapList = new HashMap<>();
        for (Integer a : arrayList){
            if (mapList.containsKey(a))
                mapList.put(a, mapList.get(a) + 1);
            else
                mapList.put(a, 1);
        }
        Set<Integer> keySet = mapList.keySet();
        for (Integer k : keySet)
            System.out.println(k + ": " + mapList.get(k));
    }
}