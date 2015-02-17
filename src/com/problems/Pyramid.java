/**
 * 
 */
package com.problems;
/**
 * @author vinay.pawar
 *
 */
public class Pyramid {
	
	public static void main(String[] args) {
		int noOfLine = 10;
		for (int i = 0; i < noOfLine; i++) {
			for (int noOfSpaces = i; noOfSpaces < noOfLine*2-1 ; noOfSpaces++) {
				System.out.print(" ");
			}
			for (int noOfStar = 0; noOfStar <=  i*2+1; noOfStar++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
