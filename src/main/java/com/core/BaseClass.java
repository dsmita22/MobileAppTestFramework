package com.core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public AndroidDriver<AndroidElement> driver;
    public DesiredCapabilities cap = new DesiredCapabilities();


    @BeforeClass
    public void init() throws MalformedURLException {

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), mobileCapabilities(cap));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    private DesiredCapabilities mobileCapabilities(DesiredCapabilities capabilities) {
        File f = new File("input/app/");
        File fs = new File(f, "General-Store.apk");

        capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Access.emulator);
        capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, "true");
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, "true");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, "false");
        return capabilities;
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
