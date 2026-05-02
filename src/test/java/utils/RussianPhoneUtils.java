package utils;

import java.util.Random;

public class RussianPhoneUtils {

    private static final String[] CODES = {"495", "499", "916", "917", "903", "906", "907"};
    private static final Random RANDOM = new Random();

    public static String generateRandomPhoneNumber() {
        String code = CODES[RANDOM.nextInt(CODES.length)];

        StringBuilder remainingDigits = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            remainingDigits.append(RANDOM.nextInt(10));
        }

        String phoneNumber = code + remainingDigits.toString();

        return phoneNumber;
    }

    }