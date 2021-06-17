package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {




    //Test to make sure createWebsite works.
    @Test
    void createWebsite_works() {

        //Use the function and save the return value.
        WebsiteGenerator wg = new WebsiteGenerator();

        wg.path = "src/main/java/ex43/";
        wg.siteName = "testwebsite.com";
        wg.author = "Jose Valencia";

        String expected = "src/main/java/ex43/testwebsite.com";
        String actual = wg.createWebsite();

        //Compare with the expected return value.
        assertEquals(expected, actual);

    }

    //Test to make sure createJSFolder works.
    @Test
    void createJSFolder_works() {

        //Use the function and save the return value.
        WebsiteGenerator wg = new WebsiteGenerator();

        wg.path = "src/main/java/ex43/";
        wg.siteName = "testwebsite.com";
        wg.author = "Jose Valencia";

        String expected = "src/main/java/ex43/testwebsite.com/js";
        String actual = wg.createJSFolder();

        //Compare with the expected return value.
        assertEquals(expected, actual);

    }

    //Test to make sure createCSFolder works.
    @Test
    void createCSSFolder_works() {

        //Use the function and save the return value.
        WebsiteGenerator wg = new WebsiteGenerator();

        wg.path = "src/main/java/ex43/";
        wg.siteName = "testwebsite.com";
        wg.author = "Jose Valencia";

        String expected = "src/main/java/ex43/testwebsite.com/css";
        String actual = wg.createCSSFolder();

        //Compare with the expected return value.
        assertEquals(expected, actual);

    }

    //Test to make sure createHTML works.
    @Test
    void createHTMl_works() {

        //Use the function and save the return value.
        WebsiteGenerator wg = new WebsiteGenerator();

        wg.path = "src/main/java/ex43/";
        wg.siteName = "testwebsite.com";
        wg.author = "Jose Valencia";

        String expected = "src/main/java/ex43/testwebsite.com/index.html";
        String actual = wg.createHTMl();

        //Compare with the expected return value.
        assertEquals(expected, actual);

    }
}