import java.util.Random;

public class GameOfLife {
    static int getNeighbors(int x, int y, int[][] gameField) {
        int neighbors = 0;
        if (x - 1 >= 0 && y - 1 >= 0 && x + 1 < gameField.length && y + 1 < gameField[0].length) {
            for (int i = x-1; i <= x+1 ; i++) {
                for (int j = y-1; j <= y+1 ; j++) {
                    if (gameField[i][j] == 1 && (i != x & j != y)) {
                        neighbors++;
                    }
                }
            }
        }
        return neighbors;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int generations = 10;

        int[][] gameField = new int[6][25];
        for (int x = 0; x < gameField.length; x++) {
            for (int y = 0; y < gameField[0].length; y++) {
                gameField[x][y] = r.nextInt(2);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");

        while (generations > 0) {
            for (int x = 0; x < gameField.length; x++) {
                System.out.println(" ");
                for (int y = 0; y < gameField[0].length; y++) {
                    int neighbors = getNeighbors(x, y, gameField);

                    if (x == 0 || x == gameField.length - 1 || y == 0 || y == gameField[0].length - 1) {
                        gameField[x][y] = r.nextInt(2);
                        if (gameField[x][y] == 1) {
                            System.out.print("\uD83D\uDFE9");
                        } else {
                            System.out.print("  ");
                        }
                    } else if (gameField[x][y] == 0 && neighbors == 3) {
                        gameField[x][y] = 1;
                        System.out.print("\uD83D\uDFE9");
                    } else if (gameField[x][y] == 1 && neighbors < 2) {
                        gameField[x][y] = 0;
                        System.out.print("  ");
                    } else if (gameField[x][y] == 1 && (neighbors == 2 || neighbors == 3)) {
                        gameField[x][y] = 1;
                        System.out.print("\uD83D\uDFE9");
                    } else if (gameField[x][y] == 1 && neighbors > 3) {
                        gameField[x][y] = 0;
                        System.out.print("  ");
                    }
                }
            }
            generations--;
            System.out.println(" ");
            System.out.println("...................................................");
        }
    }


}




