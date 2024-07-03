

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MineSweeperV2 {
    public MineSweeperV2() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int mineCount = 0;
        int[][] map = new int[10][10];
        int revealed = 0;
        ArrayList<String> inputs = new ArrayList();

        int y;
        int x;
        for(y = 0; y < map.length; ++y) {
            for(x = 0; x < map[0].length; ++x) {
                map[y][x] = r.nextInt(4) - 3;
                if (map[y][x] == 0) {
                    ++mineCount;
                }
            }

            System.out.println();
        }

        while(revealed < 100 - mineCount) {
            System.out.println("   A  B  C  D  E  F  G  H  I  J");

            for(y = 0; y < map.length; ++y) {
                System.out.print("" + y + " ");

                for(x = 0; x < map[0].length; ++x) {
                    switch (map[y][x]) {
                        case 1:
                            System.out.print("[*]");
                            break;
                        case 2:
                            System.out.print("[-]");
                            break;
                        default:
                            System.out.print("[ ]");
                    }
                }

                System.out.println();
            }

            double percent = (double)(100 * revealed) / (double)(100 - mineCount);
            String xxx = String.format("You have revealed: %d / %d (%.2f%%) of the map", revealed, 100 - mineCount, percent);
            System.out.println(xxx);
            System.out.println("there are: " + mineCount + " mines still hidden.");

            String userInput;
            int col;
            int row;
            do {
                do {
                    System.out.println("Where do you want to search?? type only a letter (A-J) then a number(0-9)...");
                    userInput = sc.nextLine().toUpperCase();
                    col = userInput.charAt(0) - 65;
                    row = userInput.charAt(1) - 48;
                } while(col < 0);
            } while(col > 9 || row < 0 || row > 9 || inputs.contains(userInput));

            inputs.add(userInput);
            if (map[row][col] == 0) {
                map[row][col] = 1;
                System.out.println("That's a mine.. GAME OVER!!");
                break;
            }

            if (map[row][col] == -1) {
                map[row][col] = 2;
                ++revealed;
            } else {
                int i;
                int j;
                if (map[row][col] == -2) {
                    for(i = row - 1; i <= row + 1; ++i) {
                        for(j = col - 1; j <= col + 1; ++j) {
                            if (i >= 0 && i < map.length && j >= 0 && j < map[i].length) {
                                if (map[i][j] == 0) {
                                    map[i][j] = 1;
                                } else {
                                    map[i][j] = 2;
                                    ++revealed;
                                }
                            }
                        }
                    }
                } else if (map[row][col] == -3) {
                    for(i = row - 2; i <= row + 2; ++i) {
                        for(j = col - 2; j <= col + 2; ++j) {
                            if (i >= 0 && i < map.length && j >= 0 && j < map[i].length) {
                                if (map[i][j] == 0) {
                                    map[i][j] = 1;
                                } else {
                                    map[i][j] = 2;
                                    ++revealed;
                                }
                            }
                        }
                    }
                }
            }

            if (revealed == 100 - mineCount) {
                System.out.println(" Congrats!! you have swept all the area!");
            }
        }

    }
}
