package UtilityLayer;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import BaseLayer.BaseClass;

public class FluentWaitHelper extends BaseClass {

	public static WebElement visibilityOfElement(WebElement wb) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(getDriver())
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);
		return wait.until(new Function<WebDriver,WebElement>(){

			@Override
			public WebElement apply(WebDriver t) {
		
				return wb;
			}
			
		});
	}
}
