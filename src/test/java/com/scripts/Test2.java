package com.scripts;

import com.genericlibe.BaseClass;
import com.pompages.SkillRaryDemoPage;
import com.pompages.SkillRaryPage;
import com.pompages.TestingPage;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class Test2  extends BaseClass {

    @Test
    public void tc2() throws IOException, InterruptedException {
        SkillRaryPage sp = new SkillRaryPage(driver);
        sp.gearbutton();
        sp.skillRaryDemoApplicaiton();

        driverUtilites.switchTabs(driver);
        SkillRaryDemoPage sd = new SkillRaryDemoPage(driver);
        driverUtilites.dropDown(sd.getCourseAdd(), pdata.getData("coursename"));

        TestingPage tp = new TestingPage(driver);
        driverUtilites.dragAndDrop(driver, tp.getSeleniumtraining(), tp.getCart());
        Point loc = tp.getFacebook().getLocation();
        int x = loc.getX();
        int y = loc.getY();
        driverUtilites.scrollBar(driver,x,y);
        tp.facebookIcon();


    }
}
