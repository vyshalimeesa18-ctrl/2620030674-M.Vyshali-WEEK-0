import java.util.Scanner;

public class ArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.println("Enter array size: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum of array elements = " + sum);

        sc.close();
    }
}