package part2.com.soucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.soucedemo.base.BaseTest;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("xyz3598");
        loginPage.clickLoginButton();
        loginPage.getErrorMessage();
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualErrorMessage.contains("Epic sadface:"));
    }
}
