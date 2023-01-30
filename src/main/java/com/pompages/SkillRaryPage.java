package com.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SkillRaryPage {

    @FindBy(xpath = "(//a[text() = ' GEARS '])")
    private WebElement gearsbtn;

    @FindBy(xpath = "//ul[@class='dropdown-menu gear_menu']//li")
    private List<WebElement> countgears;

    @FindBy(xpath = "(//a[text() = ' SkillRary Demo APP'])[2]")
    private WebElement skillrearydemoapp;

    public List<WebElement> getCountgears() {
        countgears.forEach(e -> System.out.println(e.getText()));
        System.out.println(countgears.size());
        return countgears;
    }

    @FindBy(name = "q")
    private WebElement searchbox;

    @FindBy(xpath = "//input[@type = 'submit']")
    private WebElement searchboxcbtn;

    public SkillRaryPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void getgearbutton()
    {
        gearsbtn.click();
    }
    public void skillRaryDemoApplicaiton()
    {
        skillrearydemoapp.click();
    }
    public void searchtextbox(String name)
    {
        searchbox.sendKeys(name);
    }
    public void searchboxcbtn()
    {
        searchboxcbtn.click();
    }

    public void gearbutton() {
        gearsbtn.click();
    }
}
