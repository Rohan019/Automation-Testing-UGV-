package Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hook.Hook;

public class Evaluationdefinition {
	WebDriver driver = Hook.driver;
	@Given("User is on Uniform Application")
	public void user_is_on_Uniform_Application() {
		String title = driver.getTitle();
		System.out.println(title);
	   
	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		try
		{
			driver.findElement(By.id("input-username")).sendKeys("admin");
			driver.findElement(By.id("input-password")).sendKeys("admin@123");
		}
		catch(Exception e)
		{
			System.out.println("Not Able to enter the login details "+e);
		}
	    
	}

	@When("click on Login button")
	public void click_on_Login_button() {
		try
		{
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}
		catch(Exception e) {
			System.out.println("Not able to click on login button"+e);
		}
	}

	@Then("User navigate to the Dashboard")
	public void user_navigate_to_the_Dashboard() {
		try
		{
			Thread.sleep(3000);
			String expectedtitle = "Dashboard";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
			System.out.println("You are able  to navigate to the welcome page");
			
		}
		catch(Exception e)
		{
			System.out.println("Not able to navigate to the welcome page"+e);
			Assert.fail();
		}
	}
	
	
	
	
	
	@Given("User click on shopping icon")
	public void user_click_on_shopping_icon() {
	    try {
	    	driver.findElement(By.xpath("//*[@id=\"sale\"]/a/i")).click();
	    	System.out.println("User is able to select gift voucher ");
			
	    }
	    catch(Exception e) {
	    	System.out.println("User is unable to select gift voucher ");
	    	
	    }
	}

	@Then("User click on Gift Voucher option")
	public void user_click_on_Gift_Voucher_option() {
	   try {
		   driver.findElement(By.xpath("//*[@id=\"sale\"]/ul/li[4]/a")).click();
		   System.out.println("user is able to go in Gift Vouchr option");
	   }
	   catch(Exception e) {
		   System.out.println("user is unable to go in Gift Voucher option");
	   }
	}

	@Then("User select gift voucher")
	public void user_select_gift_voucher() {
	    
		try {
			 driver.findElement(By.xpath("//*[@id=\"sale\"]/ul/li[4]/ul/li[1]/a")).click();
			 System.out.println("user is able to select gift voucher option ");
		}
		catch(Exception e)
		{
			System.out.println("user is unable to select gift voucher option");
		}
	}

	@Then("User will navigate to Gift Voucher option")
	public void user_will_navigate_to_Gift_Voucher_option() {
		try
		{
			Thread.sleep(3000);
			String expectedtitle = "Gift Vouchers";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
			System.out.println("You are able  to navigate to the welcome page");
			
		}
		catch(Exception e)
		{
			System.out.println("Not able to navigate to the welcome page"+e);
			Assert.fail();
		}
	    
	}
	
	
	
	

@Given("User click on Add symbol")
public void user_click_on_Add_symbol() {
  try {
	  
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a/i")).click();
		System.out.println("user is able to click on Add symbol");
  }
  catch(Exception e) {
	  System.out.println("User is unable to click on Add symbol");
  }
}

@When("User enter {string},{string},{string},{string},{string},{string},{string},{string}")
public void user_enter(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
    // Write code here that turns the phrase above into concrete actions
   try {
	   
	   driver.findElement(By.xpath("//*[@id=\"input-code\"]")).sendKeys(string);
	   Thread.sleep(2000);
	   System.out.println("able to enter code ");
	   
	   driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys(string2);
	   Thread.sleep(2000);
	   System.out.println("able to enter from name ");
	   
	   driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys(string3);
	   Thread.sleep(2000);
	   System.out.println("able to enter from email");
	   
	   
	   driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys(string4);
	   Thread.sleep(2000);
	   System.out.println("able to enter to name ");
	   
	   driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys(string5);
	   Thread.sleep(2000);
	   System.out.println("able to enter to email");
	
	   WebElement ddown = driver.findElement(By.xpath("//*[@id=\"input-theme\"]"));
	   Select select = new Select(ddown);
	   
	   select.selectByValue("13");
		System.out.println("Diwali is selected");

		driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys(string7);
		Thread.sleep(2000);
		System.out.println("Able to erite message ");
		
		driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys(string8);
		Thread.sleep(2000);
		System.out.println("Able to enter amount ");
		


	
	   
	   
	   
   }
   catch(Exception e)
   {
	   System.out.println("not able to select  drop down");
	   
   }
}

@Then("User will save the details")
public void user_will_save_the_details() {
    try
    {
    	
    	driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button")).click();
    	System.out.println("user is able to save details of gift voucher ");
    	
    }
    catch(Exception e)
    {
    	
    	System.out.println("user is unable to save to details of Gift Voucher");
    }
   
}

@Then("User will go to Gift voucher dashboard")
public void user_will_go_to_Gift_voucher_dashboard() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
		Thread.sleep(3000);
		String expectedtitle = "Gift Vouchers";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle,actualtitle);
		System.out.println("You are able  to navigate to the welcome page");
		
	}
	catch(Exception e)
	{
		System.out.println("Not able to navigate to the welcome page"+e);
		Assert.fail();
	}
}





@Then("User will select the check box coupn")
public void user_will_select_the_check_box_coupn() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div/table/tbody/tr[1]/td[1]/input")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div/table/tbody/tr[2]/td[1]/input")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div/table/tbody/tr[3]/td[1]/input")).click();
		 Thread.sleep(2000);
		 
		 System.out.println("Able to click on checkbox");
		 
		
	}
	
	catch(Exception e)
	{
		System.out.println("User is unable to select checkbox button");
		
	}
}

@Then("User will send Gift Voucher")
public void user_will_send_Gift_Voucher() {
    // Write code here that turns the phrase above into concrete actions
	try
    {
    
    	driver.findElement(By.xpath("//*[@id=\"button-send\"]")).click();
    	System.out.println("User is able to send ");
    }
    
    catch(Exception e)
    {
    	
    	System.out.println("User is unable to send ");
    }
}




@Then("User click on Edit button")
public void user_click_on_Edit_button() {
    // Write code here that turns the phrase above into concrete actions
    try
    {
    	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div/table/tbody/tr[1]/td[9]/a")).click();
    	System.out.println("able to click on edit button ");
    }
    
    catch(Exception e)
    {
    	System.out.println("unable to click edit button");
    	
    }
}







@When("user click on Uniform Admin button")
public void user_click_on_Uniform_Admin_button() {
    // Write code here that turns the phrase above into concrete actions
	 try
	    {  Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@id=\"button-menu\"]")).click();
	    	System.out.println("able to click on Admin button");
	    	
	    }
	    
	    catch(Exception e)
	    {
	    	System.out.println("unable to click Admin button");
	    	
	    }

}

@When("click on Reports")
public void click_on_Reports() {
    // Write code here that turns the phrase above into concrete actions
    try
    {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"reports\"]/a")).click();
    	System.out.println("Able to click on report option");
    }
    
    catch(Exception e)
    {
    	System.out.println("Unable to click on report option");
    }
   
    
    
}

@Then("click on Marketing option")
public void click_on_Marketing_option() {
    // Write code here that turns the phrase above into concrete actions
	   try
	    {  
		   Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@id=\"reports\"]/ul/li[4]/a")).click();
	    	System.out.println("Able to click on marketing option");
	    }
	    
	    catch(Exception e)
	    {
	    	System.out.println("Unable to click on marketing option");
	    }
}

@Then("select Marketing")
public void select_Marketing() {
    // Write code here that turns the phrase above into concrete actions
	try
    {
    	driver.findElement(By.xpath("//*[@id=\"reports\"]/ul/li[4]/ul/li[1]/a")).click();
    	System.out.println("able to select on marketing option");
    }
    
    catch(Exception e)
    {
    	System.out.println("Unable to select on marketing option");
    }
}

@Then("User will navigate to marketing report dashboard")
public void user_will_navigate_to_marketing_report_dashboard() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
		Thread.sleep(3000);
		String expectedtitle = "Marketing Report";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle,actualtitle);
		System.out.println("You are able  to navigate to the welcome page");
		
	}
	catch(Exception e)
	{
		System.out.println("Not able to navigate to the welcome page"+e);
		Assert.fail();
	}
}






@Then("User will select start date")
public void user_will_select_start_date() {
    // Write code here that turns the phrase above into concrete actions
    try
    {
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/div/span/button")).click();
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/table/tbody/tr[2]/td[3]")).click();
    	
    	System.out.println("Able to select start date");
    }
    
    catch(Exception e)
    {
    	System.out.println("Unable to select start date");
    }
}

@Then("select order status")
public void select_order_status() {
    // Write code here that turns the phrase above into concrete actions
    try
    {
    	Thread.sleep(3000);

 	   WebElement ddown = driver.findElement(By.xpath("//*[@id=\"input-status\"]"));
 	   Select select = new Select(ddown);
 	   
 	   select.selectByValue("5");
 		System.out.println("completed option is selected is selected");
    }
    
    catch(Exception e)
    {
    	System.out.println("Unable to select Drop down  order status");
    	
    }
}

@Then("User Select End date")
public void user_Select_End_date() {
    // Write code here that turns the phrase above into concrete actions
	 try
	    {
            Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div/span/button")).click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/table/tbody/tr[4]/td[4]")).click();
	    	
	    	System.out.println("Able to select end date");
	    }
	    
	    catch(Exception e)
	    {
	    	System.out.println("Unable to select end date");
	    }
}

@Then("click on Filter")
public void click_on_Filter() {
    // Write code here that turns the phrase above into concrete actions
    try
    {
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"button-filter\"]")).click();
    	System.out.println("Able to select Filter buttom");
    }
    
    catch(Exception e )
    {
    	System.out.println("Unable to select Filter button ");
    }
}





@Then("click on Voucher Theme")
public void click_on_Voucher_Theme() {
    // Write code here that turns the phrase above into concrete actions
   try
    {
	   Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"sale\"]/ul/li[4]/ul/li[2]")).click();
    	System.out.println("Able to click on voucher themes");
                                        	
    }
     
    catch(Exception e)
    {
    	System.out.println("unable to click on voucher themes");
    	
    }
    
}

@Then("user will navigate to voucher theme dashboard")
public void user_will_navigate_to_voucher_theme_dashboard() {
    // Write code here that turns the phrase above into concrete actions
	 try
	    {

			Thread.sleep(3000);
			String expectedtitle = "Voucher Themes";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
			System.out.println("You are able  to navigate to the voucher theme dashboard");
			
	    	
	    }
	     
	    catch(Exception e)
	    {
	    	System.out.println("You are Unable  to navigate to the voucher theme dashboard"+e);
			Assert.fail();
	    	
	    }
}





@Then("Select on add button")
public void select_on_add_button() {
    // Write code here that turns the phrase above into concrete actions
    try
    {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a")).click();
    	System.out.println("Able to click on add button");
    	
    }
    
    catch(Exception e)
    {
    	System.out.println("unable to click on add button");
    }
}


@Then("create voucher themes {string}")
public void create_voucher_themes(String string) {
    // Write code here that turns the phrase above into concrete actions
	 try
	    {
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@id=\"form-theme-voucher\"]/div[1]/div/div/input")).sendKeys(string);
	    	System.out.println("Able to create voucher theme");
	    	
	    }
	    
	    catch(Exception e)
	    {
	    	System.out.println("unable to create vouher themes");
	    }
}


@Then("select on image icon")
public void select_on_image_icon() {
    // Write code here that turns the phrase above into concrete actions
   try
   {
	   Thread.sleep(2000);
   	driver.findElement(By.xpath("//*[@id=\"thumb-image\"]/img")).click();
   	System.out.println("Able to select on image icon");
   	
    Thread.sleep(2000);
   	driver.findElement(By.xpath("//*[@id=\"button-image\"]")).click();
   	System.out.println("Able to select on image button");
   	
   }
   
   catch(Exception e)
   {
	   System.out.println("unable to select image icon");
	   
   }
}

@Then("select on image")
public void select_on_image() {
    // Write code here that turns the phrase above into concrete actions
	 try
	   {
		   Thread.sleep(2000);
	   	driver.findElement(By.xpath("//*[@id=\"modal-image\"]/div/div/div[2]/div[3]/div[4]/a/img")).click();
	   	System.out.println("Able to select on image ");
	   	
	   
	   }
	   
	   catch(Exception e)
	   {
		   System.out.println("unable to select image ");
		   
	   }
}

@Then("click on save button")
public void click_on_save_button() {
    // Write code here that turns the phrase above into concrete actions
    try
    {
    	Thread.sleep(2000);
	   	driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button")).click();
	   	System.out.println("Able to click on save button ");
	   	
    }
    
    catch(Exception e)
    {
    	 System.out.println("unable to click on save button  ");
    }
}







@Then("Select on edit button")
public void select_on_edit_button() {
    // Write code here that turns the phrase above into concrete actions
	 try
	    {
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@id=\"form-voucher-theme\"]/div/table/tbody/tr[2]/td[3]/a")).click();
	    	System.out.println("Able to click on edi button");
	    	
	    }
	    
	    catch(Exception e)
	    {
	    	System.out.println("unable to click on edit button");
	    }
}



@Then("select on image Icon")
public void select_on_image_Icon() {
    // Write code here that turns the phrase above into concrete actions
	 try
	   {
		   Thread.sleep(2000);
	   	driver.findElement(By.xpath("//*[@id=\"thumb-image\"]/img")).click();
	   	driver.findElement(By.xpath("//*[@id=\"button-image\"]")).click();
	   	System.out.println("Able to select on image ");
	   	
	   
	   }
	   
	   catch(Exception e)
	   {
		   System.out.println("unable to select image ");
		   
	   }
}

@Then("change image")
public void change_image() {
    // Write code here that turns the phrase above into concrete actions
	 try
	   {
		   Thread.sleep(2000);
	   	driver.findElement(By.xpath("//*[@id=\"modal-image\"]/div/div/div[2]/div[4]/div[4]/a/img")).click();
	   	System.out.println("Able to change the  image ");
	   	
	   
	   }
	   
	   catch(Exception e)
	   {
		   System.out.println("unable to change image ");
		   
	   }
}






@Then("select different pages")
public void select_different_pages() {
    // Write code here that turns the phrase above into concrete actions
	try
	   {
		   Thread.sleep(2000);
	   	driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[1]/ul/li[2]/a")).click();
	   	Thread.sleep(2000);
	   	driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[1]/ul/li[3]/a")).click();
	   	Thread.sleep(2000);
	   	System.out.println("Able to change the page  ");
	   	
	   
	   }
	   
	   catch(Exception e)
	   {
		   System.out.println("unable to change the page  ");
		   
	   }
}









@When("select on Marketing option")
public void select_on_Marketing_option() {
    // Write code here that turns the phrase above into concrete actions
    try
    {
    	driver.findElement(By.xpath("//*[@id=\"menu\"]/li[7]/a")).click();
    	System.out.println("Able to click on Marketing option");
    }
    
    catch(Exception e)
    {
    	System.out.println("unable to click on marketing option");
    	
    }
}

@When("select Mail option")
public void select_Mail_option() {
    // Write code here that turns the phrase above into concrete actions
	 try
	    {
		 Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"menu\"]/li[7]/ul/li[4]/a")).click();
	    	System.out.println("Able to click on Mail option");
	    }
	    
	    catch(Exception e)
	    {
	    	System.out.println("unable to click on Mail option");
	    	
	    }
}

@Then("user navigate to select option")
public void user_navigate_to_select_option() {
    // Write code here that turns the phrase above into concrete actions
	 try
	    {

			Thread.sleep(3000);
			String expectedtitle = "Mail";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
			System.out.println("You are able  to navigate Mail dashboard");
			
	    	
	    }
	     
	    catch(Exception e)
	    {
	    	System.out.println("You are Unable  to navigate Mail dashboard"+e);
			Assert.fail();
	    	
	    }
}

@Then("Enter {string},{string},{string},{string}")
public void enter(String string, String string2, String string3, String string4) {
    // Write code here that turns the phrase above into concrete actions
    try {
    	
    	   WebElement ddown = driver.findElement(By.xpath("//*[@id=\"input-store\"]"));
    	   Select select = new Select(ddown);
    	   
    	   select.selectByValue("0");
    		System.out.println("Able to select Default");
    		
    		
    		
    	WebElement ddown1 = driver.findElement(By.xpath("//*[@id=\"input-to\"]"));
       	   Select select1 = new Select(ddown1);
       	   
       	   select1.selectByValue("customer_all");
       		System.out.println("Able to select options");
    		
       	 	driver.findElement(By.xpath("//*[@id=\"input-subject\"]")).sendKeys(string3);
       	 	Thread.sleep(3000);
       	 	
       	 driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/form/div[8]/div/div/div[3]/div[2]")).sendKeys(string4);
       	Thread.sleep(3000);
    }
    
    catch(Exception e)
    {
    	
    	System.out.println("unable to select options");
    }
}

@Then("click on Send button")
public void click_on_Send_button() {
    // Write code here that turns the phrase above into concrete actions
	 try
	    {

		 driver.findElement(By.xpath("//*[@id=\"button-send\"]")).click();
		 
	    	System.out.println("Able to click on send ");
			
	    	
	    }
	     
	    catch(Exception e)
	    {
	    	System.out.println("Unable to click on send button "+e);
			
	    	
	    }
    
    
}

@Then("user navigate success message")
public void user_navigate_success_message() {
    // Write code here that turns the phrase above into concrete actions
try
{
	Thread.sleep(3000);
	String expectedtitle = "Send";
	String actualtitle = driver.getTitle();
	Assert.assertEquals(expectedtitle,actualtitle);
	System.out.println("You are able  to navigate Mail dashboard");
	
}

catch(Exception e)
{
	System.out.println("You are Unable  to send Mail"+e);
	Assert.fail();
}
}







   
}



