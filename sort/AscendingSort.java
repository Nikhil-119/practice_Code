package sort;

import java.util.*;

public class AscendingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		int i,j,temp=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five numbers:");
		for(i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
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

	}

}
