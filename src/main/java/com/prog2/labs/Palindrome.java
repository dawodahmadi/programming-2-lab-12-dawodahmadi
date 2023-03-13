package com.prog2.labs;
/**
 * @author adinashby
 *
 */

public class Palindrome {

	 public static boolean isPalindrome(String s) {
	        int i = 0, j = s.length() - 1;
	        while (i < j) {
	            if (s.charAt(i) != s.charAt(j)) {
	                return false;
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }
	public static void main(String[] args) {
		
	}

	
}