import java.util.Scanner;

public class QuickSortP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter value of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array before sorting: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        quicksort(arr, 0, size - 1);
        System.out.println("The array after sorting: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        sc.close();
    }

    static void quicksort(int[] arr, int start, int end) {
        if (end <= start)
            return;
        int pivot = findPivot(arr, start, end);
        quicksort(arr, start, pivot - 1);
        quicksort(arr, pivot + 1, end);
    }

    static int findPivot(int[] arr, int start, int end) {
        int tempPivot = arr[end];
        int i;
        int j = start - 1;
        for (i = start; i < end; i++) {
            if (arr[i] < tempPivot) {
                j++;
                swap(arr, i, j);
            }
        }
        j++;
        swap(arr, j, end);
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}