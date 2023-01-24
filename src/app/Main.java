package app;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int inCircle = 0;
        int totalPoints = 1000000;
        Random random = new Random();
        for (int i = 0; i < totalPoints; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double distance = Math.sqrt((x*x) + (y*y));
            if (distance <= 1) {
                inCircle++;
            }
        }
        double pi = 4.0 * inCircle / totalPoints;
        System.out.println("Pi number ~ " + pi);
    }
}