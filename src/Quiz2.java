/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carter snowden
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
        // formula to find the right number
        if(n == 0 || n == 1){
             return 1;
         }
        //taking 1 number off then adding it to the original number
         return sumUpTo(n-1) + n;
         
    }         
    
 
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
    //creating a formula to sort the letters and return the word
    if((word==null)|| (word.length()<=1)){

    return word;
}
    // returning the reverse string
    return reverseString(word.substring(1)) + word.charAt(0);
       
    


}



    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        
        // conducting tests
        System.out.println("Q1. " + test.sumUpTo(5));
        System.out.println("Q2. " + test.reverseString("ab"));
    }
}
        
        //use test.sumUpTo(__)  or test.reverseString(___) to test
           
    
 
         

    
   

