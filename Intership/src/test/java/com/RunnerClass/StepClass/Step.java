package com.RunnerClass.StepClass;

import com.RunnerClass.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Step  {

   public WebDriver driver;
    Hooks search;
    Hooks open = new Hooks(driver);

    @Given("I am on homepage of Invoice Manager application")
    public void i_am_on_homepage_of_invoice_manager_application() throws Throwable {
        open.logindetails();
        search = new Hooks(driver);
        System.out.println("print here");

    }

    @When("I click on Customers")
    public void i_click_on_customers() {

    }
    @Then("I should able to List Customers and Add customer, import customers by csv")
    public void i_should_able_to_list_customers_and_add_customer_import_customers_by_csv() {

    }
}


//driver = new FirefoxDriver();
// driver.manage().window().maximize();
// Element = new Locator(driver);
//  Element.url();
//  Element.username();
//  Element.password();
//  Element.loginBtn();