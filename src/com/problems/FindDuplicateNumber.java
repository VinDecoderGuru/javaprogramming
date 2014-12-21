/**
 * 
 */
package com.problems;
/**
 * @author vinay.pawar
 *
 */
public class FindDuplicateNumber {
	
	public Integer[] numbers;
	
	public FindDuplicateNumber() {
		numbers = new Integer[30];
		for (int i = 0; i < numbers.length - 2; i++) {
			numbers[i] = i+1;
		}
		numbers[numbers.length-1] = 22;
		printArray(numbers);
	}
	
	public Integer[] findDuplicateNumber() {
		Integer[] duplicateNumbers = new Integer[numbers.length/2];
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
//				System.out.print("Comparing i and j "+numbers[i]+" "+numbers[j]+"\t");
				if(numbers[i] == numbers[j]) {
					duplicateNumbers[count++] = numbers[j];
				}
			}
		}
		return duplicateNumbers;
	}
	
	public static String reverse(String s) {
		if(s != null && s.length() > 1) {
			return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
		}
		return s;
	}
	
	public static void main(String[] args) {
		FindDuplicateNumber f = new FindDuplicateNumber();
		System.out.println(f.reverse("fedcba"));
		Integer[] duplicateNumbers = f.findDuplicateNumber();
		for (int i = 0; i < duplicateNumbers.length; i++) {
			System.out.print(duplicateNumbers[i]+"\t");
		}
	}
	
	public void printArray(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
	}

}
