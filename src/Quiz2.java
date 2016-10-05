/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hunter Coulis(Prodigy24)
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
        //If N is equal to 1 or 0, there is nothing to return except n.
        if(n == 1 || n == 0){
            return n;
        }
        //Until N becomes 0, restart the recursion method, adding up the value of N
        return n + sumUpTo(n - 1);
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        //If the word is 1 letter long, there is nothing that can be done with it
        if(word.length() == 1){
            return word;
        }
        //Cut off the last letter
        String LLetter = word.substring(word.length()-1);
        //Rearrange letters into reverse
        String ReverseO = word.substring(0, word.length()-1);
        //Send rearranged letters back through
        return LLetter + reverseString(ReverseO);
    }
        
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        System.out.println("Question 1: " + test.sumUpTo(10));
        System.out.println("Question 2: " + test.reverseString("mississippi"));
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        
    }
    
}
