/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
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
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        //make int for the original number
        int original = n;

        //take the original number and sub 1 off
        int add = n - 1;

        //add the original to the number that is original-1
        //return
        return original + sumUpTo(add);
    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word) {
        //create int for length of string
        int length = word.length();
        //base case
        if (length == 1 || word == "") {
            return word;
        }

        //create string builder to modify the string
        StringBuilder sBuilder = new StringBuilder(word);
        
        //create new string with reversed letters
        String reverse = new String();
        
        
        //for sBuilder.charAt(length); detach and move to reverse, remove last char and add to reverse until all done
        //remove last letter
        sBuilder.deleteCharAt(length - 1);
        
        //remove first letter
        sBuilder.deleteCharAt(0);
        
        //return the string so that each letter can be reversed.
        return reverseString(sBuilder.toString());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();

        //use test.sumUpTo(__)  or test.reverseString(___) to test
        System.out.println("Q1: " + test.sumUpTo(5));

        System.out.println("Q2: " + test.reverseString("wowzer"));
    }
}
