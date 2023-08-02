import java.util.Scanner;

public class BinarySearchP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in assecding order: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int find = sc.nextInt();
        int index = binarySearch(arr, find);
        if (index == -1)
            System.out.println("The number is not in the array.");
        else
            System.out.println("The index of number " + find + " is in index: " + index);

        sc.close();
    }

    private static int binarySearch(int[] arr, int find) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == find)
                return mid;
            else if (arr[mid] > find)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
