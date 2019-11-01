package com.cap.person.educationaldetail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cap.person.pageobject.Page_Object_Education;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defination_Education {
	private WebDriver driver;
	private Page_Object_Education PageObjEdu;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aggeorge\\Desktop\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void endUp() {
		driver.quit();
	}

	@Given("^user is on Educational Details page$")
	public void user_is_on_Educational_Details_page() throws Throwable {
		driver.get(
				"C:\\Users\\aggeorge\\Desktop\\SET B(Agnes Libisha-189772)\\WebPages Set B\\EducationalDetails.html");
		PageObjEdu = new Page_Object_Education(driver);
	}

	@Then("^check Whether the title matches or not$")
	public void check_Whether_the_title_matches_or_not() throws Throwable {
		String title = driver.getTitle();
		Assert.assertEquals("Educational Details", title);

		if (title.equals("Educational Details")) {
			System.out.println("Title Matches");
		} else {
			System.out.println("Text is not found on page");
		}
	}

	@When("^user enters invalid Graduation$")
	public void user_enters_invalid_Graduation() throws Throwable {
		PageObjEdu.setGraduation("");
		PageObjEdu.setBtnRegister();
	}

	@Then("^displays 'Please Select Graduation'$")
	public void displays_Please_Select_Graduation() throws Throwable {
		String expectedMessage = "Please Select Graduation";
		String actualMessage = driver.switchTo().alert().getText();
		// Thread.sleep(5000);
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid Percentage$")
	public void user_enters_invalid_Percentage() throws Throwable {
		PageObjEdu.setGraduation("BTech");
		PageObjEdu.setPercentage("");
		PageObjEdu.setBtnRegister();
	}

	@Then("^displays 'Please fill Percentage detail'$")
	public void displays_Please_fill_Percentage_detail() throws Throwable {
		String expectedMessage = "Please fill Percentage detail";
		String actualMessage = driver.switchTo().alert().getText();
		// Thread.sleep(5000);
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid Passing Year$")
	public void user_enters_invalid_Passing_Year() throws Throwable {
		PageObjEdu.setGraduation("BTech");
		PageObjEdu.setPercentage("80%");
		PageObjEdu.setPassingYear("");
		PageObjEdu.setBtnRegister();
	}

	@Then("^displays 'Please fill Passing Year'$")
	public void displays_Please_fill_Passing_Year() throws Throwable {
		String expectedMessage = "Please fill Passing Year";
		String actualMessage = driver.switchTo().alert().getText();
		// Thread.sleep(5000);
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid Project Name$")
	public void user_enters_invalid_Project_Name() throws Throwable {
		PageObjEdu.setGraduation("BTech");
		PageObjEdu.setPercentage("80%");
		PageObjEdu.setPassingYear("2016");
		PageObjEdu.setProjectName("");
		PageObjEdu.setBtnRegister();
	}

	@Then("^displays 'Please fill Project Name'$")
	public void displays_Please_fill_Project_Name() throws Throwable {
		String expectedMessage = "Please fill Project Name";
		String actualMessage = driver.switchTo().alert().getText();
		// Thread.sleep(5000);
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters Techonologies used$")
	public void user_enters_Techonologies_used() throws Throwable {
		PageObjEdu.setGraduation("BTech");
		PageObjEdu.setPercentage("80%");
		PageObjEdu.setPassingYear("2016");
		PageObjEdu.setProjectName("Java");

		PageObjEdu.setBtnRegister();
	}

	@Then("^displays 'Please select Techonologies Used'$")
	public void displays_Please_select_Techonologies_Used() throws Throwable {
		String expectedMessage = "Please Select Technologies Used";
		String actualMessage = driver.switchTo().alert().getText();
		// Thread.sleep(5000);
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters other Techonologies used$")
	public void user_enters_other_Techonologies_used() throws Throwable {
		PageObjEdu.setGraduation("BTech");
		PageObjEdu.setPercentage("80%");
		PageObjEdu.setPassingYear("2016");
		PageObjEdu.setProjectName("Java");
		PageObjEdu.setTechonologies();
		PageObjEdu.setOtherTechonologies("");
		PageObjEdu.setBtnRegister();
	}

	@Then("^displays 'Please fill other Techonologies Used'$")
	public void displays_Please_fill_other_Techonologies_Used() throws Throwable {
		String expectedMessage = "Please fill other Technologies Used";
		String actualMessage = driver.switchTo().alert().getText();
		//Thread.sleep(5000);
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters valid details$")
	public void user_enters_valid_details() throws Throwable {
		PageObjEdu.setGraduation("BTech");
		PageObjEdu.setPercentage("80%");
		PageObjEdu.setPassingYear("2016");
		PageObjEdu.setProjectName("Java");
		PageObjEdu.setTechonologies1();
		PageObjEdu.setBtnRegister();
	}

	@Then("^displays Your Registration Has successfully done$")
	public void displays_Your_Registration_Has_successfully_done() throws Throwable {
		String expectedMessage = "Your Registration Has succesfully done Plz check you registerd email for account activation link !!!";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		// driver.close();
	}

}
