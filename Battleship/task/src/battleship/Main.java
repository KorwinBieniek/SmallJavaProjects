package battleship;

public class Main {

    public static void main(String[] args) {
        // Write your code here
        GameBoard gb = new GameBoard();
        String[][] gameBoard = gb.createBoard();

        gb.printBoard();
    }


}
