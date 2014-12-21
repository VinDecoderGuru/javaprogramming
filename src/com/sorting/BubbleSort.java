/**
 * 
 */
package com.sorting;
/**
 * @author vinay.pawar
 *
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = {24,13,9,64,7,23,34,47};
		bubbleSort(array);
		//selectionSort(array);
		//insertionSort(array);
	}
	
	public static void quickSort(int[] array) {
		System.out.print("insertion sort \t ");
		BubbleSort.printArray(array);
	}
	
	public static void quickSort(int[]array, int lowerIndex,int higherIndex) {
		 int i = lowerIndex;
	        int j = higherIndex;
	        // calculate pivot number, I am taking pivot as middle index number
	        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	        // Divide into two arrays
	        while (i <= j) {
	            /**
	             * In each iteration, we will identify a number from left side which 
	             * is greater then the pivot value, and also we will identify a number 
	             * from right side which is less then the pivot value. Once the search 
	             * is done, then we exchange both numbers.
	             */
	            while (array[i] < pivot) {
	                i++;
	            }
	            while (array[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                swap(array, i, j);
	                //move index to next position on both sides
	                i++;
	                j--;
	            }
	        }
	        // call quickSort() method recursively
	        if (lowerIndex < j)
	        	quickSort(array,lowerIndex, j);
	        if (i < higherIndex)
	        	quickSort(array,i, higherIndex);
	}
	 
	public static void insertionSort(int[] array) {
		BubbleSort.printArray(array);
		System.out.println("insertion sort");
		for (int i = 1; i < array.length; i++) {
			int j = i;
			while(j > 0) {
				if(array[j] < array[j-1]) {
					swap(array, j, j-1);
					BubbleSort.printArray(array);
					j--;
				} else {
					break;
				}
			}
		}
	}
	
	public static void selectionSort(int[] array) {
		BubbleSort.printArray(array);
		System.out.println("Selection sort started");
		int complex = 0;
		int smallest = 0;
		for (int i = 0; i < array.length - 1; i++) {
			smallest = i;
			for (int j = i+1; j < array.length; j++) {
				if(array[j] > array[smallest] ) {
					complex ++;
					smallest = j;
				}
			}
			System.out.print("i :: "+i+"smallest "+smallest+" \t");
			swap(array, i, smallest);
			BubbleSort.printArray(array);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("complex :: "+complex);
	}
	
	public static void bubbleSort(int[] array) {
		BubbleSort.printArray(array);
		System.out.println("Sorting started");
		int complex = 0;
		for (int i = array.length - 1 ; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				complex ++;
				if(array[j] < array[j+1] ) {
					swap(array, j, j+1);
					BubbleSort.printArray(array);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		System.out.println("complex :: "+complex);
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("array["+i+"] :: "+array[i]+"\t ");
		}
		System.out.println();
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
