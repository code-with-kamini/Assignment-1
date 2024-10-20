package operation;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter the 1st no ");
        int a= sc.nextInt();
        
        System.out.println("Enter the 2nd no");
        int b= sc.nextInt();
		
		System.out.println("Select Operation ");
		System.out.println("1:Addition  2:Subtration  3:Multiplication  4:Division  5:Modules ");
		Scanner scanner = new Scanner(System.in);
		int no= scanner.nextInt();
		

		switch (no) {
		
		case 1:
			System.out.println("Addition :" +(a+b));
			break;
			
		case 2:
			System.out.println("Subtraction :" +(a-b));
			break;
			
		case 3:
			System.out.println("Multiplication :" +(a*b));
			break;
			
		case 4:
			System.out.println("Division :" +(a/b));
			break;
			
		case 5:
			System.out.println("Modules :" +(a%b));
			break;
			
		default:
			System.out.println("Invalid no");
			
	
		
		}
	

	}

}
