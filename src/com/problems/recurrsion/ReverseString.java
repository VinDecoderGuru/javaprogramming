/**
 * 
 */
package com.problems.recurrsion;
/**
 * @author vinay.pawar
 *
 */
public class ReverseString {
	
	public static String reverseString(String s) {
		if(s != null && s.length() >1 ) {
			return s.charAt(s.length()-1) + reverseString(s.substring(0,s.length()-1));
		}
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("Vinayak Pawar"));
	}

}
