package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.DropDownHelper;
import UtilityLayer.WebElementHelper;

public class RegistrationPage extends BaseClass {
	@FindBy(name = "firstName")
	private WebElement firstName;

	@FindBy(name = "lastName")
	private WebElement lastName;

	@FindBy(name = "phone")
	private WebElement phone;

	@FindBy(name = "userName")
	private WebElement email;

	@FindBy(name = "address1")
	private WebElement address;

	@FindBy(name = "city")
	private WebElement city;

	@FindBy(name = "state")
	private WebElement state;

	@FindBy(name = "postalCode")
	private WebElement postalCode;

	@FindBy(name = "country")
	private WebElement country;

	@FindBy(name = "email")
	private WebElement userName;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "confirmPassword")
	private WebElement confirmPassword;

	@FindBy(name = "submit")
	private WebElement submitButton;
	
	@FindBy(xpath="//a[text()='REGISTER']")
	private WebElement registerLink;

	public RegistrationPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void registrationFunctonality(String fn, String ln, String mb, String email, String address, String city,
			String state, String postalCode, String country, String userName, String password, String confirmPassword) {

		WebElementHelper.sendKeys(this.firstName, fn);
		WebElementHelper.sendKeys(this.lastName, ln);
		WebElementHelper.sendKeys(this.phone, mb);
		WebElementHelper.sendKeys(this.email, email);
		WebElementHelper.sendKeys(this.address, address);
		WebElementHelper.sendKeys(this.city, city);
		WebElementHelper.sendKeys(this.state, state);
		WebElementHelper.sendKeys(this.postalCode, postalCode);
		DropDownHelper.handleDropDwon(this.country, country);
		WebElementHelper.sendKeys(this.userName, userName);
		WebElementHelper.sendKeys(this.password, password);
		WebElementHelper.sendKeys(this.confirmPassword, confirmPassword);

	}

	public void clickOnSubmitButton() {
		WebElementHelper.click(this.submitButton);
		WebElementHelper.click(this.registerLink);
	}

}
