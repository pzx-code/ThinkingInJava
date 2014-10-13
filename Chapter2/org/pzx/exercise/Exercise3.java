/*
 *Created on 10:49:34 AM Oct 13, 2014
 */
package org.pzx.exercise;

class StaticTest{
	static int i = 47;
	}
public class Exercise3 {
	
		static void increment(){
			StaticTest.i++;
		}
		
		public static void main(String[] args) {
			new StaticTest();
			System.out.println(StaticTest.i);
			increment();
			System.out.println(StaticTest.i);
			
		}
}

