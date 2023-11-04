package com.gradedquiz.q2;

public class Recursion {
public static int ValueOfXPowerN(int a,int b) {
	//base condition
	if(b==0) {
		return 1;
	}
	else {
		return a*ValueOfXPowerN(a,b-1);
	}
}
public static void main(String args[]) {
	//to find the value of x power n
	//here a is base number that is x 
	//b is power that is x
	System.out.println(ValueOfXPowerN(2,10));
	
}
}
