package time;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Time time = new Time(random.nextInt(0, 23),
                random.nextInt(0,59), random.nextInt(0,59));
        time.getTime();
        System.out.println("Enter: ");
        String enter = scanner.next();
        if (Objects.equals(enter, "next")){
            time.nextSecond();
        } else if (Objects.equals(enter, "prev")) {
            time.previousSecond();
        } else {
            System.out.println("command invalid");
        }
    }
}
