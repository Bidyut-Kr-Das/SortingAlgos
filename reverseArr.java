public class reverseArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        reverseArray(arr);
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    static void reverseArray(int[] arr) {
        int temp, start = 0, end = arr.length - 1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}