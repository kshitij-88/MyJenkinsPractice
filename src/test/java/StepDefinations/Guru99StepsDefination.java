package StepDefinations;

import java.io.IOException;

import BaseLayer.BaseClass;
import PageLayer.RegistrationPage;
import UtilityLayer.ExcleReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Guru99StepsDefination extends BaseClass {
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
		BaseClass.initlialization("chrome");
	}

	@Then("user register new user by reading test data from {string} and {int}")
	public void user_register_new_user_by_reading_test_data_from_and(String sheetName, Integer RowNumber)
			throws IOException, InterruptedException {
		RegistrationPage page = new RegistrationPage();
		String path = System.getProperty("user.dir") + "//src//main//resources//TestData//Guru99.xlsx";
		ExcleReader reader = new ExcleReader(path, sheetName);

		String Fname = reader.readExcelData().get(RowNumber).get("Fname").toString();
		String Lname = reader.readExcelData().get(RowNumber).get("Lname").toString();
		String Phone = reader.readExcelData().get(RowNumber).get("Phone").toString();
		String Email = reader.readExcelData().get(RowNumber).get("Email").toString();
		String Address = reader.readExcelData().get(RowNumber).get("Address").toString();
		String City = reader.readExcelData().get(RowNumber).get("City").toString();
		String State = reader.readExcelData().get(RowNumber).get("State").toString();
		String Pincode = reader.readExcelData().get(RowNumber).get("Pincode").toString();
		String Country = reader.readExcelData().get(RowNumber).get("Country").toString();
		String Username = reader.readExcelData().get(RowNumber).get("Username").toString();
		String Password = reader.readExcelData().get(RowNumber).get("Password").toString();
		String ConfirmPass = reader.readExcelData().get(RowNumber).get("ConfirmPass").toString();

		page.registrationFunctonality(Fname, Lname, Pincode, Email, Address, City, State, State, Country, Username,
				Password, ConfirmPass);

		Thread.sleep(4000);

	}

	@Then("click on submit button")
	public void click_on_submit_button() {
		RegistrationPage page = new RegistrationPage();
		page.clickOnSubmitButton();
	}
}
