package com.java.patterns;

public class Star_Rectangle {

	public static void main(String[] args) {
		
		int row = 5;
		int column = 5;
		for(int i = 0; i < row;i++) {
			
		
			for(int j = 0;j<column;j++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < row;i++) {
			
			
			for(int j = 0;j<column;j++) {
				
				if(i==0 || i == 4 || j == 0 || j == 4) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
	}
}
