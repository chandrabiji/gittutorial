package com.chandra;

public class Calculation {
	
	public int add(int i, int j){
		return i+j;
	}

	public static void main(String[] args) {
		Calculation c = new Calculation();
		System.out.println(c.add(10, 15));

	}

}
