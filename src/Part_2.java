import java.util.Random;

public class Part_2 {

    public static void main(String[] args) {
        int length = 5;
        int[] newArray;

        // Output the original array
        newArray = createRandomArray(length);
        System.out.println("Here is your random array:");
        printArray(newArray);

        // Sort this array
        bubbleSort(newArray);

        // Output the sorted array
        System.out.println("Here is your sorted array:");
        printArray(newArray);
    }

    // Creation of the array with random values with the given length
    public static int[] createRandomArray (int length){
        int[] newArray = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            newArray[i] = random.nextInt(100); // Change 100 to the desired range
        }
        return newArray;
    }

    // Output of the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Add bolt elements
    public static void printCustomizedArray(int[] array, int firstIndex, int secondIndex) {
        for (int i = 0; i < array.length; i++) {
            if((i == secondIndex) || (firstIndex == i)) {
                System.out.print("\033[01m" + array[i] + "\033[0m" + " ");
            }
            else System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Swap two elements of the array
    public static void swap (int[] array, int k, int l) {
        int step = array[k]; //buffer; two same elements with same values;
        array[k] = array[l];
        array[l] = step;
    }

    // Sort the user's array using the improved bubble sort
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
