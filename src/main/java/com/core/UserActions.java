package com.core;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;

public class UserActions extends BaseClass {

    private String getText(MobileElement element) {
        return element.getText();
    }

    public void click(WebElement element) {
        element.click();
    }

    private void enter(MobileElement element, String value) {
        element.setValue(value);
    }
    private void scrollToText(String text)
    {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");
    }


}
