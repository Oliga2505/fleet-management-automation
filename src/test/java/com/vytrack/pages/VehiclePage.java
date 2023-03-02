package com.vytrack.pages;
import com.vytrack.pages.VehiclePage;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclePage {

    public VehiclePage() {

  PageFactory.initElements(Driver.getDriver(),this);

}


@FindBy(xpath = "//input[@name='_username']")
 public WebElement userName;

    @FindBy(xpath = "//input[@name='_password']")
public WebElement password;


    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement clickVehiclePage;


    @FindBy(xpath = "Vehicles")
    public WebElement clickViehcle;


    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[4]")
    public WebElement clickButtonThreeDots;

    @FindBy(xpath ="(//div[@class='loader-mask'])[2]")
    public WebElement ImageView;

    @FindBy(xpath ="//div[@id='ui-datepicker-div']")
    public WebElement ImageEdit;


    @FindBy(xpath ="//class[.='loader-frame']")
    public WebElement ImageDelete;
}
