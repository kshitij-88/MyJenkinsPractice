package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper {

	public static void handleDropDwon(WebElement dropDown,String text) {
		Select select=new Select(dropDown);
		select.selectByVisibleText(text);
	}
}
