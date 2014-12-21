/**
 * 
 */
package com.sorting;
/**
 * @author vinay.pawar
 *
 */
public class Factorial {
	
	public static int fact(int num) {
		if(num != 1) {
			return num * fact(num-1);
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Factorial.fact(5));
	}

}
