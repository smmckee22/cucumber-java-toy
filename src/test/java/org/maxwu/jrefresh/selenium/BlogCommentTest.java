package org.maxwu.jrefresh.selenium;

import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runners.MethodSorters;
import org.maxwu.jrefresh.ColorPrint;
import org.maxwu.jrefresh.selenium.pageObjects.BlogCommentPage;
import org.maxwu.jrefresh.selenium.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by maxwu on 2/13/17.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BlogCommentTest {
    private WebDriver driver = null;
    private BlogCommentPage blogCommentPage = null;

    @Rule
    public TestRule watch = new ScreenshotWatcher();

    @Before
    public void setUp(){
        if (driver != null){
            //quit the last session
            DriverFactory.quitDriver(driver);
        }
        driver = DriverFactory.getDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        blogCommentPage = new BlogCommentPage(driver);
        ScreenshotWatcher.setPageObject(blogCommentPage);
    }

    @Test(timeout = 30)
    public void a01LoginDisqus(){

    }

    @Test(timeout = 30)
    public void a02TestSequence(){

    }

    @After
    public void tearDown(){
        if (driver != null){
            DriverFactory.quitDriver(driver);
            driver = null;
        }
    }

}

