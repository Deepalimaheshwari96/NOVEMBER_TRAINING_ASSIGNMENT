package com.yash.Program10;

public class Child extends Parent {

	public void maximum(int[] numbers) throws NumberFormatException, NullPointerException {
		int temp = 0;
		int sum = 0;
		for (int k = 0; k < numbers.length; k++) {

			sum = sum+numbers[k];
			for (int l = k + 1; l < numbers.length; l++) {

				if (numbers[k] < numbers[l]) {
					temp = numbers[k];
					numbers[k] = numbers[l];
					numbers[l] = temp;
				}
			}
		}
		System.out.println("Average of numbers is: "+(sum/numbers.length));
		System.out.println("The greatest number among the provided list is : " + numbers[0]);

	}

}
