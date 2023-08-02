import java.util.Scanner;

public class mergeSortP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] mainArray = new int[size];
        System.out.println("Enter array elements one by one: ");
        for (int i = 0; i < mainArray.length; i++) {
            mainArray[i] = sc.nextInt();
            System.out.println(mainArray[i]);
        }
        mergeSort(mainArray);
        System.out.println("After sorting the Array: ");
        for (int elements : mainArray) {
            System.out.print(elements + " ");
        }
        sc.close();
    }

    /*
     * mergeSort function which recursively calls itself and breaks the array into
     * subarrays
     */
    static void mergeSort(int[] array) {
        if (array.length <= 1) // base case where the recursion will stop
            return;
        int middle = array.length / 2; // dividing the array

        // creating the left and right sub arrays
        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length - middle];

        // putting values of array to sub arrays
        int i = 0; // traversing left array
        int j = 0; // traversing right array
        for (; i < array.length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }

        // recursively calling for left and right sub array
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);// this will sort and merge the sub arrays

    }

    static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, l = 0, r = 0;
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                r++;
                i++;
            }

        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            r++;
            i++;
        }
    }
}
