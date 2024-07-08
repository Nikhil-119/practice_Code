package sort;

import java.util.*;

public class SortEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		int i,j,temp=0;
		
		Scanner sc = new Scanner(System.in);  //Creating a Scanner object
		System.out.println("Enter five numbers:");
		for(i=0;i<5;i++) {
			arr[i]=sc.nextInt();  //Taking user inputs in array
		}
		
		//Displaying elements of array before sorting
		System.out.println("\nElements present in array:");
		for(i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
		//Sorting array in ascending order
		for(i=0;i<5;i++) {
			for(j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		//Displaying elements of array after sorting
		System.out.println("\nElements of array after sorting in ascending order:");
		for(i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("\nThe second smallest element is: "+ arr[1]);
		System.out.println("\nThe second largest element is: "+ arr[3]);

	}

}
