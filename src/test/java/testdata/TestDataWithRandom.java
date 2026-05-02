package testdata;

import com.github.javafaker.Faker;
import utils.RandomUtils;
import utils.RussianPhoneUtils;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestDataWithRandom {
    static Faker faker = new Faker();
    static RandomUtils randomUtils = new RandomUtils();


    public static String firstName = faker.name().firstName();
    public static String secondName = faker.name().lastName();
    public static String userMail = faker.internet().emailAddress();
    public static String phoneNumber = RussianPhoneUtils.generateRandomPhoneNumber();
    public static String imagePath = faker.options().option("mirana.gif", "shadow-fiend-zxc.gif");
    public static String myAddress = faker.address().fullAddress();
    public static String gender = randomUtils.getRandomGender();
    public static String firstHobie = randomUtils.getRandomHobbie();
    public static String secondHobie = randomUtils.getRandomHobbie();
    public static String myFavouriteSubject = randomUtils.getRandomSubject();
    public static String state = randomUtils.getRandomState();
    public static String city = randomUtils.getRandomCity(state);
    private static final LocalDate BIRTH_DATE = faker.date()
            .birthday()
            .toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();
    public static String year = String.valueOf(BIRTH_DATE.getYear());
    public static String month = BIRTH_DATE.format(DateTimeFormatter.ofPattern("MMMM", Locale.ENGLISH));
    public static String day = BIRTH_DATE.format(DateTimeFormatter.ofPattern("dd"));

}