import java.util.Scanner;

public class insertionSortP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element no " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        System.out.println("After sorting the array is :");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        sc.close();

    }

    static void insertionSort(int[] arr) {
        int i = 1;
        int j = i;
        for (; i < arr.length; i++) {
            int temp = arr[i];
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] >= temp)
                    arr[j + 1] = arr[j];
                else
                    break;
            }
            arr[j + 1] = temp;
        }
    }
}
