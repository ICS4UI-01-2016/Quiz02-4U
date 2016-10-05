/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riley Voigt
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
        
       //if n is 0 or 1
        if (n == 0 || n == 1) {
            return 1;
        }
        //return the number + the number previous
        return n + sumUpTo(n - 1);
    }
    

    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        //if the word is nothing or 1 or less letters return word
        if((word==null)||(word.length()<= 1)){
        return word;
        
    }
        //take the last letter and add it to the word string and continue 
         return reverseString(word.substring(1)) + word.charAt(0);
        
        
        
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        
        //test.sumUpTo(__)  or 
        System.out.println("Q1: " + test.sumUpTo(5));
        System.out.println("Q2: " + test.reverseString("ross"));
        
    }
    
}
