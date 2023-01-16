package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressPage 
   {
	WebDriver driver;
	

	@FindBy(xpath ="//*[@id='address-ui-widgets-enterAddressFullName']")
	 WebElement fullname;
	
	@FindBy(xpath ="//*[@id='address-ui-widgets-enterAddressPhoneNumber']")
	 WebElement mobilenumber;
	
	@FindBy(xpath ="//*[@id='address-ui-widgets-enterAddressPostalCode']")
	 WebElement pincode;
	
	@FindBy(xpath ="//*[@id='address-ui-widgets-enterAddressLine1']")
	 WebElement apartment;
	
	@FindBy(xpath ="//*[@id='address-ui-widgets-enterAddressLine2']")
	 WebElement sector;
	
	@FindBy(xpath ="//*[@id='address-ui-widgets-landmark']")
	 WebElement landmark;
	
	@FindBy(xpath ="//*[@id='address-ui-widgets-enterAddressCity']")
	 WebElement city;
	
	
	@FindBy(xpath ="//*[@id='address-ui-widgets-enterAddressStateOrRegion']")
	 WebElement state;
	
	@FindBy(xpath ="//*[@type='checkbox']")
	 WebElement checkbox;
	
	
	@FindBy(xpath ="//*[@id='address-ui-widgets-addr-details-address-type-and-business-hours']")
	 WebElement addresstype;
	
	
	@FindBy(xpath ="//*[@id='address-ui-widgets-form-submit-button-announce']")
	 WebElement submit;

	
	
	public AddressPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void addNewAddress()
	
	{
		

		
		fullname.sendKeys("nicolus");
		
		mobilenumber.sendKeys("188816946");
		
		pincode.sendKeys("816946");
		
		apartment.sendKeys("RajBhwan");
		
		sector.sendKeys("noida");
		
		city.sendKeys("valican");
		
	
		
	
	}
}
