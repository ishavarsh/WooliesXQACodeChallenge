package stepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.addCartAckPage;
import pageObjects.shippingAddressPage;
import pageObjects.shippingAuthPage;
import pageObjects.shippingDetailsPage;
import pageObjects.shippingPaymentPage;
import pageObjects.shippingSummaryPage;
import pageObjects.storePage;
import resources.UtilityClass;
import resources.base;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


@RunWith(Cucumber.class)
public class stepDefinition extends base {
    	
	UtilityClass hp=new UtilityClass();
	storePage sPage;
	addCartAckPage cartPage = new addCartAckPage(driver);
	shippingSummaryPage sumPage=new shippingSummaryPage(driver);
	shippingAuthPage authPage= new shippingAuthPage(driver);
	shippingAddressPage addPage=new shippingAddressPage(driver);
	shippingDetailsPage detailsPage= new shippingDetailsPage(driver);
	shippingPaymentPage paymentPage = new shippingPaymentPage(driver);
	
	
	@Given("^Initialise the browser with chrome$")
    public void initialise_the_browser_with_chrome() throws Throwable {
        driver= initializeDriver();
    }
    
    @Given("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_site(String siteName) throws Throwable {
         	driver.get(siteName);
    }
    
    
    @When("^I add to cart first item$")
    public void i_add_to_cart_first_item() throws Throwable {
    	sPage= new storePage(driver);
		WebElement itemFirst=sPage.getItemFirst();
		hp.scrollByVisibleElement(itemFirst);
		hp.actionInstance().moveToElement(itemFirst).perform();	
		sPage.getItem1AddToCart().click();					
		
    }
  
     
    @Then("^Item is added to cart successfully$")
    public void item_is_added_to_cart_successfully() throws Throwable 
    {
    
    	String winHandleBefore = driver.getWindowHandle();
		String expectedCartConfirmationText="Product successfully added to your shopping cart";
		sPage= new storePage(driver);
		cartPage= new addCartAckPage(driver);
		hp.waitInstance().until(ExpectedConditions.visibilityOfElementLocated(cartPage.getCloseIconBy()));				
		hp.switchToNewWindow(driver);	
		String actualCartConfirmationText= cartPage.getAddCadrtAckText().getText();
		Assert.assertEquals(actualCartConfirmationText,expectedCartConfirmationText) ;
		cartPage.getCloseWndwIcon().click();
		driver.switchTo().window(winHandleBefore);
		
    }
    
    @Given("^Second item is also added successfully$")
    public void second_item_is_also_added_successfully() throws Throwable 
    {    	
    	sPage= new storePage(driver);
    	String winHandleBefore = driver.getWindowHandle();
    	sPage.getItem2AddToCart().click();
    	hp.waitInstance().until(ExpectedConditions.visibilityOfElementLocated(cartPage.getCloseIconBy()));				
		hp.switchToNewWindow(driver);
		addCartAckPage cartAck= new addCartAckPage(driver);
		cartAck.getCloseWndwIcon().click();
		driver.switchTo().window(winHandleBefore);
		
    }
        
    @When("^I click on cart link$")
    public void i_click_on_cart_link() throws Throwable {
    	storePage sPage= new storePage(driver);
    	WebElement cartLink=sPage.getcartLink();
    	hp.scrollByVisibleElement(cartLink);
		hp.actionInstance().moveToElement(cartLink).perform();
		cartPage.getCheckOutBtn().click();
		
    }
          
    @Then("^Shopping cart summary tab is displayed$")
    public void shopping_cart_summary_tab_is_displayed() throws Throwable {
    	String actualHeading =sumPage.getSummaryTab().getText();
        Assert.assertEquals(actualHeading,"01. Summary");

    }
    
    @Then("^It shows shopping cart contains \"([^\"]*)\" $")
    public void it_shows_shopping_cart_contains(String arg1) throws Throwable {
    	 String productQty =sumPage.getProductsQuantity().getText();
         Assert.assertEquals(productQty, arg1);
    }
    
    @And("^Proceed to checkout is clicked$")
    public void proceed_to_checkout_is_clicked() throws Throwable {
    	sumPage.getProceedToCheckout().click();
    }
    
    @Given("^I am on sign In tab with already registered ID$")
    public void i_am_on_sign_in_tab_with_already_registered_id() throws Throwable {
    	shippingAuthPage authPage= new shippingAuthPage(driver);
    	hp.waitInstance().until(ExpectedConditions.visibilityOfElementLocated(authPage.getSignInTabBy()));
    	Assert.assertEquals(authPage.getSignInTab().getText(),"02. Sign In");
        
    }  
         

    @When("^I input registered email \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_input_registered_email_and(String arg1, String arg2) throws Throwable {         	
    	authPage.getEmailAddress().sendKeys(arg1);
        authPage.getPassword().sendKeys(arg2);
    }

     @And("^I click on sign In$")
    public void i_click_on_sign_in() throws Throwable {
    	shippingAuthPage authPage= new shippingAuthPage(driver);
    	authPage.getSignInBtn().click();
    }
    
    @Then("^Address tab is displayed$")
    public void address_tab_is_displayed() throws Throwable {
        shippingAddressPage addPage=new shippingAddressPage(driver);
        Assert.assertEquals(addPage.getAddressTab().getText(),"03. Address");
        
    }

    @When("^I click on proceed to checkout button$")
    public void i_click_on_proceed_to_checkout_button() throws Throwable {
        hp.scrollByPixel();
    	addPage.getCheckoutBtn().click();
    }
    
    @Then("^Shipping tab is displayed$")
    public void shipping_tab_is_displayed() throws Throwable {
    	Assert.assertEquals(detailsPage.getShippingTab().getText(),"04. Shipping");
    }
    
    @Given("^I accept terms of service$")
    public void i_accept_terms_of_service() throws Throwable {
        detailsPage.getTermsCheckbox().click();
    }

    @When("^I click on proceed to checkout on shipping$")
    public void i_click_on_proceed_to_checkout_on_shipping() throws Throwable {
        detailsPage.getCheckOutBtn().click();
    }

    @Then("^Payment tab is displayed$")
    public void payment_tab_is_displayed() throws Throwable {
       	Assert.assertEquals(paymentPage.getPaymentTab().getText(),"05. Payment");
     
    }
    
    @When("^I click on Pay by bank wire$")
    public void i_click_on_pay_by_bank_wire() throws Throwable {
       paymentPage.getPayWire().click();
    }

    @Then("^Order summary is displayed$")
    public void order_summary_is_displayed() throws Throwable {
        Assert.assertEquals(paymentPage.getPageHeading().getText(),"ORDER SUMMARY");
    }
    
    @When("^I click on confirm my order$")
    public void i_click_on_confirm_my_order() throws Throwable {
        paymentPage.getConfirmOrder().click();
    }
    
    @Then("^Order confirmation \"([^\"]*)\" is displayed$")
    public void order_confirmation_something_is_displayed(String confirmOrder) throws Throwable {
       	Assert.assertEquals(paymentPage.getConfirmText().getText(), confirmOrder);
       	hp.quitDriver();
    }
   
}