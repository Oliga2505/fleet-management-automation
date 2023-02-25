package com.vytrack.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
        }
    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedTitle) {

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindow : windowHandles) {
            Driver.getDriver().switchTo().window(eachWindow);
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
                break;
            }
        }
    }

    public static void verifyTitle(String expectedTitle) {

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public static void verifyTitleContains(String expectedTitle) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }

    public static void waitForInvisibilityOf(WebElement target) {
        //create an object from WebDriverWait class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //use the 'wait' object with the proper syntax to create explicit wait conditions
        wait.until(ExpectedConditions.invisibilityOf(target));
    }

    public static void waitForInvisibilityOf(String title) {
        //create an object from WebDriverWait class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //use the 'wait' object with the proper syntax to create explicit wait conditions
        wait.until(ExpectedConditions.titleContains(title));
    }

    public static List<String> dropdown_options_as_STRING(WebElement dropDownElement) {

        Select select = new Select(dropDownElement);

        List<WebElement> dropDownMonths_WEB_ELEMENT = select.getOptions();
        List<String> dropDownMonths_STRING = new ArrayList<>();

        for (WebElement each : dropDownMonths_WEB_ELEMENT) {
            dropDownMonths_STRING.add(each.getText());
        }

        return dropDownMonths_STRING;
    }

}
