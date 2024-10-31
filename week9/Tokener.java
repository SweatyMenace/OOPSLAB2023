import java.util.*;

public class Tokener {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String chatMessage = sc.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(chatMessage);
        
        System.out.println("Tokens starting with 'a' or 'b':");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (token.toLowerCase().startsWith("a") || token.toLowerCase().startsWith("b")) {
                System.out.println(token);
            }
        }
    }
}