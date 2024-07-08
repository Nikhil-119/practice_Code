package exceptionHandling;

import java.util.*;

public class OddNumberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //Creating a Scanner object
		System.out.println("Enter a number:");
		
		try {
			int number=sc.nextInt(); //Read user input
			if(number % 2 != 0) {
				throw new Exception("Odd number entered: "+ number);
			}else {
				System.out.println("It's an even number so welcome!!!");
			}
		}catch(Exception e){
			System.out.println("Exception caught: "+ e.getMessage());
		}finally {
			sc.close();
		}

	}

}
