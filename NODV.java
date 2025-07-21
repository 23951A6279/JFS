import java.util.*;

public class NODV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Using HashSet to count distinct values
        Set<Integer> distinctSet = new HashSet<>();

        for(int num : arr) {
            distinctSet.add(num);
        }

        System.out.println("Number of distinct values: " + distinctSet.size());
    }
}
