/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PUT_YOUR_NAME_HERE
 */
public class Quiz2 {

    /**
     * Takes in a number and calculates the sum from 1 to that number Example:
     * sumUpTo(5) would return 15 Because 1 + 2 + 3 + 4 + 5 = 15
     *
     * @param n the number to sum up to
     * @return
     */
    // Making a method called sumUpTo 
    public int sumUpTo(int n) {

        // When the numbers reaches zero, this indicates that all the numbers have been added
        if (n == 0) {
            return 0;
        } else {

            // After the number is returned the method calls a number one value less
            return n + sumUpTo(n - 1);
        }
    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    // Making a method called reverseString
    public String reverseString(String word) {

        // The intial length equals the length of word
        if (word.length() == 1) {

            // When the word is a single letter, return that letter 
            return word;
        } else {

            // String statement for all the letters in the word except the last
            String letters = word.substring(0, word.length() - 1);

            // String statement for the last letter 
            String lastletter = word.substring(word.length() - 1);

            // Returns last letter and calls any remaining letters 
            return lastletter + reverseString(letters);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();

        //use test.sumUpTo(__)  or test.reverseString(___) to test
        System.out.println("The Summation of the numbers entered is: ");
        System.out.println(test.sumUpTo(3));

        System.out.println("The Reverse of the word entered is: ");
        System.out.println(test.reverseString("Waterloo"));


    }
}
