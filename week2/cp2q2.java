import java.util.*;

public class cp2q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5-digit number: ");
		String s = sc.nextLine();

		if (s.length()==5){
			for(int i=0; i < 5; i++){
				System.out.print(s.charAt(i) + " ");
			}
		}else{
			System.out.println("Please enter only 5-digit number: ");

		}
	}
}
