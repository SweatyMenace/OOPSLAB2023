import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurance {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char maxChar = getMaxOccurringCharacter(input);
        
        System.out.println("The maximum occurring character is: " + maxChar);
        
        scanner.close();
    }

    private static char getMaxOccurringCharacter(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        char maxChar = '\0';
        int maxCount = 0;
        
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        
        return maxChar;
    }
}