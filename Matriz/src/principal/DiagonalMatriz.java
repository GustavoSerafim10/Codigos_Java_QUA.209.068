package principal;

import java.util.Scanner;

public class DiagonalMatriz {

	public static void main(String[] args) {
		/*
		 *  1) Fazer uma matriz 4x4, imprimir os numeros 
		 *  da diagonal dessa matriz
		*/
		  int[][] matrix = {
		            {1, 2, 3, 4},
		            {5, 6, 7, 8},
		            {9, 10, 11, 12},
		            {13, 14, 15, 16}
		        };

		        System.out.println("Matriz 4x4:");
		        printMatrix(matrix);

		        System.out.println("Números da diagonal principal:");
		        printDiagonal(matrix);
		    }

		    public static void printMatrix(int[][] matrix) {
		        for (int i = 0; i < matrix.length; i++) {
		            for (int j = 0; j < matrix[i].length; j++) {
		                System.out.print(matrix[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }

		    public static void printDiagonal(int[][] matrix) {
		        for (int i = 0; i < matrix.length; i++) {
		            System.out.print(matrix[i][i] + " ");
		        }
		        System.out.println();
	}

}
