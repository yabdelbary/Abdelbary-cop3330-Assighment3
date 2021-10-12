package ex46;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yussef Abdelbary
 */


/*In this code we will be counting the frequency of words in a file then displaying it through asteriks
**First we must make a file where we can grab the given data and toss it into two arrays
**In these arrays the first one will have the words from the input file wjile the second one will keep track of the amount of times that word appears
**Next for the next constraint we need a method to find the word with the biggest number so we can place it at the top same with the least amount of words on the bottom
**Next we create a method for printing the word and count once were able to figure out the order through the previous method
**
 */


public class App
{

    public static void frequencyArray(ArrayList<String> words, ArrayList<Integer> wordsCount) throws Exception
    {


        //This is the pathway to the input file we stored the input data we were given
        File in = new File("C:\\Users\\yussefaeb\\IdeaProjects\\Abdelbary-cop3330-assighment3\\src\\main\\java\\ex46\\exercise46_input.txt");
        Scanner input = new Scanner(in);

        while (input.hasNextLine())
        {
            String[] wordsInLine = input.nextLine().split(" ");


            for (String word : wordsInLine)
            {
                boolean wordExists = false;


                for (int i = 0; i < words.size(); i++)
                {

                    if (word.equals(words.get(i)))
                    {
                        wordsCount.set(i, wordsCount.get(i) + 1);

                        //Makinng sure that this word actually exists in the given input file
                        wordExists = true;
                    }

                }
                //This is how we keep track of the amount of words that are repeatted in the given input file
                if (!wordExists)
                {
                    words.add(word);
                    wordsCount.add(1);
                }

            }
        }



        input.close();
    }


    // This function finds the largest value in the wordCount array and returns its position
    public static int findBiggestNumber(ArrayList<Integer> wordsCount)
    {

        int biggestNumb = 0;
        int biggestNumbSpot = 0;
        // Find the word with the largest count
        for (int i = 0; i < wordsCount.size(); i++)
        {
            if (biggestNumb < wordsCount.get(i))
            {
                biggestNumb = wordsCount.get(i);
                biggestNumbSpot = i;
            }
        }
        return biggestNumbSpot;
    }

   //This method is responsible for making sure the list goes in descending order from highest repeated word count to lowest
    //So based on the input file it should read Badger, Muschroom, snake
    public static void printWordsInOrder(ArrayList<String> words, ArrayList<Integer> wordsCount)
    {
        while (words.size() > 0) {
            int biggestNumberLocation = findBiggestNumber(wordsCount);
            System.out.format("%-10s", words.get(biggestNumberLocation) + ": ");

            for (int i = 0; i < wordsCount.get(biggestNumberLocation); i++) System.out.print("*");

            System.out.println();


            words.remove(biggestNumberLocation);
            wordsCount.remove(biggestNumberLocation);
        }
    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> words = new ArrayList<>();

        ArrayList<Integer> wordsCount = new ArrayList<>();


        frequencyArray(words, wordsCount);
        printWordsInOrder(words, wordsCount);
    }
}