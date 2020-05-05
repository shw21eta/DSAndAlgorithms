package io.code.dsandalgo.searching;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unSortedArr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
		int sortedArr[] = { 2, 3, 4, 10, 40 }; 
	    int element = 1;
	      
//	    int result = LinearSearch.linearSearch(unSortedArr, element); 
	    int result = BinarySearch.binarySearch(sortedArr, element);
//	    int result = BinarySearch.binarySearchRecursive(sortedArr, 0, sortedArr.length-1, element);
//		Arrays.binarySearch();

//		int result = FibonacciSearch.fibonacciSearch(sortedArr, element);

	    if(result == -1) 
	        System.out.print("Element is not present in array"); 
	    else
	        System.out.print("Element is present at index " + result);
	}

}
