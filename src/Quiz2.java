/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denis Tatar
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
        // Base case, if the integer is equal to 0, then simply return 0
        if (n == 0) {
            // Call the method again and return 0!
            return 0;
        }
        // Call the method again, return the integer number and the integer subtracted by one and then add both together and so on!
        // This is essentially getting the number the user entered and adding it the number before that number entered(n-1) and so on until
        // there are no more numbers to go through (until the loop hits 0)!
        return n + sumUpTo(n - 1);
    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word) {
        // If the word is 0 length, then simply return an empty string
        if (word.length() == 0) {
            // Call the method, an empty string is returned 
            return "";
        }
        // Call the method again, return the last letter first plus the rest of the seperated word (This chunk of the word 
        // left is then going to go through the same recusion loop until there are no more letters left)
        // Print the word backwards!
        return word.charAt(word.length() - 1) + reverseString(word.substring(0, word.length() - 1));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();

        //use test.sumUpTo(__)  or test.reverseString(___) to test
        // Print out the title to question 1
        System.out.println("Question 1: ");
        // Print out the user's answer
        System.out.println(test.sumUpTo(0));

        // Print out the title to question 2
        System.out.println("Question 2: ");
        // Print out the user's answer
        System.out.println(test.reverseString("!ssalc siht evoL :sP !ereh saw sineD"));

    }
}
