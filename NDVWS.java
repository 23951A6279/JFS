import java.util.*;
import java.util.stream.*;

public class NDVWS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long count = Arrays.stream(arr)
                           .distinct()
                           .count();

        System.out.println("Number of distinct values: " + count);
    }
}
