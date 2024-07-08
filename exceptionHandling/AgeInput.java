package exceptionHandling;

import java.util.*;

public class AgeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //Creating a Scanner object
		System.out.println("Please enter the age:");
		
		try {
			int age=sc.nextInt(); //Read user input
			if(age<1) {
				throw new Exception("Age cannot be zero or negative.");
			}
			System.out.println("Your age is "+ age);
			
		}catch(Exception e) {
			System.out.println("Exception caught: "+ e.getMessage());
		}finally {
			sc.close();
		}

	}

}
