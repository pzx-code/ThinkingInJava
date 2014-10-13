/*
 *Created on 10:29:06 AM Oct 13, 2014
 */
package org.pzx.exercise;

public class Exercise1 {
	int i;
	char c;
		
	public Exercise1(){
		System.out.println(i);
		System.out.println(c);
	}
	public static void main(String[] args) {
		new Exercise1();
		//System.out.println(i);
	/* can't do like up
	 * because main method is a static method
	 * can't use a non-static variables in a static method
	 */
	}
}
