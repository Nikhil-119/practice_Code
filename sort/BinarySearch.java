package sort;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,temp=0,low=0,mid=0,search;
		Scanner sc = new Scanner(System.in);  //Creating a Scanner object
		System.out.println("Enter number of elements: ");
		n=sc.nextInt();
		
		int arr[] = new int[n];
		int high = arr.length - 1;
		
		System.out.println("\nEnter "+ n +" elements:");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();  //Taking user inputs in array 
		}
		
		//Sorting array in ascending order
	    for(i=0;i<n;i++) {
	    	for(j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
				
		//Displaying elements of array after sorting
		System.out.println("\nElements of array after sorting in ascending order:");
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("\nEnter the element to be found: ");
		search=sc.nextInt();
		
		//Searching the specified element using Binary Search
		while(low<=high) {
			mid = (low + high)/2;
			if(search == arr[mid]) {
				System.out.println("\n"+ search +" is present at location "+ (mid+1));
				break;
			}else if(search<arr[mid]) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}

	}

}
