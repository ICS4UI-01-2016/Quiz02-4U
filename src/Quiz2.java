
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sevcm7279
 */
public class Quiz2 {

    /**
     * Takes in a number and calculates the sum from 1 to that number Example:
     * sumUpTo(5) would return 15 Because 1 + 2 + 3 + 4 + 5 = 15
     *
     * @param n the number to sum up to
     * @return
     */
    public int sumUpTo(int n) {

        // create a base case
        // if the number is 0 or 1 return that number
        if (n == 0 | n == 1) {
            return n;
            // if the number is not 0 or 1

        } else {
            return sumUpTo(n - 1) + n;
        }
    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word) {

        // if the word has 0 or 1 character return the word
        if (word.length() == 0 | word.length() == 1) {
            return word;
            // if the word has more than one character
        } else {
            // determine the new first letter, which is currently the last number
            String firstLetter = word.substring(word.length() - 1, word.length());
            // add the new first letter with the last part of the word
            return firstLetter + reverseString(word.substring(0, word.length() - 1));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();

        //use test.sumUpTo(__)  or test.reverseString(___) to test

        // create a scanner
        Scanner input = new Scanner(System.in);

        // ask the user to enter a number
        System.out.println("Please enter a number");

        // store the number in variable n
        int n = input.nextInt();
        // make a buffer for next string
        input.nextLine();

        // activate method to add numbers and print what is returned
        System.out.println(test.sumUpTo(n));


        // ask the user to enter a word
        System.out.println("Please enter a word");

        // store the word in a string
        String word = input.nextLine();

        // activate reverse string method and print what is returned
        System.out.println(test.reverseString(word));
    }
}
