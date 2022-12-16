package com.teksenz.demo;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTests {

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before suite executed");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("After suite executed");
    }

    @Parameters({"browser","os"})
    @BeforeTest
    public void beforeTest(String browser, String os){
        System.out.println("Before test executed");
        System.out.println(("Browser : " + browser));
        System.out.println("OS :" + os);
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("After test executed");
    }

    @BeforeClass
    public void beforeCLass()
    {
        System.out.println("Before class method executed");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("After class method executed");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before method executed...");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After method executed...");
    }
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
