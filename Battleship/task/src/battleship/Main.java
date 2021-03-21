package battleship;

public class Main {

    public static void main(String[] args) {
        // Write your code here
        GameBoardCreator gb = new GameBoardCreator();
        String[][] gameBoard = gb.createBoard();

        gb.printBoard();
    }


}
