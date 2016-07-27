package com.test.circle;

public class Pyramide {
	
	
	public Pyramide(){}
	public static void printRepeatedChar(char c, int times) {
		if (times < 1)
			return;
		System.out.print(c);
		printRepeatedChar(c, times - 1);
	}

	public static  void pyramid(int x, int point) {
		if (point > 0) {
			printRepeatedChar('.',point-1);
			printRepeatedChar('x', x+1);

			System.out.println();
			pyramid(x +2, point-1);
		}
	}

}
