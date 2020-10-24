package Part01FabbiTest;

import java.util.Random;

public class Part01FabbiTest {
    public static void main(String[] args) {
//        int n = 5;
//        int[] arr = getArr(n);
//        show(arr, 3, n);
//        arr = reSortArr(arr, n);
//        show(arr, n, 3);
//        show(arr, 1, arr.length);
//        arr = sortArr(arr);
//        show(arr, 1, arr.length);
        String a = String.valueOf(100);
        int x = Integer.parseInt(a, 10);

        System.out.println(x);
    }

    private static int[] sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (i == 1) break;
        }
        return arr;
    }


    private static int[] reSortArr(int[] arr, int n) {
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arrNew[i * 3 + j] = arr[j * n + i];
            }
        }
        return arrNew;
    }

    private static void show(int[] arr, int m, int n) {
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i*n + j] + "     ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[] getArr(int n) {
        int[] arr = new int[3 * n];
        Random random = new Random();
        for (int i = 0; i < 3 * n; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }
}
