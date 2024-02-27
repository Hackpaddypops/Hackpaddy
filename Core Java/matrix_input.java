import java.util.*;
public class matrix_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int i,j;
		
		System.out.println("No of rows you want in matrix:");

		i= input.nextInt();
		
		System.out.println("No of columns you want in matrix:");

		j= input.nextInt();
		
		
		
		int[][] num = new int[i][j];
		
		for(int k=0; k<i;k++) {
			
			for(int l=0;l<j;l++) {
				
				System.out.println("Enter number for "+k+","+l+" place.");
				
				num[k][l]=input.nextInt();
			}
		}
		
		input.close();
		
for(int k=0; k<i;k++) {
			
			for(int l=0;l<j;l++) {
				
				System.out.println("Numbers at place "+ k + " and "+ l+ " are "+num[k][l]);
			}
		}
	}

}
