package ex41;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.IOException;
import java.util.ArrayList;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yussef Abdelbary
 */


public class AppTest
{
    @Test
    public void checkReadFileIntoList() throws IOException {//Checking to see if file contets properly grabbed from the file
        ArrayList<String> namesCheck = new ArrayList<>();

        namesCheck.add("Ling, Mai");
        namesCheck.add("Johnson, Jim");
        namesCheck.add("Zarnecki, Sabrina");
        namesCheck.add("Jones, Chris");
        namesCheck.add("Jones, Aaron");
        namesCheck.add("Swift, Geoffrey");
        namesCheck.add("Xiong, Fong");

        assertEquals(namesCheck, App.readInFile());
    }


}