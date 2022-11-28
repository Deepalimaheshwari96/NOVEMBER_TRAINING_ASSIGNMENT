package com.yash.Program10;

public class Parent {

	public void maximum(int[] numbers) throws NullPointerException, ArrayIndexOutOfBoundsException{
		
		int temp = 0;
		for (int k = 0; k < numbers.length; k++) {

			for (int l = k+1; l < numbers.length; l++) {

				if(numbers[k] < numbers[l])
				{
					temp = numbers[k];
					numbers[k] = numbers[l];
					numbers[l] = temp;
				}
			}
		}
		System.out.println("The greatest number among the provided list is : "+numbers[0]);
	}
}
