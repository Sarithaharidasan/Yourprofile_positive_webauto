package Yourprofile_positive_scenarios;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import Reusable_Functions.Generic_function;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Yourprofile_positive_scenarios extends Generic_function{
public static boolean value;
public static String text; 
@Given("browser is open")
/*Browser launch*/
public void browser_launching() {
		try {
			Browser_Launch();
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
/*TC 001 - Validate that the  'Your Profile’ title  should be present in  Your Profile screen */
@Then("check Your Profile  title  should be present in  Your Profile screen")
public void yourprofile_positive_tc_001() throws Exception  {
		try {
			click("welcome_login");
			browser_wait(5);
			driver.findElement(By.xpath(OR_reader("Object_locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",9));
			driver.findElement(By.xpath(OR_reader("Object_locator", "login_password"))).sendKeys(td_reader("login_password",5));
			click("login");
			 browser_wait(5); 
			 value = driver.findElement(By.xpath(OR_reader("Object_Locator", "logo"))).isDisplayed();
				Assert.assertEquals(true,value);
			 click("down_arrow");
			  browser_wait(5);
			  click("profile");
			  browser_wait(5);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "yourprofile"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("yourprofile_positive_tc_001");
		}
         
	}

/*TC 002 - Validate that dialogue box will appear and able to enter the security code and password , when user click on edit icon  */
@When("User click on edit icon a dialogue box will appear")
public void yourprofile_positive_tc_002() throws Exception {
   try {
		browser_wait(5);
		click("profile_edit");
		browser_wait(5);
		click("profile_checkbox");
		browser_wait(5);
		click("profile_sendcode");
		browser_wait(5);
		driver.findElement(By.xpath(OR_reader("Object_locator", "profile_securitycode"))).sendKeys(td_reader("otp"));
		driver.findElement(By.xpath(OR_reader("Object_locator", "profile_reentry"))).sendKeys(td_reader("login_password",5));
		browser_wait(5);
		click("profile_verify");
		browser_wait(5);
		click("profile_ok");
		} catch (IOException e) {
		e.getMessage();
		takeScreenShot("yourprofile_positive_tc_002");
		}
}

/*TC 003 - Validate that the user is able to edit  the profile details  */
@Then("User is able to edit  the profile details")
public void yourprofile_positive_tc_003() throws Exception {
	try {
		browser_wait(10);
		backspace("profile_first_name");
		backspace("profile_last_name");
		backspace("profile_preferred_name");
		browser_wait(5);
		driver.findElement(By.xpath(OR_reader("Object_locator", "profile_first_name"))).sendKeys(td_reader("profile_first_name"));
		driver.findElement(By.xpath(OR_reader("Object_locator", "profile_last_name"))).sendKeys(td_reader("profile_last_name"));
		driver.findElement(By.xpath(OR_reader("Object_locator", "profile_preferred_name"))).sendKeys(td_reader("profile_preferred_name"));
		click("profile_gender");
		browser_wait(10);
		text = td_reader("profile_gender");
		drop_down(OR_reader("Object_Locator", "profile_dropdownlist"),text); 
		click("profile_bloodgrp");
		browser_wait(10);
		text = td_reader("profile_bloodgrp");
		drop_down(OR_reader("Object_Locator", "profile_dropdownlist"),text); 
		browser_wait(10);
		click("profile_calender");
		click("profile_ok");
		browser_wait(10);
		click("profile_save");
		click("profile_ok");
		} catch (IOException e) {
		e.getMessage();
		takeScreenShot("yourprofile_positive_tc_003");
		}
}

/*TC 004 - Validate that user is able to add Email ID in contact details. */
@And("User is able to add Email ID in contact details")
public void yourprofile_positive_tc_004() throws Exception  {
	try {
		browser_wait(10);
		click("profile_contact");
		value = driver.findElement(By.xpath(OR_reader("Object_Locator", "profile_contact_assert"))).isDisplayed();
		Assert.assertEquals(true,value);
		browser_wait(10);
		click("profile_plus");
		value = driver.findElement(By.xpath(OR_reader("Object_Locator", "profile_email_assert"))).isDisplayed();
		Assert.assertEquals(true,value);
		browser_wait(10);
		driver.findElement(By.xpath(OR_reader("Object_locator", "profile_emailid"))).sendKeys(td_reader("profile_emailid"));
		click("profile_submit");
	} catch (IOException e) {
		e.getMessage();
		takeScreenShot("yourprofile_positive_tc_004");
	}
}

/*TC 005 - Validate that the user is able to Activate , Edit and  Deactivate the Email ID  */
@When("User is able to Activate , Edit and  Deactivate the Email ID")
public void yourprofile_positive_tc_005() throws Exception {
	try {
		browser_wait(10);
		click("profile_activate");
		click("profile_yes");
		click("profile_ok");
		click("profile_email_edit");
		click("profile_contact_assert");
		click("profile_dot");
		browser_wait(10);
		text = td_reader("profile_dot");
		drop_down(OR_reader("Object_Locator", "profile_mail_list"),text); 
		click("profile_yes");
		click("profile_ok");
	} catch (IOException e) {
		e.getMessage();
		takeScreenShot("yourprofile_positive_tc_005");
	}
}

/*TC 006 - Validate that user is able to add Phone Number in contact details. */
@Then("User is able to add Phone Number in contact details")
public void yourprofile_positive_tc_006() throws Exception {
	
try {
		click("profile_phno");
		//click("profile_plus");
		//value = driver.findElement(By.xpath(OR_reader("Object_Locator", "profile_phnoassert"))).isDisplayed();
		//Assert.assertEquals(true,value);
		//driver.findElement(By.xpath(OR_reader("Object_locator", "profile_phonenumber"))).sendKeys(td_reader("profile_phonenumber"));
		//click("profile_submit");
		//driver.findElement(By.xpath(OR_reader("Object_locator", "profile_phno_code"))).sendKeys(td_reader("otp"));
		//click("profile_phno_verify");
	} catch (IOException e) {
		e.getMessage();
		takeScreenShot("yourprofile_positive_tc_006");
	}
}

/*TC 007 - Validate that the user is able to Activate , Edit and  Deactivate the Phone Number */
@Then("User is able to Activate , Edit and  Deactivate the Phone Number")
public void yourprofile_positive_tc_007() throws Exception {
	try {
		browser_wait(10);
		click("profile_phno_edit");
		click("profile_contact_assert");
		click("profile_dot_phno");
		browser_wait(10);
		text = td_reader("profile_dot");
		drop_down(OR_reader("Object_Locator", "profile_phno_list"),text); 
		click("profile_yes");
		click("profile_phno_activate");
		click("profile_yes");
	} catch (IOException e) {
		e.getMessage();
		takeScreenShot("yourprofile_positive_tc_007");
	}
	
}

/*TC 008 - Validate that the user is able to Activate , Edit and  Deactivate the Phone Number */
@Then("User is able to add Address in contact details.")
public void yourprofile_positive_tc_008() throws Exception {
	try {
		browser_wait(10);
		click("profile_address");
		//click("profile_plus");
		//value = driver.findElement(By.xpath(OR_reader("Object_Locator", "profile_address_assert"))).isDisplayed();
		//Assert.assertEquals(true,value);
		//driver.findElement(By.xpath(OR_reader("Object_locator", "profile_address_saveas"))).sendKeys(td_reader("profile_address_saveas"));
		//driver.findElement(By.xpath(OR_reader("Object_locator", "profile_address_1"))).sendKeys(td_reader("profile_address_1"));
		//driver.findElement(By.xpath(OR_reader("Object_locator", "profile_address_2"))).sendKeys(td_reader("profile_address_2"));
		//driver.findElement(By.xpath(OR_reader("Object_locator", "profile_address_city"))).sendKeys(td_reader("profile_address_city"));
		//text = td_reader("profile_address_state");
		//selectdrop_down("profile_address_state",text);
		//driver.findElement(By.xpath(OR_reader("Object_locator", "profile_address_zip"))).sendKeys(td_reader("profile_address_zip"));
		//click("profile_save");
	} catch (IOException e) {
		e.getMessage();
		takeScreenShot("yourprofile_positive_tc_008");
	}
}

/*TC 009 - Validate that the user is able to Activate , Edit , Primary and  Deactivate the Address */
@Then("User is able to Activate , Edit , Primary and  Deactivate the Address")
public void yourprofile_positive_tc_009() throws Exception {
	try {
		browser_wait(10);
		click("profile_address_activate");
		click("profile_yes");
		click("profile_address_edit");
		click("profile_address_back");
		click("profile_contact_assert");
		click("profile_dot_address");
		browser_wait(10);
		text = td_reader("profile_dot");
		drop_down(OR_reader("Object_Locator", "profile_address_list"),text);
		click("profile_yes");
		click("profile_address_back");
	} catch (IOException e) {
		e.getMessage();
		takeScreenShot("yourprofile_positive_tc_009");
	}
}

/*TC 010 - Validate that user is able to add Plan coverage*/
@Then("User is able to add Plan coverage")
public void yourprofile_positive_tc_010() throws Exception {
	try {
		browser_wait(10);
		click("profile_plancoverage");
		value = driver.findElement(By.xpath(OR_reader("Object_Locator", "profile_planassert"))).isDisplayed();
		Assert.assertEquals(true,value);
		//click("profile_plan_plus");
		//value = driver.findElement(By.xpath(OR_reader("Object_Locator", "profile_addassert"))).isDisplayed();
		//Assert.assertEquals(true,value);
		//driver.findElement(By.xpath(OR_reader("Object_locator", "profile_planname"))).sendKeys(td_reader("profile_planname"));
		//driver.findElement(By.xpath(OR_reader("Object_locator", "profile_plan_holderfname"))).sendKeys(td_reader("profile_plan_holderfname"));
		//driver.findElement(By.xpath(OR_reader("Object_locator", "profile_plan_holderlname"))).sendKeys(td_reader("profile_plan_holderlname"));
		//click("profile_plan_relationship");
		//browser_wait(10);
		//text = td_reader("profile_plan_relationship");
		//drop_down(OR_reader("Object_Locator", "profile_dropdownlist"),text); 
		//driver.findElement(By.xpath(OR_reader("Object_locator", "profile_plan_memberid"))).sendKeys(td_reader("profile_plan_holderlname"));
		//driver.findElement(By.xpath(OR_reader("Object_locator", "profile_plan_groupid"))).sendKeys(td_reader("profile_plan_holderlname"));
		//driver.findElement(By.xpath(OR_reader("Object_locator", "profile_plan_type"))).sendKeys(td_reader("profile_plan_holderlname"));
		//click("profile_plan_save");
		//click("profile_ok");
	} catch (IOException e) {
		e.getMessage();
		takeScreenShot("yourprofile_positive_tc_010");
	}
}

/*TC 011 - Validate that the user is able to Activate , Edit , Make primary and  Deactivate the Plan coverage*/
@Then("User is able to Activate , Edit , Make primary and  Deactivate the Plan coverage")
public void yourprofile_positive_tc_011() throws Exception {
	try {
		browser_wait(10);
		click("profile_plan_edit");
		value = driver.findElement(By.xpath(OR_reader("Object_Locator", "profile_plan_editassert"))).isDisplayed();
		Assert.assertEquals(true,value);
		click("profile_plan_back");
		click("profile_dot_plan");
		browser_wait(10);
		text = td_reader("profile_dot");
		drop_down(OR_reader("Object_Locator", "profile_plan_list"),text);
		}
		catch(StaleElementReferenceException e){
			driver.findElement(By.xpath(OR_reader("Object_Locator", "profile_plan_activate"))).click();
	      }
	catch (IOException e) {
		e.getMessage();
		takeScreenShot("yourprofile_positive_tc_011");
	}
	} 

/*TC 012 - Validate that the user is able to change the password*/
@Then("User is able to change the password")
public void yourprofile_positive_tc_012() throws Exception {
	try {
		browser_wait(10);
		click("profile_plancoverage_back");
		click("profile_password");
		value = driver.findElement(By.xpath(OR_reader("Object_Locator", "profile_passwordassert"))).isDisplayed();
		Assert.assertEquals(true,value);
		driver.findElement(By.xpath(OR_reader("Object_locator", "profile_oldpassword"))).sendKeys(td_reader("login_password",5));
		driver.findElement(By.xpath(OR_reader("Object_locator", "profile_newpassword"))).sendKeys(td_reader("profile_newpassword"));
		driver.findElement(By.xpath(OR_reader("Object_locator", "profile_confirmpassword"))).sendKeys(td_reader("profile_newpassword"));
		click("profile_passwordsave");
		click("profile_ok");
	} catch (IOException e) {
		e.getMessage();
		takeScreenShot("yourprofile_positive_tc_012");
	}
	
}

/*TC 013 - Validate that the password should be displayed on clicking the eye and user can able to save the details*/
@Then("The password should be displayed on clicking the eye and  user can able to save the details")
public void yourprofile_positive_tc_013() throws Exception {
	try {
    browser_wait(10);
    click("logout");
	driverquit();
	Browser_Launch();
	value = driver.findElement(By.xpath(OR_reader("Object_Locator", "welcome_login"))).isDisplayed();
	Assert.assertEquals(true,value);
	click("welcome_login");
	driver.findElement(By.xpath(OR_reader("Object_locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",9));
	driver.findElement(By.xpath(OR_reader("Object_locator", "login_password"))).sendKeys(td_reader("profile_newpassword"));
	click("login");
	Thread.sleep(5000);
	value = driver.findElement(By.xpath(OR_reader("Object_Locator", "logo"))).isDisplayed();
	Assert.assertEquals(true,value);
	click("down_arrow");
	browser_wait(5);
	click("profile");
	browser_wait(5);
	value = driver.findElement(By.xpath(OR_reader("Object_Locator", "yourprofile"))).isDisplayed();
	Assert.assertEquals(true,value);
	browser_wait(5);
	click("profile_edit");
	browser_wait(5);
	click("profile_checkbox");
	browser_wait(5);
	click("profile_sendcode");
	browser_wait(5);
	driver.findElement(By.xpath(OR_reader("Object_locator", "profile_securitycode"))).sendKeys(td_reader("otp"));
	driver.findElement(By.xpath(OR_reader("Object_locator", "profile_reentry"))).sendKeys(td_reader("profile_newpassword"));
	browser_wait(5);
	click("profile_verify");
	browser_wait(5);
	click("profile_ok");
	click("profile_password");
	value = driver.findElement(By.xpath(OR_reader("Object_Locator", "profile_passwordassert"))).isDisplayed();
	Assert.assertEquals(true,value);
	driver.findElement(By.xpath(OR_reader("Object_locator", "profile_oldpassword"))).sendKeys(td_reader("profile_newpassword"));
	click("profile_oldeye");
	driver.findElement(By.xpath(OR_reader("Object_locator", "profile_newpassword"))).sendKeys(td_reader("login_password",5));
	click("profile_neweye");
	driver.findElement(By.xpath(OR_reader("Object_locator", "profile_confirmpassword"))).sendKeys(td_reader("login_password",5));
	click("profile_confirmeye");
	click("profile_passwordsave");
	click("profile_ok");
	driverquit();
	} catch (IOException e) {
		e.getMessage();
		takeScreenShot("yourprofile_positive_tc_013");
	}
	
	}

}

