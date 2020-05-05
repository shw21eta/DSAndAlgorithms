package io.code.dsandalgo.searching;

public class LinearSearch {
	
	public static int linearSearch(int[] arr, int element) {
		
		int index = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) {
				index = i;
				break;
			}
		}
		
		return index;
	}
}
