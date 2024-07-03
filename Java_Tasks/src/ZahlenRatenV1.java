
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ZahlenRatenV1 {
    public ZahlenRatenV1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        ArrayList<Integer> me = new ArrayList();
        ArrayList<Integer> cpu = new ArrayList();

        while(true) {
            while(true) {
                int level;
                do {
                    do {
                        System.out.println("Which Level do you want to play? (type 0 to exit) ");
                        level = sc.nextInt();
                    } while(level < 0);
                } while(level > 4);

                me.clear();
                cpu.clear();
                if (level == 0) {
                    System.out.println("thank you for your time.. see ya!!");
                    return;
                }

                int rrrNumber;
                int tries1;
                int tries2;
                int min;
                switch (level) {
                    case 1:
                        rrrNumber = r.nextInt(101);
                        tries1 = 9;
                        System.out.println("Welcome to Level(1): try to guess the random number between 0-100");
                        System.out.println("please choose a number.. you have now: " + tries1 + " attempts");

                        do {
                            int guess;
                            do {
                                do {
                                    guess = sc.nextInt();
                                } while(guess < 0);
                            } while(guess > 100);

                            System.out.println("you have chose: " + guess);
                            --tries1;
                            if (guess == rrrNumber) {
                                System.out.println("Congrats!! you have guessed the random number");
                                break;
                            }

                            if (guess < rrrNumber) {
                                System.out.println("Try a bigger number, you still have: " + tries1 + " tries left");
                            } else {
                                System.out.println("Try a smaller number, you still have: " + tries1 + " tries left");
                            }
                        } while(tries1 > 0);

                        if (tries1 == 0) {
                            System.out.println("The random number was: " + rrrNumber);
                        }
                        break;
                    case 2:
                        rrrNumber = r.nextInt(101);
                        tries1 = 9;
                        System.out.println(" Welcome to Level(2). you have to guess a random number between 0-100");
                        System.out.println("please choose a number.. you have now " + tries1 + " attempts");

                        do {
                            do {
                                do {
                                    tries2 = sc.nextInt();
                                } while(tries2 < 0);
                            } while(tries2 > 100);

                            min = Math.abs(tries2 - rrrNumber);
                            --tries1;
                            if (tries2 == rrrNumber) {
                                System.out.println("Congrats! you've figured out the random number");
                                break;
                            }

                            if (min <= 3) {
                                System.out.println("almost there : between 1-3 more or less, you have: " + tries1 + " attempts.");
                            } else if (min <= 10) {
                                System.out.println("relatively there : between 4-10 more or less, you have: " + tries1 + " attempts.");
                            } else if (min <= 20) {
                                System.out.println("still not so far : between 11-20 more or less, you have: " + tries1 + " attempts.");
                            } else {
                                System.out.println("sooo far away : >20 more or less, you have: " + tries1 + " attempts.");
                            }
                        } while(tries1 > 0);

                        if (tries1 == 0) {
                            System.out.println("The random number was: " + rrrNumber);
                        }
                        break;
                    case 3:
                        rrrNumber = r.nextInt(101);
                        tries1 = 9;
                        tries2 = 9;
                        min = 0;
                        int max = 100;
                        System.out.println("Welcome to Level(3): you and computer will try to guess the random number between 0-100");
                        System.out.println("in this game each of you will see other's result, each player has 9 Attempts.");
                        System.out.println("Type anumber between 0 - 100");

                        for(boolean turn = r.nextBoolean(); tries1 > 0; turn = !turn) {
                            int mid = (min + max) / 2;
                            if (turn) {
                                System.out.println("It's my turn!!");

                                int myGuess;
                                do {
                                    do {
                                        myGuess = sc.nextInt();
                                    } while(myGuess < 0);
                                } while(myGuess > 100);

                                me.add(myGuess);
                                --tries1;
                                System.out.println("my guess(es): " + String.valueOf(me));
                                if (myGuess == rrrNumber) {
                                    System.out.println("Congrats! you have won this game.");
                                    break;
                                }

                                if (myGuess < rrrNumber) {
                                    System.out.println("Try a bigger number, " + tries1 + " tries left");
                                    if (myGuess >= min) {
                                        min = myGuess + 1;
                                    }
                                } else {
                                    System.out.println("Try a smaller number,  " + tries1 + " tries left");
                                    if (myGuess <= max) {
                                        max = myGuess - 1;
                                    }
                                }
                            } else {
                                System.out.println("It's computer's turn..");
                                --tries2;
                                cpu.add(mid);
                                System.out.println("cpu guess(es): " + String.valueOf(cpu));
                                if (mid == rrrNumber) {
                                    System.out.println("Congrats! you have won this game.");
                                    break;
                                }

                                if (mid < rrrNumber) {
                                    System.out.println("Try a bigger number, " + tries2 + " tries left");
                                    min = mid + 1;
                                } else {
                                    System.out.println("Try a smaller number, " + tries2 + " tries left");
                                    max = mid - 1;
                                }
                            }
                        }

                        if (tries1 == 0) {
                            System.out.println("My Guesses: " + String.valueOf(me));
                            System.out.println("Computer Guesses: " + String.valueOf(cpu));
                            System.out.println("the random number was: " + rrrNumber);
                        }
                        break;
                    case 4:
                        System.out.println("Bis ZahlenRatenV2 !!");
                        break;
                    default:
                        System.out.println("Invalid level .. please type 1,2,3 or 4 ");
                }
            }
        }
    }
}
