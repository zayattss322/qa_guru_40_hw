package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static testdata.TestData.*;

import pages.RegistrationPage;
import testdata.TestData;

public class RegistrationTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    @Test
    @DisplayName("Registration test")
    void registrationTest() {
        registrationPage.openPage()
                // Базовые вопросы
                .typeFirstName(firstName)
                .typeSecondName(secondName)
                .setUserEmail(userMail)
                .setGender(gender)
                .setUserNumber(phoneNumber)
                // Работа с календарём, указываем дату рождения
                .setBirthDate(TestData.day, TestData.month, TestData.year)
                // Заполняем хобби
                .setSubject(myFavouriteSubject)
                .setHobbies(firstHobie)
                .setHobbies(secondHobie)
                // Загрузка файла
                .uploadPicture(imagePath)
                // Адрес
                .setCurrentAddress(myAddress)
                // Штат и город
                .setState(state)
                .setCity(city)
                // Отправка формы
                .submitClick();


                // Проверка результатов
               registrationPage.checkResultsForm("Student Name" , TestData.firstName + " " + TestData.secondName)
                .checkResultsForm("Student Email", TestData.userMail)
                .checkResultsForm("Gender", TestData.gender)
                .checkResultsForm("Mobile", TestData.phoneNumber)
                .checkResultsForm("Date of Birth", TestData.day + " " + TestData.month + "," + TestData.year)
                .checkResultsForm("Subjects", TestData.myFavouriteSubject)
                .checkResultsForm("Hobbies", TestData.firstHobie + ", " + TestData.secondHobie)
                .checkResultsForm("Picture", TestData.imagePath)
                .checkResultsForm("Address", TestData.myAddress)
                .checkResultsForm("State and City", TestData.state + " " + TestData.city);
    }
}