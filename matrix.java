import java.util.Scanner;


public class Matrix{

	static void transposeMatrix(int[][] matrix,int rows,int cols,int[][] result){
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				result[i][j]=matrix[j][i];
			}
		}
		
	}
	static void displayMatrix(int[][] matrix,int rows,int cols){
		System.out.println("Elements in the matrix");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.println(matrix[i][j]);
			}
		}
	}
	public static void main(String args[]){
		int[][] matrix =new int[10][10];
		int[][] result=new int[10][10];
       		Scanner scanner=new Scanner(System.in);	
		int rows,cols;
		System.out.println("Enter the number of rows in matrix");
		rows=scanner.nextInt();
		System.out.println("Enter the number of cols in matrix");
		cols=scanner.nextInt();
		System.out.println("Enter the matrix");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				matrix[i][j]=scanner.nextInt();
			}
		}
		displayMatrix(matrix,rows,cols);
		transposeMatrix(matrix,rows,cols,result);
		System.out.println("The matrix after transpose operation");
		displayMatrix(result,rows,cols);
	}
}

