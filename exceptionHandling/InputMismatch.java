package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		
		try {
			int number=sc.nextInt();
			System.out.println("You entered:"+ number);
			
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException: You must enter a valid number.");
		}finally {
			sc.close();
		}
		

	}

}
