/**
 * 
 */
package com.sorting;
/**
 * @author vinay.pawar
 *
 */
public class Recursion {
	
	public static int recursionSum(int number) {
		if(number < 0) {
			return 0;
		} else {
			return number + recursionSum(number -1);
		}
	}
	
	public static void main(String[] args) {
		//System.out.println(recursionSum(15));
		int n = 1;
		int a = (45*n^3) + (20*n^2) +19 ;
		System.out.println(a);
	}

}
