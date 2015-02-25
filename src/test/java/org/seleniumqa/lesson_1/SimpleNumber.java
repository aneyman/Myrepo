package org.seleniumqa.lesson_1;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;


    public class SimpleNumber {

    private int number;

    @BeforeTest
    public void setUp(){
       number =13;
    }

    @Test
    public void isPrimeTest(){
        assertTrue(isPrime(number));
    }


    public static boolean isPrime(int n) {
        if (n == 1) return false;
            for (int i = 2; i*i < n; i++) {
                if (n % i == 0) return false;
            }
        return true;
    }


        @AfterTest
        public void tearDown(){
            number = 0;
        }

    }






