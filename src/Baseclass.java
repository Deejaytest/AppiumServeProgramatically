import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Baseclass extends AppiumServerStartStop{
	
	public static AndroidDriver driver ;
	public static AndroidDriver capabilities()  throws Exception  {
		appiumStart();
		File f= new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");

		DesiredCapabilities Cap = new DesiredCapabilities();
		Cap.setCapability(MobileCapabilityType.PLATFORM, MobilePlatform.ANDROID);
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G4");
		Cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		 driver= new AndroidDriver(new URL(service_url),Cap);


		//AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),Cap);
		return driver;
	}

}
