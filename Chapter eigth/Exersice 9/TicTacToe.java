import java.util.Scanner;
public class TicTacToe{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int player = 1;
		int row;
		int column;
		char[][] grid = {{' ',' ',' '},
						{' ',' ',' '},
						{' ',' ',' '}};
		boolean gameOver = false;
		short[] o = {0,0,0,0};
		short[] x = {0,0,0,0};
		short count = 0;

		while(!gameOver){

			System.out.println("----------");
			for(int i = 0; i < 3; i ++){
				o[0] = 0;
				o[1] = 0;
				o[2] = 0;
				o[3] = 0;
				x[0] = 0;
				x[1] = 0;
				x[2] = 0;
				x[3] = 0;

				for (int j  = 0; j < 3; j ++){
					System.out.print("|" + grid[i][j] );
					if(grid[i][j] == 'O'){ 
						o[0]++;
					}
					else if(grid[i][j] == 'X'){ 
						x[0]++;
					}

					if(grid[j][i] == 'O'){
						o[1]++;
					}
					else if(grid[j][i] == 'X'){
						x[1]++;
					}

					if(grid[j][j] == 'O'){
						o[2]++;
					}
					else if(grid[j][j] == 'X'){
						x[2]++;
					}

					if(grid[j][2-j] == 'O'){
						o[3]++;
					}
					else if(grid[j][2-j] == 'X'){
						x[3]++;
					}
				}

				System.out.println("|");
				System.out.println("----------");

				if (o[0] == 3 || o[1] == 3 || o[2] == 3 || o[3] == 3){
					gameOver = true; 
				}
				else if(x[0] == 3 || x[1] == 3 || x[2] == 3 || x[3] == 3){
					gameOver = true; 
				} 
			}

			if (gameOver == false && count < 9){
				System.out.println("Enter a row (0, 1, or 2) for player " + player + ": ");
				row = input.nextInt();
				System.out.println("Enter a column (0, 1, or 2) for player " + player + ": ");
				column = input.nextInt();

				if (grid[row][column] != ' '){
					System.out.println("The cell is already fill please enter another cell");
				}
				else{
					if (player == 1){
						grid[row][column] = 'O';
						player = 2;
					}
					else{
						grid[row][column] = 'X';
						player = 1;
					}
					count++;
					if(count == 9){
						gameOver = true;
					}
				}
			}
		}

		if (count == 9){
			System.out.println("DRAW");
		}
		else {
			System.out.println("The winner is palyer " + player);
		}
		
	}
}