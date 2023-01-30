package com.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PrivateKey;
import java.security.SignedObject;

public class SkillRaryDemoPage {

    @FindBy(id = "course")
    private WebElement coursetab;

    @FindBy(xpath = "(//a[text() = 'Selenium Training'])[1]")
    private WebElement seleniumtrainingtab;

    @FindBy(name = "addresstype")
    private WebElement coursedd;

    public SkillRaryDemoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getCoursetab() {
        return coursetab;
    }

    public void seleniumTraining()
    {
        seleniumtrainingtab.click();
    }

    public WebElement getCourseAdd() {
        return coursedd;
    }
}
