package com.ttms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RESTAPITest {
    @Test
    public void apiTest1 ()
    {
        System.out.println("apiTest1");
    }

    @Test
    public void seleniumTest2 ()
    {
        System.out.println("apiTest2");
        Assert.assertEquals(1,2);
    }
}
