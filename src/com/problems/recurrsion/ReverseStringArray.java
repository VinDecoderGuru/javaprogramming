/**
 * 
 */
package com.problems.recurrsion;
/**
 * @author vinay.pawar
 *
 */
public class ReverseStringArray {
	
	public static String reverseString(char[] stringArray) {
		if(stringArray != null && stringArray.length > 1) {
			String string = stringArray.toString();
			return stringArray[stringArray.length-1] + reverseString(null);
		}
		return stringArray[0] + "";
	}
	
	public static void main(String[] args) {
		
	}

}
