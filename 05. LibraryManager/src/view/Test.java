package view;

public class Test {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tung ");
        stringBuilder.append("Pham");
        stringBuilder.insert(2, "xxx");

        String name = stringBuilder.reverse().toString();
        System.out.println(name);
    }
}
