package com.scripts;

import com.genericlibe.BaseClass;
import com.pompages.AddToCartPage;
import com.pompages.SkillRaryDemoPage;
import com.pompages.SkillRaryPage;
import org.testng.annotations.Test;

public class Test1 extends BaseClass {
    @Test
    public void tc1() {
        SkillRaryPage sp = new SkillRaryPage(driver);
        sp.gearbutton();
        sp.getCountgears();
        sp.skillRaryDemoApplicaiton();

        driverUtilites.switchTabs(driver);
        SkillRaryDemoPage sd = new SkillRaryDemoPage(driver);

        driverUtilites.mouseHover(driver, sd.getCoursetab());
        sd.seleniumTraining();

        AddToCartPage ak = new AddToCartPage(driver);
        driverUtilites.doubleClick(driver, ak.getAddbutton());
        ak.addtocartButton();
        driverUtilites.alertPopUP(driver);

    }
}