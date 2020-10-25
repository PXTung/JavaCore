package Part03_Iterator;

import java.util.*;

public class Part03_Iterator {
    public static void main(String[] args) {
//        String[] data = {"AA", "BB", "CC", "DD"};

//        List<String> list = Arrays.asList(data);
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");



        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()){
            if (itr.next().equals("CCC")) itr.set("BBA");

//            if (itr.next().equals("AAA")) itr.remove();
////            if (itr.next().equals("BBB")) itr.set("BBE");
//            if (itr.next().equals("DDD")) itr.add("EEE");

        }

        final Iterator<String> itrs = list.iterator();

        for (String s : list)
            System.out.println(s);
    }
}
