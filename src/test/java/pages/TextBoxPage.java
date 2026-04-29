package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {

    private final SelenideElement

    userNameInput= $("#userName"),

    userEmailInput = $("#userEmail"),

    currentAddressInput = $("#currentAddress"),

    permanentAddressInput =  $("#permanentAddress"),

    buttonSubmit = $("#submit"),

    checkResult  = $("#output")
            ;


    public TextBoxPage openPage(){
        open("/text-box");
        $(".text-center").shouldHave(text("Text Box"));

        return this;
    }
    public TextBoxPage checkTitle(){
        $(".text-center").shouldHave(text("Text Box"));

        return this;
    }
    public TextBoxPage setUserName(String value){
        userNameInput.setValue(value);

        return this;
    }

    public TextBoxPage setEmail(String value){
        userEmailInput.setValue(value);

        return this;
    }

    public TextBoxPage setCurrentAddress(String value){
        currentAddressInput.setValue(value);

        return this;
    }

    public TextBoxPage setPermanentAddress(String value){
        permanentAddressInput.setValue(value);

        return this;
    }
    public TextBoxPage clickButtonSubmit () {
        buttonSubmit.click();

        return this;
    }

}