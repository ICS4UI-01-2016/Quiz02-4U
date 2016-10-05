/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan Preece
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
        //base case
        if(n == 0){
            return 0;
        }
        
        //get the sum up to n (return statement)
        return n + sumUpTo(n - 1);
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        //base case
        if(word.length() == 1 || word.length() == 0){
            return word;
        }
     
        //reverse the first and last letter
        int x = word.charAt(0);
        int y = word.charAt(word.length() - 1);
        
        
        //return statement
        return word.substring(y, x);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        Quiz2 test2 = new Quiz2();
        
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        System.out.println(test.sumUpTo(5));
        System.out.println(test2.reverseString("cat"));
    }
    
}
