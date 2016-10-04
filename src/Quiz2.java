/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
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
        //Base Case: check if n is 1 or zero, if so, they are already sums, return n
        if (n == 1 || n == 0) {
            //return n to main method
            return n;
        }
        //add n to number 1 less than n, return values until base case is reached
        return n + (sumUpTo(n - 1));

    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word) {
        //base case
        if (word.length() == 1 ) {
            return word;
        }
        
        return reverseString(word.substring(1, word.length()-1) + word.charAt(0));


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();

        //System.out.println(test.sumUpTo(5));
        System.out.println(test.reverseString("cat"));

    }
}
