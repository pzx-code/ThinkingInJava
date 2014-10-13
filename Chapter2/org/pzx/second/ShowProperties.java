/*
 *Created on 10:11:53 AM Oct 13, 2014
 */
package org.pzx.second;

public class ShowProperties {
	public static void main(String[] args) {
		System.getProperties().list(System.out);
	System.out.println(System.getProperty("user.name"));
	System.out.println(
			System.getProperty("java.library.path"));
	}
	
}

