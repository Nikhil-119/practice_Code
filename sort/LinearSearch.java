package sort;

import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,search;
		Scanner sc = new Scanner(System.in);  //Creating a Scanner object
		System.out.println("Enter number of elements: ");
		n=sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("\nEnter "+ n +" elements:");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();  //Taking user inputs in array 
		}
		
		System.out.println("\nEnter the element to be found: ");
		search=sc.nextInt();
		
		//Searching the specified element using Linear Search
		for(i=0;i<n;i++) {
			if(arr[i] == search) {
				System.out.println("\n"+ search +" is present at location "+ (i+1));
				break;
			}
		}
		
		if(i==n) {
			System.out.println("\n"+ search +" isn't present in array");
		}

	}

}
