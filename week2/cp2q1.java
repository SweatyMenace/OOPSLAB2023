import java.util.*;

public class cp2q1{
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);

		System.out.println("Enter the radius: ");
		int rad = inp.nextInt();
		System.out.println("Diameter="+ (2*rad));
		System.out.println("Circumference="+ (2*Math.PI*rad));
		System.out.println("Area="+ (Math.PI*rad*rad));
	}
}
