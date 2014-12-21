/**
 * 
 */
package com.sorting;
/**
 * @author vinay.pawar
 *
 */
public class UniqueCharString {
	
	public String test = "Vinay";
	
	public static void  checkIfUnique(String s) {
		boolean ifPresent = false;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					ifPresent = true;
				}
			}
		}
		if(ifPresent) {
			System.out.println("has duplicate");
		} else {
			System.out.println("no duplicate");
		}
		
	}
	
	public static void main(String[] args) {
		UniqueCharString.checkIfUnique("Vinay Vipransh");
	}

}
