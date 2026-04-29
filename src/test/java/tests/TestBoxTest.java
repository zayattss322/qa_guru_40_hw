package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import testdata.TestData;
import testdata.TestBase ;
import pages.TextBoxPage;


public class TestBoxTest extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();
    @Test
    @DisplayName("Test box test")
    void testBoxTest() {
        textBoxPage.openPage()
                .checkTitle()
                .setUserName(TestData.firstName)
                .setEmail(TestData.userMail)
                .setCurrentAddress(TestData.myAddress)
                .setPermanentAddress(TestData.state + TestData.city)
                .clickButtonSubmit();
    }
}
