package javaexercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise00 {

	public static void main(String[] args) {
//		one();
//		swap();
//		formula();
//		oddNumber();
//		calSum();
//		concat();
//		createNewArr();
//		swapArr();
//		squareRoot();
//		largestEle();
//		convertTemp();
//		leapYear();
		midpoint();
	}

	public static void one() {
		int first = 125;
		int second = 24;
		System.out.println(first + " + " + second + " = " + (first + second));
		System.out.println(first + " - " + second + " = " + (first - second));
		System.out.println(first + " * " + second + " = " + first * second);
		System.out.println(first + " / " + second + " = " + first / second);
		System.out.println(first + " mod " + second + " = " + first % second);
	}

	public static void swap() {
		int x = 125;
		int y = 24;
		System.out.println("Start, x = " + x + " y = " + y);

		int z = x;
		x = y;
		y = z;
		System.out.println("End, x = " + x + " y = " + y);
	}

	public static void formula() {
//		double x = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		double x = 4d * (1 - (1d / 3) + (1d / 5) - (1d / 7) + (1d / 9) - (1d / 11));
		System.out.println(x);
	}

	public static void oddNumber() {
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

	public static void calSum() {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Input the first number : ");
		int firstNum = keyboard.nextInt();
		keyboard.nextLine();

		System.out.print("Input the second number : ");
		int secondNum = keyboard.nextInt();
		keyboard.nextLine();

		System.out.print("Input the third number : ");
		int thirdNum = keyboard.nextInt();
//		keyboard.nextLine();

		boolean isEqu = firstNum + secondNum == thirdNum;
		System.out.println("The result is: " + isEqu);
	}
	
	public static void concat() {
		String str1 = "Python";
		String str2 = "Tutorial";
		String res = str1.toLowerCase().substring(1).concat(str2.toLowerCase().substring(1));
		System.out.println(res);
	}
	
	public static void createNewArr() {
		int array1[] = {50, -20, 0};
		int array2[] = {5, -50, 10};
		ArrayList<Integer> newArr = new ArrayList<>();
		newArr.add(array1[0]);
		newArr.add(array2[array2.length - 1]);
//		System.out.println("Array1: " + array1 + "Array2: " + array2 + "New Array: " + newArr);
		System.out.println(newArr);
	}
	
	public static void swapArr() {
		int oriArr[] = {20, 30, 40};
		int firstEle = oriArr[0];
		
		int newArr[] = oriArr;
		newArr[0] = oriArr[oriArr.length - 1];
		newArr[newArr.length - 1] = firstEle;
//		System.out.println("Original Array: " + Arrays.toString(oriArr));
		System.out.println("New array after swaping the first and last elements: " + Arrays.toString(newArr));
	}
	
	public static void squareRoot() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input a positive integer: ");
		int number = keyboard.nextInt();
		double res = Math.sqrt(number);
		System.out.println("Square root of " + number + " is: " + res);
	}
	
	public static void largestEle() {
		int oriArr[] = {1, 4, 17, 7, 25, 3, 100};
		Arrays.sort(oriArr);
		int arrLength = oriArr.length;
		int largestNums1 = oriArr[arrLength - 1];
		int largestNums2 = oriArr[arrLength - 2];
		int largestNums3 = oriArr[arrLength - 3];
		System.out.println("3 largest elements of the said array are: \n" + largestNums1+" "+ largestNums2+" "+ largestNums3);
	}
	
	public static void convertTemp() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input a degree in Fahrenheit: ");
		double fahrenheit = keyboard.nextInt();
		double celsius = (fahrenheit - 32) * 5/9;
		System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
	}
	
	// A leap year is a year that is divisible by 4 and 400 but not by 100.
	public static void leapYear() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input a yaer: ");
		int year = keyboard.nextInt();
		boolean is_LeapYear = false;
		if (year % 4 == 0) {
			if (year % 400 != 0 || year % 100 != 0) {
				is_LeapYear = true;
			}
		}
		System.out.println(is_LeapYear);
	}
	
	public static void midpoint() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the first number : ");
		int firstNum = keyboard.nextInt();
		keyboard.nextLine();

		System.out.print("Input the second number : ");
		int secondNum = keyboard.nextInt();
		keyboard.nextLine();

		System.out.print("Input the third number : ");
		int thirdNum = keyboard.nextInt();
		
//		boolean hasMidpoint;
		System.out.println("Check whether the three said numbers has a midpoint!");
		System.out.print(hasMidpoint(firstNum,secondNum,thirdNum));
	}
	public static boolean hasMidpoint(int x, int y, int z){
	    int max = Math.max(x, Math.max(y,z));
	    int min = Math.min(x, Math.min(y,z));
	    double mid_point1 = (max + min) / 2.0;
	    int mid_point2 = x + y + z - max - min;
	    return (mid_point1 == mid_point2);
	  }

}
