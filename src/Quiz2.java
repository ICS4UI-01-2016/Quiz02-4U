/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon Richards
 */
public class Quiz2 {

    /**
     * Takes in a number and calculates the sum from 1 to that number
     * Example: sumUpTo(5) would return 15
     * Because 1 + 2 + 3 + 4 + 5 = 15
     * 
     * @param n the number to sum up to
     * @return 
     */
    public int sumUpTo(int n){
        // BASE CASE
        // Recursed all the way down to a value of 0 and therefore should return itself
        if(n < 1){
            return n;
        }
        
        // CALL ON ITSELF
        // CHANGED STATE
        // Recursively return sumUpTo while changing the state of n by subracting by 1
        // each time until it hits base case and adding the value for n 
        return sumUpTo(n - 1) + n;
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        // BASE CASE
        // Recursed all the way down to a word length of 0 and therefore should return the word
        if(word.length() < 1){
            return word;
        }
        
        // CALL ON ITSELF
        // CHANGED STATE
        // Recursively return reverseString while changing the state of the word by chopping off the first letter
        // each time until it hits base case and adding the first letter on the end of the string
        return reverseString(word.substring(1, word.length())) + word.charAt(0);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        
        // Tests
        // Call on both methods with a specific parameter and output a value
        // use test.sumUpTo(__)  or test.reverseString(___) to test
        System.out.println("Question 1: " + test.sumUpTo(0));
        System.out.println("Question 1: " + test.sumUpTo(1));
        System.out.println("Question 1: " + test.sumUpTo(3));
        System.out.println("Question 1: " + test.sumUpTo(5));
        System.out.println("Question 1: " + test.sumUpTo(10));
        
        System.out.println("Question 2: " + test.reverseString(""));
        System.out.println("Question 2: " + test.reverseString("a"));
        System.out.println("Question 2: " + test.reverseString("cat"));
        System.out.println("Question 2: " + test.reverseString("doggie"));
        System.out.println("Question 2: " + test.reverseString("mississippi"));
    }
    
}
