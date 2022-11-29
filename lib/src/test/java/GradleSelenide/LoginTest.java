package GradleSelenide;

import com.codeborne.selenide.Condition;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest{

    PageObjectModel pageModel = new PageObjectModel();

    @Before
    public void before(){
        open("https://habr.com/ru/all/");
    }

    @Test
    public void Login(){
        pageModel.getProfileButton().click();
        pageModel.getEnterButton().click();
        pageModel.getEmail().setValue("testselenide1234@mail.ru");
        pageModel.getPassword().setValue("selenidetest1234");
        pageModel.pressSubmit().click();
        pageModel.getProfileImage().click();
        pageModel.getUserNickName().shouldBe(Condition.visible);
    }
}

