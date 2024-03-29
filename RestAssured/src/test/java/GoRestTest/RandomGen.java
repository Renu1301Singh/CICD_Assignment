package GoRestTest;

import java.util.Random;

public class RandomGen {
    public static String generateRandomName() {
        return "samaira" + new Random().nextInt(1000);
    }

    public static String generateDynamicEmail() {
        return "samaira" + new Random().nextInt(1000) + "@gmail.com";
    }
}
