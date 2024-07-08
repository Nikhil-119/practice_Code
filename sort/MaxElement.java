package sort;

import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5]; //initialization of an array
		int i,max;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Five numbers:");
		for(i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
		max=arr[0];
		for(i=0;i<5;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Largest element present in given array: "+ max);

	}

}
