

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class KinoVerwaltungV2 {
    public KinoVerwaltungV2() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] seatsLeft = new int[]{3, 1, 0, 5};
        ArrayList<Integer> chosenMovies = new ArrayList();
        String[][] movies = new String[][]{{"1.", "Inception", "  18:30", "3   ", String.valueOf(seatsLeft[0])}, {"2.", "Terminator3", "19:00", "4   ", String.valueOf(seatsLeft[1])}, {"3.", "Oppenheimer", "19:00", "2   ", String.valueOf(seatsLeft[2])}, {"4.", "Barbie", "     20:45", "1   ", String.valueOf(seatsLeft[3])}};
        int[] stockLeft = new int[]{117, 0, 50};
        double[] snackPrices = new double[]{1.5, 2.75, 4.0};
        ArrayList<Integer> chosenSnacks = new ArrayList();
        String[][] snackBar = new String[][]{{"1.", "Chocolate", String.valueOf(snackPrices[0]), String.valueOf(stockLeft[0])}, {"2.", "Nuts mix", String.valueOf(snackPrices[1]), String.valueOf(stockLeft[1])}, {"3.", "Sandwich", String.valueOf(snackPrices[2]), String.valueOf(stockLeft[2])}};
        int a = 1;
        int b = 1;
        int c = a + b;
        System.out.println(" Welcome by (Our Cinema), you have to pay at least 15€ to show our programs... ");

        double cash;
        do {
            System.out.println("how much money do you want to pay? (type 0 to exit) ");
            cash = (double) sc.nextInt();
        } while (cash < 15.0 && cash != 0.0);

        while (cash != 0.0) {
            System.out.println("your credit is: " + cash + "€ , here is our programs:");
            System.out.println("1. Buy movie ticket(s)");
            System.out.println("2. Buy snack(s)");
            System.out.println("3. watch a movie");
            System.out.println("4. have some snack");
            System.out.println("5. play (lucky number) game {costs 5.00€}");
            System.out.println("6. leave the cinema");

            int choose;
            do {
                do {
                    System.out.println("choose please the number of the Program that you want...");
                    choose = sc.nextInt();
                } while (choose > 6);
            } while (choose < 1);

            if (choose == 6) {
                System.out.println("here is your money: " + cash + "€, Thank you for your visit.. Good bye!");
                break;
            }

            int i;
            int x;
            switch (choose) {
                case 1:
                    System.out.println(" Here are our movies Table for today: ");
                    System.out.println("-------------------------------------------------------");
                    System.out.println(" Filmnr    Filmname         Time      Hall    SeatsLeft");
                    System.out.println("-------------------------------------------------------");

                    for (i = 0; i < movies.length; ++i) {
                        for (x = 0; x < movies[0].length; ++x) {
                            if (x == 4 && seatsLeft[i] > 0) {
                                System.out.print("available");
                            } else if (x == 4 && seatsLeft[i] <= 0) {
                                System.out.print("booked");
                            } else {
                                System.out.print("   " + movies[i][x] + "   ");
                            }
                        }

                        System.out.println();
                    }

                    System.out.println("-------------------------------------------------------");

                    int filmNumber;
                    do {
                        do {
                            System.out.println("Which movie do you want to watch (to cancel press 0).");
                            filmNumber = sc.nextInt();
                        } while (filmNumber > movies.length);
                    } while (filmNumber < 0);

                    if (filmNumber == 0) {
                        System.out.println("Thank you for your visit. ");
                        continue;
                    }

                    System.out.println("Nice choice ;)");
                    System.out.println("Available tickets: [" + seatsLeft[filmNumber - 1] + "].");
                    if (seatsLeft[filmNumber - 1] <= 0) {
                        System.out.println("No more available Tickets!! ");
                        continue;
                    }

                    int tickets;
                    do {
                        do {
                            System.out.println("How many tickets do you want? (to cancel press 0).");
                            tickets = sc.nextInt();
                        } while (tickets < 0);
                    } while (tickets > seatsLeft[filmNumber - 1]);

                    if (tickets == 0) {
                        System.out.println("Thank you for your visit. ");
                        continue;
                    }

                    if (!(cash < (double) (tickets * 15))) {
                        System.out.println("you have bought (" + tickets + ") ticket(s) and here is your " + (cash - (double) (15 * tickets)) + "€ cash back!");

                        for (i = 0; i < tickets; ++i) {
                            chosenMovies.add(filmNumber);
                        }

                        seatsLeft[filmNumber - 1] -= tickets;
                        movies[filmNumber - 1][4] = String.valueOf(seatsLeft[filmNumber - 1]);
                        System.out.println(chosenMovies);
                        cash -= (double) (15 * tickets);
                        continue;
                    }

                    System.out.println("Not enough Money!! You can only buy " + (int) (cash / 15.0) + " tickets!! ");
                case 2:
                    System.out.println(" Here are our snacks Table for today: ");
                    System.out.println("-------------------------------------------------------");
                    System.out.println(" Nr.    Snack         Price   Still Left?");
                    System.out.println("-------------------------------------------------------");

                    for (i = 0; i < snackBar.length; ++i) {
                        for (x = 0; x < snackBar[0].length; ++x) {
                            if (x == 3 && stockLeft[i] > 0) {
                                System.out.print("yes");
                            } else if (x == 3 && stockLeft[i] <= 0) {
                                System.out.print("no");
                            } else {
                                System.out.print("   " + snackBar[i][x] + "   ");
                            }
                        }

                        System.out.println();
                    }

                    System.out.println("-------------------------------------------------------");

                    int snackNumber;
                    do {
                        do {
                            System.out.println("Which snack do you want to have (to cancel press 0).");
                            snackNumber = sc.nextInt();
                        } while (snackNumber > snackBar.length);
                    } while (snackNumber < 0);

                    if (snackNumber == 0) {
                        System.out.println("Thank you for your visit. ");
                        continue;
                    }

                    System.out.println("Yummy choice ;)");
                    System.out.println("Available Snacks: [" + stockLeft[snackNumber - 1] + "] pieces.");
                    if (stockLeft[snackNumber - 1] <= 0) {
                        System.out.println("No more Stocks!! ");
                        continue;
                    }

                    int snack;
                    do {
                        do {
                            System.out.println("How many of this snack do you want? (to cancel press 0).");
                            snack = sc.nextInt();
                        } while (snack < 0);
                    } while (snack > stockLeft[snackNumber - 1]);

                    if (snack == 0) {
                        System.out.println("Thank you for your visit. ");
                        continue;
                    }

                    if (!(cash < (double) snack * snackPrices[snackNumber - 1])) {
                        System.out.println("you have bought (" + snack + ") snack(s) and here is your " + (cash - snackPrices[snackNumber - 1] * (double) snack) + "€ cash back!");

                        for (i = 0; i < snack; ++i) {
                            chosenSnacks.add(snackNumber);
                        }

                        stockLeft[snackNumber - 1] -= snack;
                        snackBar[snackNumber - 1][3] = String.valueOf(stockLeft[snackNumber - 1]);
                        System.out.println(chosenSnacks);
                        cash -= snackPrices[snackNumber - 1] * (double) snack;
                        continue;
                    }

                    System.out.println("Not enough Money!! You can only buy " + cash / snackPrices[snackNumber - 1] + " snacks!! ");
                case 3:
                    break;
                case 4:
                    if (chosenSnacks.isEmpty()) {
                        System.out.println("Please buy snack(s) first!");
                        continue;
                    }

                    System.out.println("Which snack do you want to have?");

                    int selectSnack;
                    do {
                        do {
                            System.out.println("1.Chocolate    2.Nuts Mix    3.Sandwich");
                            selectSnack = sc.nextInt();
                        } while (selectSnack > snackBar.length);
                    } while (selectSnack < 1);

                    if (!chosenSnacks.contains(selectSnack)) {
                        System.out.println("you have picked the wrong Snack ");
                        continue;
                    }

                    System.out.println("you've selected snack number " + selectSnack + ". Enjoy!!");

                    for (i = 0; i < chosenSnacks.size(); ++i) {
                        chosenSnacks.remove(selectSnack);
                    }

                    System.out.println(chosenSnacks);
                    continue;
                case 5:
                    cash -= 5.0;
                    i = r.nextInt(201);
                    System.out.println("your lucky number is: " + i);

                    for (x = 0; x <= 10; ++x) {
                        c = a + b;
                        System.out.println("" + a + " + " + b + " = " + c);
                        a = b;
                        b = c;
                    }

                    if (i != c && i % 10 != 0) {
                        System.out.println("unfortunately you have lost!!");
                        b = 1;
                        a = 1;
                        continue;
                    }

                    System.out.println("Congrats!! you have won 20€ ");
                    cash += 20.0;
                    b = 1;
                    a = 1;
                    continue;
                default:
                    System.out.println("invalid entry, please try again");
                    continue;
            }

            if (chosenMovies.isEmpty()) {
                System.out.println("Please buy ticket(s) first!");
            } else {
                System.out.println("Which movie do you want to watch?");

                int selectMovie;
                do {
                    do {
                        System.out.println("1.Inception    2.Terminator3    3.Oppenheimer    4.Barbie");
                        selectMovie = sc.nextInt();
                    } while (selectMovie > movies.length);
                } while (selectMovie < 1);

                if (!chosenMovies.contains(selectMovie)) {
                    System.out.println("you have picked the wrong movie ticket ");
                } else {
                    System.out.println("you've selected movie number " + selectMovie + ". Enjoy!!");

                    for (i = 0; i < chosenMovies.size(); ++i) {
                        chosenMovies.remove(selectMovie);
                    }

                    System.out.println(chosenMovies);
                }
            }
        }

    }
}
