/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Joudrey
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
        //Created a method to add the sum of the numbers counting up til the said number
        if (n == 0) {
            return 0;
            //if the number is zero return 0
        }
        return n + sumUpTo(n - 1);
        //else return the said number added to a number less than the said number inputted back into the method
    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word) {
        //created a new method to return the reverse the order of the characters in a string
        if (word.length() == 1) {
            return word;
            //if the length of the word is one return the word as is
        } else {
            return reverseString(word.substring(1)) + word.charAt(0);
            //else return the given string without the first leter returned back into the method added to the first letter of the original string
        }


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        System.out.println(test.sumUpTo(5));
        System.out.println(test.sumUpTo(3));
        System.out.println(test.sumUpTo(10));
        System.out.println(test.sumUpTo(0));
        System.out.println(test.reverseString("cat"));
        System.out.println(test.reverseString("doggie"));
        System.out.println(test.reverseString("mississippi"));
        //use test.sumUpTo(__)  or test.reverseString(___) to test

    }
}
