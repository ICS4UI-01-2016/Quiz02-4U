/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brendan Farrell
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

        if (n == 0 || n == 1) { // base case - if the number n is equal to zero or one do the following
            return n;   // return the number 
        }

        return n + sumUpTo(n - 1);  // return n + every number that came before it added together

    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word) {

        char a; // creating the char for a 

        String b = new String();    // creating the string for b

        if (word.length() == 0 || word.length() == 1) { // base case - if the word is only one or zero digits long do the following
            return word;    // return the word
        }

        a = word.charAt(word.length() - 1); // the char of a is equal to the last letter of the word
        b = reverseString(word.substring(0, word.length() - 1));    // string b is equal to first letter followed by every letter backwards
        return a + b;   // returning the last letter of the word followed by the middle letters concluded by the first letter of the original word

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        System.out.println(test.sumUpTo(10));   // outputting the sum of digits 
        System.out.println(test.reverseString("?krow ti seod"));    // outputting the inputted word backwards
        //use test.sumUpTo(__)  or test.reverseString(___) to test
    }
}
