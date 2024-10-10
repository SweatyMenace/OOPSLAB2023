import java.util.Scanner;

public class DuplicateFinder {
    public static int[][] findDuplicates(int[] arr) {
        int[][] duplicates = new int[arr.length][2];
        boolean[] visited = new boolean[arr.length];
        int dupIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1) {
                duplicates[dupIndex][0] = arr[i];
                duplicates[dupIndex][1] = count;
                
                dupIndex++;
        }    
    }
    return duplicates;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] duplicates = findDuplicates(arr);
        System.out.println("Duplicates elements and their counts: ");
        for (int i = 0; i < duplicates.length; i++) {
            if (duplicates[i][1] > 0){ 
            System.out.println("Element: " + duplicates[i][0] + " ,Count: " + duplicates[i][1]);
            }
        }
    }
}
