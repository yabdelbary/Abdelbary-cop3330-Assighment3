package ex42;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import java.io.*;


/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yussef Abdelbaryh
 */




public class AppTest
{

    @Test
    public void checkTable() throws IOException
    {
        assertEquals("Last      First     Salary\n" +
                "--------------------------\n" +
                "Ling      Mai       55900 \n" +
                "Johnson   Jim       56500 \n" +
                "Jones     Aaron     46000 \n" +
                "Jones     Chris     34500 \n" +
                "Swift     Geoffrey  14200 \n" +
                "Xiong     Fong      65000 \n" +
                "Zarnecki  Sabrina   51500 \n", App.parseInfoFromFile());
    }
}