import java.util.Scanner;

public class cp2q4 {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 5 numbers: ");
		int p=0,n=0,z=0;

		for(int i = 0; i < 5; i++){
			int x = s.nextInt();
		
			if(x > 0) {
				p++;
			}
			if(x < 0){
				n++;
			}
			if(x == 0){
				z++;
			}
		}	
	System.out.println("Positives: "+p+"\nNegatives: "+n+"\nZeroes: "+z);
	}
}

