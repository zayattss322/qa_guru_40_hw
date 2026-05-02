package utils;

import java.util.Random;
import com.github.javafaker.Faker;
import java.util.Locale;

public class RandomUtils {
    private static final Faker FAKER = new Faker(new Locale("us"));



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
}