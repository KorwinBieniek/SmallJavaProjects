package battleship;

public class GameBoard {

    public String[][] createBoard() {
        String[][] gameBoard = new String[10][10];
        fillBoard(gameBoard);
        return gameBoard;
    }

    private void fillBoard(String[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = " ~";
            }
        }
    }

    public void printBoard() {
        String[][] gameBoard = createBoard();
        int ASCIInum = 65;
        System.out.print(" ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+1 + " ");
        }
        System.out.println();


        for (String[] strings : gameBoard) {
            System.out.print((char) ASCIInum++);
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
