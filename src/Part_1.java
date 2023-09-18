import java.util.Random;
import java.util.Scanner;

public class Part_1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        boolean repeat = true;
        int[] array;
        String answer = "y";

        while (repeat){

            // Ask the user whether to fill the array with random values or input values by them
            System.out.println("Do you want to fill array with random values or not?");
            System.out.println("Enter 1 for random and 2 to type in yourself:");
            int choice = Integer.parseInt(in.nextLine());

            if(choice == 1) {
                // Ask the user about the size/length of the random array
                System.out.println("Enter array size:");
                int size = Integer.parseInt(in.nextLine());
                array = createRandomArray(size);
            } else {
                // Ask the user about the size/length of the user's array
                System.out.println("Enter array size:");
                int size = Integer.parseInt(in.nextLine());
                array = inputArray(size, in);
            }

            // Output the original array
            System.out.println("Your array:");
            printArray(array);

            // Sort this array
            bubbleSort(array);

            // Output the sorted array
            System.out.println("Sorted array:");
            printArray(array);

            // Ask the user whether he/she/they want to repeat the dialog
            System.out.println("Do you want to repeat? Type y if yes and n if no (y/n):");
            answer = in.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                repeat = false;
            } else repeat = true;
        }
    }

    // Creation of the array with random values with the given length
    public static int[] createRandomArray(int length){
        int[] newArray = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            newArray[i] = random.nextInt(100); // Change 100 to the desired range
        }
        return newArray;
    }

    // Input of the array
    public static int[] inputArray(int length, Scanner input) {
        int[] newArray = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the element at index " + (i+1) + ": ");
            newArray[i] = Integer.parseInt(input.nextLine());
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

    // Swap two elements of the array
    public static void swap(int[] array, int k, int l) {
        int step = array[k]; //buffer; two same elements with same values;
        array[k] = array[l];
        array[l] = step;
    }

    // Sort the user's array using the improved bubble sort
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    swap(array, j, j + 1);
                }
            }
        }
    }
}