package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class PalindromeIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String abcd = "wbuvyhpuespdrgtfyrhouekuveiiluuliievukeuohryftgrdpeuphyvubw";
		StringBuffer abc = new  StringBuffer(abcd);
		StringBuffer abc1 = new  StringBuffer(abcd);		
		// TODO Auto-generated method stub
int l = abc.length()/2;
int i = 0;
int j = abc.length()-1;
List<Integer> myList = new ArrayList<Integer>();
if(abcd.equals(abc1.reverse().toString())){
	System.out.println("-1");
}
else{
	for(int k = 0; k<=l;k++){
			if(abc.charAt(i)!=abc.charAt(j)){
				abc.deleteCharAt(i);
				String temp = abc.toString();
				abc = abc.reverse();
				if(temp.equals(abc.toString())){
					System.out.println(i);
					myList.add(i);
				}
				else{
					System.out.println(j);
					myList.add(j);
				}
				break;
			}
			i +=1;
			j -=1;
		}
	
	}
for(int result : myList){
System.out.println(result);
}
	}

}
