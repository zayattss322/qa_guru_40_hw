package utils;

import java.util.Random;
import com.github.javafaker.Faker;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RandomUtils {
    private static final Random RANDOM = new Random();
    private static final Faker FAKER = new Faker(new Locale("us"));

    public static String generateRandomFirstName() {
        return FAKER.name().firstName();
    }

    public static String generateRandomLastName() {
        return FAKER.name().lastName();
    }

    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        return FAKER.options().option(genders);
    }

    public static String getRandomState() {
        String[] state = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

        return FAKER.options().option(state);
    }

    public static String getRandomCity(String state) {
        String[] citiesOfNCR = {"Delhi","Gurgaon", "Noida"},
                citiesOfUttarPradesh = {"Agra", "Lucknow", "Merrut"},
                citiesOfHaryana = {"Karnal", "Panipat"},
                citiesOfRajasthan = {"Jaipur", "Jaiselmer"};
        return switch (state) {
            case "NCR" -> FAKER.options().option(citiesOfNCR);
            case "Uttar Pradesh" -> FAKER.options().option(citiesOfUttarPradesh);
            case "Haryana" -> FAKER.options().option(citiesOfHaryana);
            default -> FAKER.options().option(citiesOfRajasthan);
        };
    }

    public String getRandomHobbie() {
        String[] hobbie = {"Sports", "Reading", "Music"};

        return FAKER.options().option(hobbie);
    }

    public String getRandomSubject() {
        String[] myFavouriteSubject = {"English", "Social Studies", "Chemistry", "Maths", "Economics", "Arts"};

        return FAKER.options().option(myFavouriteSubject);
    }

    public LocalDate getRandomBirthDate(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        int randomAge = minAge + RANDOM.nextInt(maxAge - minAge + 1);
        return now.minusYears(randomAge);
    }

    public String getRandomBirthMonth(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MMMM", Locale.ENGLISH));
    }

    public String getRandomBirthYear(LocalDate date) {
        return String.valueOf(date.getYear());
    }

    public String getRandomBirthDay(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd"));
    }

    public String getRandomBirthDateFormatted(LocalDate date) {
        return getRandomBirthDay(date) + " " + getRandomBirthMonth(date) + "," + getRandomBirthYear(date);
    }

    public static String generateRandomFullName() {
        return generateRandomFirstName() + " " + generateRandomLastName();
    }

}