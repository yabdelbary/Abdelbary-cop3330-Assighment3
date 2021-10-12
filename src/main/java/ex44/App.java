package ex44;

import java.nio.file.Files;
import java.util.*;
import java.io.*;
import com.google.gson.*;


/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yussef Abdelbary
 */


/*First we must declare gson in our code so that that we can allow for the implementaiton of json

**Next we create 3 arrays to store the information that was given to us in our json files which are the product name, quantity, and price

**Next we must call to the json file we created in order to grab and parse the data in the file

**Once we have successfully obtained the information from the file we can now start making code asking for an input from the user

**Finally if the user has successfully inputted a name from our data base in this case "Thing" we will display the details which are the name, price, and quantity
 */




public class App
{

    public static void main(String[] args) throws Exception
    {
        Gson gson = new GsonBuilder().create();

        ArrayList<String> productName = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();


        File jsonFile = new File("src\\main\\java\\ex44\\exercise44_input.json");
        JsonParse jsonParse = gson.fromJson(Files.readString(jsonFile.toPath()), JsonParse.class);




        for (ProductDetails product : jsonParse.products)
        {
            productName.add(product.name);

            price.add(product.price);

            quantity.add(product.quantity);
        }

        Scanner InputtedProductName = new Scanner(System.in);

        int validProductName = 1;

        while(validProductName == 1)
        {
            System.out.print("\nWhat is the product name? ");

            String userProductName = InputtedProductName.next();


            for(int i = 0; i < productName.size(); i++)
            {
                if (userProductName.equals(productName.get(i)))
                {
                    validProductName = 0;

                    System.out.printf("\nName: %s\nPrice: %.2f\nQuantity: %d\n", productName.get(i), price.get(i), quantity.get(i));
                    break;
                }
            }


            if(validProductName == 1)
            {

                System.out.println("Sorry, that product was not found in our inventory.");
            }
        }
    }


    public static class ProductDetails
    {
        String name;
       double price;
        int quantity;
    }


    public static class JsonParse {
        List<ProductDetails> products;
    }
}