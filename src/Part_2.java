import java.util.Random;

public class Part_2 {

    public static void main(String[] args) {
        int length = 5;
        int[] newArray;
        newArray = createRandomArray(length);
        System.out.println("Here is your random array:");
        printArray(newArray);
        bubbleSort(newArray);
        System.out.println("Here is your sorted array:");
        printArray(newArray);
    }
    public static int[] createRandomArray (int length){
        int[] newArray = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            newArray[i] = random.nextInt(100); // Change 100 to the desired range
        }
        return newArray;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printCustomizedArray(int[] array, int firstIndex, int secondIndex) {
        for (int i = 0; i < array.length; i++) {
            if((i == secondIndex) || (firstIndex == i)) {
                System.out.print("\033[01m" + array[i] + "\033[0m" + " ");
            }
            else System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void swap (int[] array, int k, int l) {
        int step = array[k]; //buffer; two same elements with same values;
        array[k] = array[l];
        array[l] = step;
    }
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(j == 0) {
                    System.out.println("Outer loop, iteration " + (i+1) + ":");
                    printArray(array);
                }
                System.out.println("Iteration " + (j + 1) + ":");
                printCustomizedArray(array, j, j+1);
                if (array[j] > array[j + 1]){
                    swap(array, j, j + 1);
                }
            }
        }
        return array;
    }
}
