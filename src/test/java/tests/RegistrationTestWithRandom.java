package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import pages.RegistrationPage;
import testdata.TestDataWithRandom;


public class RegistrationTestWithRandom extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    @Test
    @DisplayName("Registration test with random")
    void registrationTest() {
        registrationPage.openPage()
                // Базовые вопросы
                .typeFirstName(TestDataWithRandom.firstName)
                .typeSecondName(TestDataWithRandom.secondName)
                .setUserEmail(TestDataWithRandom.userMail)
                .setGender(TestDataWithRandom.gender)
                .setUserNumber(TestDataWithRandom.phoneNumber)
                // Работа с календарём, указываем дату рождения
                .setBirthDate(TestDataWithRandom.day, TestDataWithRandom.month, TestDataWithRandom.year)
                // Заполняем хобби
                .setSubject(TestDataWithRandom.myFavouriteSubject)
                .setHobbies(TestDataWithRandom.firstHobie)
                .setHobbies(TestDataWithRandom.secondHobie)
                // Загрузка файла
                .uploadPicture(TestDataWithRandom.imagePath)
                // Адрес
                .setCurrentAddress(TestDataWithRandom.myAddress)
                // Штат и город
                .setState(TestDataWithRandom.state)
                .setCity(TestDataWithRandom.city)
                // Отправка формы
                .submitClick();


        // Проверка результатов
        registrationPage.checkResultsForm("Student Name" , TestDataWithRandom.firstName + " " + TestDataWithRandom.secondName)
                .checkResultsForm("Student Email", TestDataWithRandom.userMail)
                .checkResultsForm("Gender", TestDataWithRandom.gender)
                .checkResultsForm("Mobile", TestDataWithRandom.phoneNumber)
                .checkResultsForm("Date of Birth", TestDataWithRandom.day + " " + TestDataWithRandom.month + "," + TestDataWithRandom.year)
                .checkResultsForm("Subjects", TestDataWithRandom.myFavouriteSubject)
                .checkResultsForm("Hobbies", TestDataWithRandom.firstHobie + ", " + TestDataWithRandom.secondHobie)
                .checkResultsForm("Picture", TestDataWithRandom.imagePath)
                .checkResultsForm("Address", TestDataWithRandom.myAddress)
                .checkResultsForm("State and City", TestDataWithRandom.state + " " + TestDataWithRandom.city);
    }
}