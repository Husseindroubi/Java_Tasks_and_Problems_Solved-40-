
import java.util.Random;

public class CyberSecurityV1 {
    public CyberSecurityV1() {
    }

    public static void main(String[] args) {
        Random r = new Random();
        String rPass = "";
        int attempts = 0;
        long totalAttempts = 0L;
        int best = 9999;
        int worst = 1;
        boolean found = false;
        String criteria = "ABCabc012!";
        char[] array = criteria.toCharArray();

        for(int j = 0; j < 1000; ++j) {
            rPass = "";
            found = false;

            int x;
            for(int i = 0; i < 4; ++i) {
                x = array[r.nextInt(criteria.length())];
                rPass = rPass + x;
            }

            System.out.println("The random password is: " + rPass);
            attempts = 0;
            char[] var31 = array;
            x = array.length;

            for(int var14 = 0; var14 < x; ++var14) {
                char a1 = var31[var14];
                if (!found) {
                    char[] var16 = array;
                    int var17 = array.length;

                    for(int var18 = 0; var18 < var17; ++var18) {
                        char a2 = var16[var18];
                        if (!found) {
                            char[] var20 = array;
                            int var21 = array.length;

                            for(int var22 = 0; var22 < var21; ++var22) {
                                char a3 = var20[var22];
                                if (!found) {
                                    char[] var24 = array;
                                    int var25 = array.length;

                                    for(int var26 = 0; var26 < var25; ++var26) {
                                        char a4 = var24[var26];
                                        if (!found) {
                                            char[] a = new char[]{a1, a2, a3, a4};
                                            String myPass = new String(a);
                                            ++attempts;
                                            if (myPass.equals(rPass)) {
                                                System.out.println("Found it: " + rPass + " = " + myPass);
                                                System.out.println("your guess is: " + attempts);
                                                found = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            totalAttempts += (long)attempts;
            if (attempts < best) {
                best = attempts;
            }

            if (attempts > worst) {
                worst = attempts;
            }
        }

        System.out.println(best);
        System.out.println(worst);
        System.out.println("Average of attempts is: " + totalAttempts / 1000L);
    }
}
