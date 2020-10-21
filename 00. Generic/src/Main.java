public class Main {
    public static void main(String[] args){
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"Apple", "Tomato", "Banana"};
        Double[] doubles = {1.23, 3.24, 4.56};

        showElement(integers);
        showElement(strings);
        showElement(doubles);
    }

    private static <T> void showElement(T[] objects) {
        for (var o : objects){
            System.out.println(o);
        }
    }
}
