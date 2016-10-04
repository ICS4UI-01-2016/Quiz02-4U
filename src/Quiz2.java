/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
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
        //base case
        if (n == 0) { //if the number entered is 0, return 0
            return 0;
        } else { //otherwise
            return n + sumUpTo(n - 1); //return the value of the number entered plus the method called again using the numbed minus 1
        }



    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word) {

        //create base case
        if (word.length() == 1) { //if the word is only one character long
            return word; //return the one letter word
        } else { //otherwise
            return reverseString(word.substring(1)) + word.charAt(0); //return method using the section of the word that includes everything except the first letter plus the current first letter on the end of it
        }


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();

        System.out.println(test.sumUpTo(5));

        System.out.println(test.reverseString("potstotoeyp"));
        //use test.sumUpTo(__)  or test.reverseString(___) to test

    }
}
