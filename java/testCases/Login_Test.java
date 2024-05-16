package testCases;

import org.testng.annotations.Test;

import webPages.LoginPage;

public class Login_Test extends Driver {

    @Test
    public void loginTest() throws InterruptedException {

        // Instantiate LoginPage class
        LoginPage lp = new LoginPage(driver);

        // Scroll down the page
        lp.scrollDown();
        Thread.sleep(2000);
        
        lp.closebtn();
        Thread.sleep(2000);

        // Click on the "Next" button
        lp.clickNext();
        Thread.sleep(2000);

        // Enter username
        lp.enterUsername("monisha.murugesan@capgemini.com");
        Thread.sleep(2000);

        // Click on the "Continue" button after entering username
        lp.clickContiButton1();
        Thread.sleep(2000);

        // Click on the login button
        lp.passwordLogin();
        Thread.sleep(2000);

        // Enter password
        lp.enterPassword("Monish@555");
        Thread.sleep(2000);

        // Scroll down the page
        lp.scrollDown();
        Thread.sleep(2000);

        // Click on the "Continue" button after entering password
        lp.clickContiButton2();
        Thread.sleep(2000);

        // Click on the "Featured" button
        lp.clickonFeatured();
        Thread.sleep(2000);

        // Print the text of a heading element
        lp.printText();
        Thread.sleep(2000);

        // Scroll down the page
        lp.scrollDown2();
        Thread.sleep(2000);

        // Click on a link related to sustainability campus
        lp.SustainabilityCampus();
        Thread.sleep(2000);

        // Print the text of a heading element
        lp.printText2();
        Thread.sleep(2000);

        // Scroll down the page
        lp.scrollDown3();
        Thread.sleep(2000);

        // Click on an image related to sustainability
        lp.sustImg();
        Thread.sleep(3000);
        
        lp.pageUrl();
        Thread.sleep(3000);
        
        lp.module();
        Thread.sleep(3000);
        
        lp.NewpageUrl();
        Thread.sleep(3000);
        
        lp.scrollDown4();
        Thread.sleep(3000);
        
        lp.startbtn();
        Thread.sleep(2000);

    }
}
