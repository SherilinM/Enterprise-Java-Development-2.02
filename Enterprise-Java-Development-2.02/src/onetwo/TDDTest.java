package onetwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TDDTest {

    //Test 1
    @Test
    void testArrays(){
        //Odd array and even positive
        assertArrayEquals(new int[]{1, 3, 5}, TDD.arrayOdd(5));

        //Odd array and odd positive
        assertArrayEquals(new int[]{1, 3, 5}, TDD.arrayOdd(6));

        //Odd array and zero empty array
        assertArrayEquals(new int[]{}, TDD.arrayOdd(0));

        //Odd array and negative value
        assertArrayEquals(new int[]{}, TDD.arrayOdd(-3));
    }

    //Test 2

    @Test

    void testKeywords(){
        //find "break"
        assertEquals(true, TDD.findIfContainsKeywords("Don't break my heart"));

        //don't find "break"
        assertEquals(false, TDD.findIfContainsKeywords("Don't breakmy heart"));

        //string with no words
        assertEquals(false, TDD.findIfContainsKeywords(""));
        assertEquals(false, TDD.findIfContainsKeywords(" "));
    }
}
