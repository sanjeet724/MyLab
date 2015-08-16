package DataTypes;

public class Array2DTest {

	public static void main(String[] args) {
		int [][] grid = new int [12][8];
		int numRows = grid.length;
		int numCols = grid[0].length;
		
		// fill the grid
		for (int row = 0; row < numRows; row++){
			for (int col = 0; col < numCols; col++) {
				grid[row][col] = row*numCols + col + 1;
			}
		}
		
		// print the grid
		for (int row = 0; row < numRows; row++){
			for (int col = 0; col < numCols; col++) {
				System.out.printf("%3d", grid[row][col]);
		    }
		System.out.println();
		}
	}
}
