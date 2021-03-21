package battleship;

import java.util.Scanner;

public class GameBoardShipPlacer {

    private GameBoardCreator gb;

    public void placeShipsLoop() {
        int shipsCount = 0;

        while(shipsCount < 5) {
            switch (shipsCount) {
                case 0:
                    System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):\n");

                    break;
                case 1:
                    System.out.println("Enter the coordinates of the Battleship (4 cells):\n");
                    break;
                case 2:
                    System.out.println("Enter the coordinates of the Submarine (3 cells):\n");
                    break;
                case 3:
                    System.out.println("Enter the coordinates of the Cruiser (3 cells):\n");
                    break;
                case 4:
                    System.out.println("Enter the coordinates of the Destroyer (2 cells):\n");
                    break;

            }
            shipsCount++;
        }
    }

    public void placeShip(int shipsCount) {
        Scanner shipPosition = new Scanner(System.in);
        gb.createBoard();

        switch(shipsCount) {
            case 0:

                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
        }

    }

    public void checkIfShipCanBePlaced() {

    }
}
