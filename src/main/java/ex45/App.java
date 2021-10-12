package ex45;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 fYussef Abdelbary
 */

/*To begin with we have our main in which we call on to our methods to sucessfully do what we want
**Next we will create a method to grab the information that we input into a file
**Next we will make a method which is the whole point of the code and that is to switch the string "utilize" with the word use
**Once we created this and created a method that is responsible for going through the entirety of the string we can now create an outputFile
**The information with the newly modified string will be named based on the user when prompted "Name of output file"
*
 */




public class App
{
    public static void main( String[] args )
    {
        String y = readFile();

        String x = replaceString(y, "utilize", "use");

        String name = getName();

        writeFile(name, x);
    }

    public static void writeFile(String outputName, String x)
    {
        try
        {
            FileWriter textFileOutput = new FileWriter(System.getProperty("user.dir") + "\\src\\main\\java\\ex45\\" + outputName + ".txt");

            textFileOutput.write(x);

            textFileOutput.close();
        }
        catch (IOException e)
        {
            System.out.println("Output file corrupted.");
        }
    }



    public static String getName()
    {

        System.out.print("Name of output file: ");

        Scanner input = new Scanner(System.in);

        return input.nextLine();
    }

    public static String replaceString(String y, String original, String replacement)
    {
        return y.replaceAll(original, replacement);
    }

    public static String readFile()
    {
        String y="";

        try
        {
            File takeIn = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ex45\\exercise45_input.txt");
            Scanner reader = new Scanner(takeIn);

            StringBuilder buffer = new StringBuilder();

            while (reader.hasNextLine()) {
                buffer.append(reader.nextLine()).append("\n");
            }

            y = buffer.toString();
            reader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }

        return y;
    }



}
