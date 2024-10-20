package operation;
import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		
		System.out.println("Enter the no");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		
		if(a % 2==0)
		System.out.println(a+ " is Even");
		
		else
		System.out.println(a+ " is odd" );	

	}

}
