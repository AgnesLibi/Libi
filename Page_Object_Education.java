package com.cap.person.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Education {
WebDriver driver;
	
	@FindBy(name="graduation")
	@CacheLookup
	WebElement graduation;

	@FindBy(name="percentage")
	@CacheLookup
	WebElement percentage;
	
	@FindBy(name="passingYear")
	@CacheLookup
	WebElement passingYear;
	
	@FindBy(name="projectName")
	@CacheLookup
	WebElement projectName;

	@FindBy(xpath="//input[@value=\"Other\"]")
	@CacheLookup
	WebElement techonologies;
	
	@FindBy(xpath="//input[@value=\"Java\"]")
	@CacheLookup
	WebElement techonologies1;
	
	@FindBy(name="otherTechnologies")
	@CacheLookup
	WebElement otherTechonologies;
	
	@FindBy(id="btnRegister")
	@CacheLookup
	WebElement btnRegister;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation.sendKeys(graduation);
	}

	public WebElement getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage.sendKeys(percentage);
	}

	public WebElement getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(String passingYear) {
		this.passingYear.sendKeys(passingYear);
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName.sendKeys(projectName);
	}

	public WebElement getTechonologies() {
		return techonologies;
	}

	public void setTechonologies() {
		this.techonologies.click();
	}

	public WebElement getOtherTechonologies() {
		return otherTechonologies;
	}

	public void setOtherTechonologies(String otherTechonologies) {
		this.otherTechonologies.sendKeys(otherTechonologies);
	}
	

	public WebElement getTechonologies1() {
		return techonologies1;
	}

	public void setTechonologies1() {
		this.techonologies1.click();
	}

	public WebElement getBtnRegister() {
		return btnRegister;
	}

	public void setBtnRegister() {
		this.btnRegister.click();
	}

	public Page_Object_Education(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
