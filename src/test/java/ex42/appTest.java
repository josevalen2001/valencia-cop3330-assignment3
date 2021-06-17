package ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    //Test for readInto() function in our app. If this function works we know that our Reader class has to be working as well.
    @Test
    void readInto_works_correctly() {

        app testApp = new app();

        String actual = app.readInto("src/main/java/ex42/exercise42_input.txt");
        String expected = "Ling,Mai,55900,Johnson,Jim,56500,Jones,Aaron,46000,Jones,Chris,34500,Swift,Geoffrey,14200,Xiong,Fong,65000,Zarnecki,Sabrina,51500";

        assertEquals(expected, actual);

    }

    //Test for parseInput() function in our app. If this function works we know that our CVSParser class has to be working as well.
    @Test
    void parseInput_works_correctly() {

        app testApp = new app();

        String[] actual = app.parseInput("Jose,Juan,Juda");
        String[] expected = {"Jose", "Juan", "Juda"};

        assertArrayEquals(expected, actual);

    }
}