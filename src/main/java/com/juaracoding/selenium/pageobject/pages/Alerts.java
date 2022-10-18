package com.juaracoding.selenium.pageobject.pages;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alerts {
    private WebDriver driver;

    public Alerts() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "alertButton")
    WebElement btnAlertOne;

    @FindBy(id = "timerAlertButton")
    WebElement btnAlertTwo;

    @FindBy(id = "confirmButton")
    WebElement btnAlertThree;

    @FindBy(id = "promtButton")
    WebElement btnAlertFour;

    public void alertButton(){
        btnAlertOne.click();
        delay(1);
        driver.switchTo().alert().accept(); //Button OK
        System.out.println("Button OK Clicked");
    }

    public void timerAlertButton(){
        btnAlertTwo.click();
        delay(6);
        driver.switchTo().alert().accept(); //Button OK
        System.out.println("Button OK Clicked with Timer");
    }

    public void confirmButton(){
        btnAlertThree.click();
        delay(1);
        driver.switchTo().alert().accept(); //Button OK
        System.out.println("Button Confirm OK Clicked");
        btnAlertThree.click();
        delay(1);
        driver.switchTo().alert().dismiss(); //Button Cancel
        System.out.println("Button Confirm Cancel Clicked");
    }

    public void promtButton(){
        delay(1);
        btnAlertFour.click();
        delay(1);
        driver.switchTo().alert().sendKeys("Koswara");
        delay(1);
        driver.switchTo().alert().accept(); //Button OK
        System.out.println("Button Prompt OK Clicked with Input User Name");
    }

    static void delay(int detik){
        // delay
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

