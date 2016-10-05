/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ross Malcolm
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
        //return n once the number is 0 (base case)
        if(n == 0){
         return n;  
        } 
        //return add the n value every time and return n 1 lower
        return n +sumUpTo(n-1);
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
     //once the word is 0 or 1 letter long, return it (base case)
     if(word.length() == 0 || word.length() == 1){       
     return word;
     } 
     //return the word with the first letter removed and added onto the end
     return reverseString(word.substring(1)) + word.charAt(0); 
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        //test question 1
        System.out.println(test.sumUpTo(5));
        //test question 2
        System.out.println(test.reverseString("hello"));
    }
    
}
