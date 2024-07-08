package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		try {
		    System.out.println("Please enter an integer: ");
		    int number = scanner.nextInt();
		            
		    // This line will intentionally throw an ArithmeticException
		    int result = 10 / number;

		    // This line will intentionally throw an ArrayIndexOutOfBoundsException
		    int[] array = new int[5];
		    array[10] = 50;

		    } catch (InputMismatchException e) {
		         System.out.println("InputMismatchException: Please enter a valid integer.");
		    } catch (ArithmeticException e) {
		         System.out.println("ArithmeticException: Division by zero is not allowed.");
		    } catch (ArrayIndexOutOfBoundsException e) {
		         System.out.println("ArrayIndexOutOfBoundsException: Array index is out of bounds.");
		    } catch (Exception e) {
		         System.out.println("Exception: An unexpected error occurred: " + e.getMessage());
		    } finally {
		         scanner.close();
		    }
		    
		}

}
