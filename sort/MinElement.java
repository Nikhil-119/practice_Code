package sort;

import java.util.Scanner;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5]; //initialization of an array
		int i,min;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Five numbers:");
		for(i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
		min=arr[0];
		for(i=0;i<5;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Smallest element present in given array: "+ min);
		
	}
}
