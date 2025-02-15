package UtilityLayer;

import org.openqa.selenium.WebElement;

public class WebElementHelper {

	public static void click(WebElement wb) {
		WaitHelper.visibilityOfElement(FluentWaitHelper.visibilityOfElement(wb)).click();
	}

	public static void sendKeys(WebElement wb, String value) {
		WaitHelper.visibilityOfElement(FluentWaitHelper.visibilityOfElement(wb)).sendKeys(value);
	}
}
