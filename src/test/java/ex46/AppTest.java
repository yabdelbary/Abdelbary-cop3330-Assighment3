package ex46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yussef Abdelbary
 */


class AppTest {



    @Test
    void findBiggestNumber()
    {
        //Testing with some array values to see if our function works
        App test = new App();

        ArrayList<Integer> test_array = new ArrayList<>();

        test_array.add(20);
        test_array.add(5);

        assertEquals(0, test.findBiggestNumber(test_array));//Seeing if the value is the smallest number found by the function
    }


}