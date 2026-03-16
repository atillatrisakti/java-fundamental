package com.juaracoding.learnjava.oop;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class AuthTest {
    
    Auth auth;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        auth = new Auth();
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"admin", "password123", true},
                {"admin", "WrongPassword", false},
                {"user", "Indonesia", false},
                {"user", "WrongPassword", false}
        };
    }

    @DataProvider(name = "registerData")
    public Object[][] registerData() {
        return new Object[][]{
                {"newuser", "password123", "1234567890123456", true}
        };
    }
    
    @DataProvider(name = "registerDataInvalid")
    public Object[][] registerDataInvalid() {
        return new Object[][]{
                {"user", "pass", "1234567890123456"},  // password < 8
                {"user", "password123", "12345678901234"},  // nik < 16
                {"user", "password123", "12345678901234567"}  // nik > 16
        };
    }

    @Test(dataProvider = "loginData", groups = "smoke")
    public void testLogin(String username, String password, boolean expected) {
        boolean result = auth.login(username, password);
        Assert.assertEquals(result, expected);
        System.out.println("Test login success passed");
    }
    @Test(dataProvider = "registerData", groups = "smoke")
    public void testRegister(String username, String password, String nik, boolean expected) {
        boolean result = auth.register(username, password, nik);
        Assert.assertEquals(result, expected);
        System.out.println("Test register success passed");
    }
    
    @Test(dataProvider = "registerDataInvalid", expectedExceptions = IllegalArgumentException.class, groups = "smoke")
    public void testRegisterInvalid(String username, String password, String nik) {
        auth.register(username, password, nik);
        System.out.println("Test register invalid passed");
    }
}   
