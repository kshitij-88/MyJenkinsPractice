package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class WaitHelper extends BaseClass {

	public static WebElement visibilityOfElement(WebElement wb) {
		return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(wb));
	}
	
	public static List<WebElement> visibilityOfAllElement(List<WebElement> list) {
		return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).
				until(ExpectedConditions.visibilityOfAllElements(list));
	}
	
	public static WebElement elementClickable(WebElement wb) {
		return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(wb));
	}
	
	public static Alert AlertToBePresent() {
		return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.alertIsPresent());
	}
}
