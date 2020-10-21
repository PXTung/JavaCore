package testing;

public class JunitTesting {

    public static void main(String[] args) {
        System.out.println(acreage(5));
        System.out.println(countString("AAA"));
    }

    public static int acreage(int width){
        return (int)Math.pow(width, 2);
    }

    public static int countString(String data){
        int count = 0;
        for (int i = 0; i < data.length(); i++){
            if(data.charAt(i) == 'A' || data.charAt(i) == 'a')
                count++;
        }
        return count;
    }
}
