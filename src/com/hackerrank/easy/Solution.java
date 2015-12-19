package com.hackerrank.easy;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numberOfTestCases = in.nextInt();
		int tests[] = new int[numberOfTestCases];
		long maxValue =  (long) Math.pow(10, 10);
		if(numberOfTestCases >= 1 && numberOfTestCases <= 15){
		for (int i = 0; i < numberOfTestCases; i++) {
			int temp = in.nextInt();
			if(temp > 0  && temp < maxValue){
			tests[i] = in.nextInt();
			}
		}
		in.close();
		printDivisorDigits(tests);
		}
	}
	
	static void printDivisorDigits(int[] tests){
		int count = 0;
		int fixedDivident = 0;
		int divisor =0;
		int tempDivident =0;
		for (int i = 0; i < tests.length; i++) {
			fixedDivident = tests[i];
			divisor = fixedDivident % 10;
			tempDivident= fixedDivident / 10;
			while(tempDivident > 0){
				fixedDivident = tests[i];
				divisor = fixedDivident % 10;
				tempDivident= fixedDivident / 10;
			}
		}
			
			if(temp > 0){
				count++;
			}
		System.out.println(count);
	}
}
