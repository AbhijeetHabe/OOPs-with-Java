package com.oops.main;

public class MagicSquare {

	public static void main(String[] args) {
		int arr[][] = {{10,20,30},{30,40,50},{60,70,90}};
		
		boolean isMagicSquare = true;
		int sum = 0;
		for(int j=0; j<arr.length;j++) {
			sum += arr[0][j];
		}
		for(int i=0; i<arr.length;i++) {
			int rowSum = 0;
			for(int j=0; j<arr.length;j++) {
				rowSum += arr[i][j];
			}
			if (rowSum != sum) {
				isMagicSquare = false;
				break;
			}
		}
		for(int j=0;j<arr.length;j++) {
			int colSum = 0;
			for (int i=0;i<arr.length;i++) {
				colSum += arr[i][j];
			}
			if (colSum != sum) {
				isMagicSquare = false;
				break;
			}
		}
		int diagonalSum1 = 0;
		for(int i=0;i<arr.length;i++) {
			diagonalSum1 += arr[i][i];
		}
		if(diagonalSum1 != sum) {
			isMagicSquare = false;
		}
		int diagonalSum2 = 0;
		for(int i=0;i<arr.length;i++) {
			diagonalSum2 += arr[i][arr.length-i-1];
		}
		if(diagonalSum2 != sum) {
			isMagicSquare = false;
		}
		if(isMagicSquare) {
			System.out.println("The matrix is magic square");
		} else {
			System.out.println("The matrix is not a magic square");
		}
	}

}
