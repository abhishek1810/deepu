package com.strings;

import java.lang.reflect.Array;
import java.util.Scanner;

public class StringOneSolution {

	/**
	 * @param Abhishek
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String firstValue = scan.nextLine();
		String secondValue = scan.nextLine();
		System.out.println(firstValue.length()+secondValue.length());
		if(firstValue.compareTo(secondValue)>0){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
//System.out.println(firstValue.substring(0, 1).toUpperCase().append(secondValue.substring(1).toUpperCase()));
	}

}
