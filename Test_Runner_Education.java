package com.cap.person.educationaldetail;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\aggeorge\\Desktop\\NewWorkSpace\\PersonDetails\\src\\test\\resource\\features\\education.feature"},
		glue={"com.cap.person.educationaldetail"},
		dryRun=false,
		strict=true,
		monochrome=true,
		format = {"pretty", "html:test-output"})
public class Test_Runner_Education {

}
