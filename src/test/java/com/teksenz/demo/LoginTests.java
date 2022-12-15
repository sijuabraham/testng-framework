package com.teksenz.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority=1, testName = "Login test with valid username and password")
    public void loginWithValidUser()
    {
        System.out.println("Login test with valid user and password");
        String exp = "Hello";
        String act = "Hello";
        Assert.assertEquals(act,exp,"The words not match");
    }

    @Test(priority = 2, testName = "Login test with invalid user and password")
    public void loginWithInvalidUser()
    {
        System.out.println("Login with invalid user");
        Assert.fail("Invalid user login test failed");
    }

    @Test(priority = 3, testName = "Verify homepage title")
    public void homePageTest() {
        System.out.println("This is a home page test");
        String exp = "Homepage";
        String act = "Homepage";
        Assert.assertTrue(exp==act,"Home page title is incorrect");
    }

    @Test(priority = 4, testName = "Verify logout")
    public void logoutTest(){
        System.out.println("This is a logout test");
    }
}
