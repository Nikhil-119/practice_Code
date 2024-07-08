package sort;

import java.util.*;

public class ArrExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5]; //initialization of an array
		int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Five numbers:");
		for(i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("You have entered: ");
		for(i=0;i<5;i++) {
			System.out.println("arr["+ i +"]=" + arr[i]);
		}
		

	}

}
