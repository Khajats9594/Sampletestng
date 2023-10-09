package org.testvagrant;

import com.testvagrant.commons.annotaion.FrameworkAnnotation;
import org.testng.annotations.Test;
import org.testvagrant.pages.LoginPage;


public class SampleTest {

    @Test
    @FrameworkAnnotation(author = "Jerry",module = "Login")
    public void testNullPointerException() {
        String string = null;
        int length = string.length();
    }

    @Test
    @FrameworkAnnotation(author = "Jerry",module = "Login")
    public void testArithmeticException() {
        LoginPage login = new LoginPage();
        login.login();
        int result = 10 / 0;
    }

    @Test
    @FrameworkAnnotation(author = "Jon",module = "Login")
    public void testArithmeticException2() {
        int result = 10 / 0;
    }

    @Test
    @FrameworkAnnotation(author = "Tom",module = "Login")
    public void testIndexOutOfBoundsException() {
        int[] array = new int[5];
        int value = array[10];
    }

    @Test
    @FrameworkAnnotation(author = "Jerry",module = "Login")
    public void testMultipleExceptions() {
        String string = null;
        int length = string.length();
        int result = 10 / 0;
    }
}
