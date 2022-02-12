package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {

    @BeforeAll
    static void beforeAll() {

        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successFillTest() {

        open("/text-box");
        $(".main-header").shouldHave(text("Text Box"));
        $("#userName").setValue("Gagarin");
        $("#userEmail").setValue("gagarin@comp.ru");
        $("#currentAddress").setValue("Address and street 1");
        $("#permanentAddress").setValue("Address and building 2");
        $("#submit").click();

        $("#output").shouldHave(text("Gagarin"),text("gagarin@comp.ru"),
                text("Address and street 1"),text("Address and building 2"));


    }
}
