//made by calinMa

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		int i,j,nrLines,nrColumns;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give the matrix number of lines:");
		nrLines = scanner.nextInt();
		System.out.println("Give the matrix number of columns:");
		nrColumns = scanner.nextInt();
		int[][] matrix = new int[nrLines][nrColumns];
		//read the elements of the matrix
		for (i=0; i< nrLines; i++)
			for (j=0; j< nrColumns; j++) {
				System.out.println("The element from the position " + i + " " + j);
				matrix[i][j] = scanner.nextInt();
			}
		//write the elements of the matrix
		System.out.println("The elements from the matrix are: ");
		for (i=0; i< nrLines; i++) {
			for (j=0; j< nrColumns; j++) {
			      System.out.print(matrix[i][j] + "  "); 
			}  //print on a new line
			      System.out.println("");
		}
	}

}
