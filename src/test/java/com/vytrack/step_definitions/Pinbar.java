package com.vytrack.step_definitions;

import com.vytrack.pages.PinbarPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Pinbar {

PinbarPage pinbarPage = new PinbarPage();
 // @Given("the user is on the home page {string}")
 // public void the_user_is_on_the_home_page(String) {

 // }
 @When("the user on the page {string}")
 public void the_user_on_the_page(String webpage) {

  Driver.getDriver().get(webpage);


  //   BrowserUtils.verifyTitle("How To Use Pinbar ");

    }
    @When("the user can click on the message Learn how to use this space")
    public void the_user_can_click_on_the_message( ) {
    // WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(3));
    // wait.until(ExpectedConditions.visibilityOf(pinbarPage.clickPinbarPage));
     pinbarPage.clickPinbarPage.click();
     //BrowserUtils.verifyTitleContains(pinbarPage.viewFirstMessage.getText());

    }
    @Then("the user should see 2 messages {string} and {string}")
    public void the_user_should_see_messages_and(String message1, String message2) {
     Assert.assertEquals(message1, pinbarPage.viewFirstMessage.getText());
     Assert.assertEquals(message2, pinbarPage.viewSecondMessage.getText());
    }
 @Given("the user is on the home page {string}")
 public void the_user_is_on_the_home_page(String homepage) {
  Driver.getDriver().get(homepage);

}
}
