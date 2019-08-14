package com.pageobjects;

import com.core.UserActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class LoginPage extends UserActions {
    @FindBy(id = "com.androidsample.generalstore:id/nameField")
    private WebElement name;

    @FindBy(xpath = "//*[@text ='Female']")
    private WebElement gender;

    @FindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    private  WebElement country;

    public void Login() {
        try {
            gender.click();


        } catch (Exception e) {
        }

    }


}
