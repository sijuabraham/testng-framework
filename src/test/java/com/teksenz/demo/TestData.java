package com.teksenz.demo;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "userInfo")
    public Object[][] loginInfo()
    {
        Object[][] data = new Object[][]{{"john","john123"}, {"mary","mary123"},{"David", "david123"}};
        return data;
        //or retun new Object[][]{{"john","john123"}, {"mary","mary123"},{"David", "david123"}};
    }
}

