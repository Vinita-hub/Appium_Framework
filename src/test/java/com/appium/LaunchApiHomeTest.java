package com.appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LaunchApiHomeTest {
	public AndroidDriver driver=null;
	public DesiredCapabilities cap=null;
	@Test
	public void launchApiHome()
	{
		try
		{
			cap.setCapability("automatiomName", "Appium");
			cap.setCapability("platformVersion", "5.1");
			cap.setCapability("platformName", "Android");
			cap.setCapability("UDID", "");
			cap.setCapability("appPakage", "");
			cap.setCapability("appActivity", "");
			driver = new AndroidDriver(new URL("http:000.0.0:4723/wd/hub"),cap);
		}
		catch (Exception e) {
			
		}
	}

}
