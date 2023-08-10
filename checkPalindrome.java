import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the query: ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        isPalindrome(arr);
        sc.close();

    }

    static void isPalindrome(char[] arr) {
        int temp, start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                System.out.println("the given query is not palindrome.");
                return;
            }
            start++;
            end--;
        }
        System.out.println("The query is palindrome.");
    }
}
