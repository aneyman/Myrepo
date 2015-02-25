package org.seleniumqa.lesson_4;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by admin on 11.02.2015.
 */
 dfgdfgdfg
public class Hello {

    private String S;

    @BeforeTest
    public void setUp(){
        S = "Мама мыла раму";
    }

    @Test
    public void isPrimeTest(){
        assertTrue(FindSymbol(S));
    }

    public static boolean FindSymbol(String S) {
        boolean b = (S.contains("у"));
        if (b) {return true;} else {return false;}

    }


    @AfterTest
    public void tearDown(){
        S = "";
    }

}

