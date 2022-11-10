package time;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Time time = new Time(random.nextInt(0,23),
                random.nextInt(0,59), random.nextInt(0,59));
        time.getTime();
        time.nextSecond();
        time.previousSecond();
    }
}
