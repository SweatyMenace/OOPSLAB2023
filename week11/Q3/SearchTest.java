interface Searching {
    int findKey(int[] array, int key);
}

// Class that implements linear search
class LinearSearch implements Searching {
    @Override
    public int findKey(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Return the index of the found key
            }
        }
        return -1; // Return -1 if the key is not found
    }
}

// Class that implements binary search
class BinarySearch implements Searching {
    @Override
    public int findKey(int[] array, int key) {
        // First, we need to sort the array for binary search
        java.util.Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the key is present at mid
            if (array[mid] == key) {
                return mid; // Return the index of the found key
            }
            // If key is greater, ignore left half
            if (array[mid] < key) {
                left = mid + 1;
            } else {
                // If key is smaller, ignore right half
                right = mid - 1;
            }
        }
        return -1; // Return -1 if the key is not found
    }
}

// Main class to test the searching algorithms
public class SearchTest {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 2, 7, 4, 1};
        int keyToFind = 6;

        // Testing Linear Search
        Searching linearSearch = new LinearSearch();
        int linearResult = linearSearch.findKey(array, keyToFind);
        System.out.println("Linear Search: Key " + keyToFind + " found at index: " + linearResult);

        // Testing Binary Search
        Searching binarySearch = new BinarySearch();
        int binaryResult = binarySearch.findKey(array, keyToFind);
        System.out.println("Binary Search: Key " + keyToFind + " found at index: " + binaryResult);
    }
}