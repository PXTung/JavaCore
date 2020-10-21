import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(truncateString("57439552816"));
    }

    private static String truncateString(String s) {
        do{
            int i = s.length();
            if (i == 0) break;

            if (toInt(s, 0) % 3 == 0){
                s = s.substring(1);
            } else if(toInt(s, i - 1) % 3 == 0){
                s = s.substring(0, i - 1);
            } else if ((toInt(s, 0) + toInt(s, i - 1)) % 3 == 0){
                s = s.substring(1, s.length() - 1);
            } else
                break;
        }while (true);
        return s;
    }

    private static int toInt(String s, int i) {
        return Integer.parseInt(String.valueOf(s.charAt(i)));
    }

}