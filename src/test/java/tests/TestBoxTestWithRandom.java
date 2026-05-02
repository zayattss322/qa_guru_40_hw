package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;
import testdata.TestDataWithRandom;



public class TestBoxTestWithRandom extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();
    @Test
    @DisplayName("Test box test with random")
    void testBoxTestWithRandom() {
        textBoxPage.openPage()
                .checkTitle()
                .setUserName(TestDataWithRandom.firstName)
                .setEmail(TestDataWithRandom.userMail)
                .setCurrentAddress(TestDataWithRandom.myAddress)
                .setPermanentAddress(TestDataWithRandom.state + TestDataWithRandom.city)
                .clickButtonSubmit();
    }
}
