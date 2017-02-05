package algorithmTest.basic.medium.medium_1;

public class BattleshipsInBoard {
	public int countBattleships(char[][] board) {
		if(board == null || board.length == 0) return 0;
		int len = board[0].length;
		int width = board.length ;
		int count = 0;
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < len; j++) {
				// ��Ҫ�Ĺ��򣨷����壬���и��٣�ͬʱ���� ��
				if (board[i][j] == 'X') {
					count++;
					removeBody(board, i, j);
				}
			}
		}
		return count;
	}

	public void removeBody(char[][] board, int i, int j) {
		board[i][j] = '.';
		// ����ȥ��
		for (int k = j + 1; k < board[0].length; k++) {
			if(board[i][k] == 'X'){
				board[i][k] = '.';
			}else{
				break;
			}
		}
		for (int k = i + 1; k < board.length; k++) {
			if(board[k][j]=='X'){
				board[k][j] = '.';
			}else{
				break;
			}
		}
	}
	public static void main(String args[]){
		char[][] board = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
		new BattleshipsInBoard().countBattleships(board);
	}
}
