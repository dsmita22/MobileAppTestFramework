package com.core;

import io.appium.java_client.MobileElement;

public class UserActions extends BaseClass {

    private String getText(MobileElement element) {
        return element.getText();
    }

    private void click(MobileElement element) {
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
