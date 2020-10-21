/*
    * Bubble Sort là sắp xếp bằng cách so sánh trí 2 số liền kề nhau
    * Quick Sort là lấy một giá trị ở giữa chia dsach làm 2 phần, bên trái bé, bên phải lớn hơn gtri giữa
*/

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] number = getNumber();
        System.out.println("ORIGIN");
        show(number);
        System.out.println("------------------BUBBLE SORT------------------");
        number = getNumber();
        bubbleSort(number);
        System.out.println("--------------BUBBLE SORT REVERSE--------------");
        number = getNumber();
        bubbleSortReverse(number);
        System.out.println("------------------QUICK SORT-------------------");
        number = getNumber();
        quickSort(number, 0, number.length - 1);
        show(number);
        System.out.println("-------------SIMPLE SELECTION SORT-------------");
        number = getNumber();
        simpleSelectionSort(number);
        System.out.println("-------------------HEAP SORT-------------------");
        number = getNumber();
        heapSort(number, number.length);
        show(number);

        number = getNumber();
        show(number);
    }

    private static void heapify(int[] number, int length, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < length && number[left] > number[largest]){
            largest = left;
        }

        if (right < length && number[right] > number[largest]){
            largest = right;
        }

        if (largest != i){
            int temp = number[i];
            number[i] = number[largest];
            number[largest] = temp;

            heapify(number, length, largest);
        }
    }

    private static void heapSort(int[] number, int length) {
        for(int i = length/2 - 1; i >= 0; i--)
            heapify(number, length, i);

        for (int i = length - 1; i >= 0; i--){
            int temp = number[0];
            number[0] = number[i];
            number[i] = temp;

            heapify(number, i, 0);
        }
    }

    private static void simpleSelectionSort(int[] number) {
        for(int i = 0; i < number.length - 1; i++){
            for(int j = i + 1; j < number.length; j++){
                if (number[i] > number[j]){
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        show(number);
    }

    private static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int number = arr[high];
        int pi = low - 1;
        for(int i = low; i < arr.length; i++){
            if (arr[i] < number){
                pi++;
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
            }
        }
        arr[high] = arr[pi + 1];
        arr[pi + 1] = number;
        return pi + 1;
    }


    private static void bubbleSortReverse(int[] number) {
        for (int i = 0; i < number.length; i++){
            for(int j = number.length - 1; j > i; j--){
                if (number[j] < number[j - 1]){
                    int temp = number[j];
                    number[j] = number[j - 1];
                    number[j - 1] = temp;
                }
            }
        }
        show(number);
    }

    private static void bubbleSort(int[] number) {
        for (int i = 0; i < number.length; i++){
            for(int j = 0; j < number.length - 1 - i; j++){
                if (number[j] > number[j + 1]){
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }

            }
        }
        show(number);
    }

    public static void show(int[] number){
        for(int i : number)
            System.out.print(i + " ");
        System.out.println();
    }

    private static int[] getNumber() {
        int [] arrNumber =
                {49, 38, 65, 97, 76, 13, 27, 78, 34, 12, 64, 5, 4, 62,
                        99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
        int [] number = new int[27];
        IntStream.range(0, arrNumber.length).forEach(i -> number[i] = arrNumber[i]);
        return number;
    }
}
