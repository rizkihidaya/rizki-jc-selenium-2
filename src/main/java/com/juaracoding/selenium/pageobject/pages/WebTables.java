package com.juaracoding.selenium.pageobject.pages;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTables {
    private WebDriver driver;

    public WebTables() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addNewRecordButton")
    WebElement btnAdd;

    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "age")
    WebElement age;

    @FindBy(id = "salary")
    WebElement salary;

    @FindBy(id = "department")
    WebElement department;

    @FindBy(id = "submit")
    WebElement submit;

    //Page Object
    public void registrationForm(String firstName, String lastName, String userEmail, String age, String salary, String department){
        btnAdd.click();
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.userEmail.sendKeys(userEmail);
        this.age.sendKeys(age);
        this.salary.sendKeys(salary);
        this.department.sendKeys(department);
        submit.click();
    }
}
