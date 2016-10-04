/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
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
        // if number is 0
        if(n==0){
            // return number
            return n;
        }
        // returns the sum from 1 to number
        return n + sumUpTo(n-1);
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){   
        // if word has 1 letter
        if(word.length() == 1){
            // return the letter
            return word;
        }
        // stores the last letter of the word
        String last = word.substring(word.length()-1);
        // arranges the letters into reverse
        String reverse = word.substring(0,word.length()-1);
        // return the rearranged letters
        return last + reverseString(reverse);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        System.out.println(test.sumUpTo(10));
        System.out.println(test.reverseString("mississippi"));
    }
    
}
