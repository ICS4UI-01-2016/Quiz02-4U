/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauren Hall
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
        // base cases
        if (n == 0 || n == 1) {
            return n;
        }
        // subtract from n value to add n - 1
        int subsum = n;
        // keeps track of total
        int total = n - 1;

        return subsum + sumUpTo(total);
    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word) {

        StringBuilder sBuilder = new StringBuilder(word);
        int length = word.length();
        // base case
        if (length == 1) {
            return word;
        }
                
        String k = word.substring(length - (2 + s));                            // look at the space before the last loop's space
        sBuilder.append(k);
        s = s + 1;                                                              // FIX
        return reverseString(sBuilder.toString());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();

        //use test.sumUpTo(__)  or test.reverseString(___) to test
        System.out.println(test.sumUpTo(5));
        System.out.println(test.reverseString("dog"));
    }
}
