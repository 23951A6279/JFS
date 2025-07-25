import java.util.Scanner;
public class MatrixDS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size in n*n matrix:");
		int n=sc.nextInt();
		int[][] matrix=new int[n][n];
		System.out.println("enter the elements in the matrix :");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=matrix[i][i];
		}
		System.out.println("the sum of diagonal i s:"+sum);
	}
}

		