package GradleSelenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageObjectModel {

    private SelenideElement ProfileButton = $(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div"));
    private SelenideElement EnterButton = $(By.className("tm-user-menu__auth-button"));
    private SelenideElement EmailForm = $(By.id("email_field"));
    private SelenideElement PasswordForm = $(By.id("password_field"));
    private SelenideElement SubmitButton = $(By.name("go"));
    private SelenideElement ProfileImage = $(By.className("tm-entity-image"));
    private SelenideElement UserNickName = $(By.className("tm-user-item__username"));

    public SelenideElement getProfileButton(){
        return ProfileButton;
    }

    public SelenideElement getEnterButton(){
        return EnterButton;
    }

    public SelenideElement getEmail(){
        return EmailForm;
    }


    public SelenideElement getPassword(){
        return PasswordForm;
    }

    public SelenideElement pressSubmit(){
        return SubmitButton;
    }

    public SelenideElement getProfileImage(){
        return ProfileImage;
    }

    public SelenideElement getUserNickName(){
        return UserNickName;
    }

}


