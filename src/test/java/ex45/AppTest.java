package ex45;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yussefg Abdelbary
 */


class AppTest {
/*
    @Test
    void main()
    {
    }

 */



    @Test
    void replaceString()
    {
        String x = "example test string replacement";
        String y = App.replaceString(x, "e", "a");
        assertEquals("axampla tast string raplacamant", y);
    }




}