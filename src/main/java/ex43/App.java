package ex43;


import java.io.IOException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yussef Abdlebary
 */

/*Psuedo code
**To start due to the constraints we need to asj the user for the site name, the site author
ask if they would like a java script folder, and lastly ask if theey want a CSS folder and store this information given by the user
**Next we will need to create directories with these names we were given
**We must now write to a file with the index.html
**Once we do this we continue with our newly created package 43 and eventually print out the created entity
 */


//Can't figure out/ not enough time...pain :(

public class App {
    public static void main(String[] args) throws IOException {
        String site;
        String author;
        char js;
        char css;

        Scanner siteName = new Scanner(System.in);
        System.out.println("Site name: ");
        site = siteName.nextLine();

        System.out.println("Author: ");
        Scanner authorName = new Scanner(System.in);
        author = authorName.nextLine();

        System.out.println("Do you want a folder for JavaScript? (y or n)");
        Scanner jsName = new Scanner(System.in);
        js = jsName.nextLine().charAt(0);

        System.out.println("Do you want a folder for CSS? (y or n)");
        Scanner cssName = new Scanner(System.in);
        css = cssName.nextLine().charAt(0);

        createDirectories(site, js, css, author);

        printCreatedWebsite(site, js, css);
    }


    public static String createDirectories(String siteName, char jsFolder, char cssFolder, String authorName) throws IOException
    {

    }


    public static void printCreatedWebsite(String webName, char jsDirectory, char cssDirectory)
    {

    }

}




