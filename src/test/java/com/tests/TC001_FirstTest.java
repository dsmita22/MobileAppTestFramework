package com.tests;

import com.core.UserActions;
import com.pageobjects.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC001_FirstTest  extends UserActions {

    @Test
    public void TestLogin(){
        String tName ="TC001_FirstTest";
        LoginPage loginPage = new LoginPage();


        try {
            loginPage.Login();

        } catch (Exception e) {

        }

    }
}
