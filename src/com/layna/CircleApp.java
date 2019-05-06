package com.layna;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean flag = true;
		int count = 0;

		System.out.println("Welcome to the Circle Tester");

		while (flag) {
			count += 1;
			System.out.println();
			double radius = Validator.getDouble(scan, "Enter radius: ", 1, 10000);

			Circle userCircle = new Circle(radius);

			System.out.println("Circumference: " + userCircle.getFormattedCircumference());
			System.out.println("Area: " + userCircle.getFormattedArea());

			while (flag) {
				int go = Validator.getInt(scan, "Continue? (y/n/c): ");

				if (go == 1) {
					break;
				} else if (go == 2) {
					flag = false;
				} else if (go == 3) {
					System.out.println();
					System.out.println();
					continue;

				}
			}
		}

		System.out.println();
		System.out.println("You built " + count + " circles.");
		System.out.println("Goodbye.");
	}

}
