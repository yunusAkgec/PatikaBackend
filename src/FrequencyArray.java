import java.util.Arrays;

public class FrequencyArray {
    public static int findIndex(int[][] arr, int value) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == value) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isIn(int[][] arr, int value) {
        for (int[] row : arr) {
            if (row[0] == value) {
                return true;
            }
        }
        return false;
    }

    public static int[][] elementFrequenciesInAnArray(int[] arr) {
        int[][] frequencies = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            if (!isIn(frequencies, arr[i])) {
                frequencies[i][0] = arr[i];
                frequencies[i][1] = 1;
            } else {
                frequencies[findIndex(frequencies, arr[i])][1] += 1;
            }
        }
        return frequencies;
    }

    public static void displayFrequencies(int[][] arr) {

        for (int[] row : arr) {
            if (row[1] > 0) {
                System.out.println("The number " + row[0] + " was repeated " + row[1] + " times.");
            }
        }
    }

    public static void main(String[] args) {

        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 1, 0};
        int[][] freqArr = elementFrequenciesInAnArray(list);

        System.out.println("Array: " + Arrays.toString(list));
        System.out.println("Frequencies;");
        displayFrequencies(freqArr);
    }
}