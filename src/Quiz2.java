/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khaled
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
    //the method used to call sumUpTo
    public int sumUpTo(int n){
        //once it reaches it finds a number it can work with, this is known as base case
        if(n == 0 || n == 1){
            return 1;
        }
        //the method caller, keeps calling method until the problem is solved, it adds previous number to next and so on 
        return sumUpTo(n-1) + n;
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    //The reverse string method 
    public String reverseString(String word){
        //returns the complete word once it has gone through every letter
        if(word.length() < 1){
           return word; 
        }
        
        //variable that takes all the word except for the last letter
        String firstPart = word.substring(0,word.length()-1);
        //variable that takes only the last letter 
        String lastLetter = word.substring(word.length()-1);
        //combines last letter to the rest of word and does it in a loop (METHOD CALLER)
        return lastLetter + reverseString(firstPart);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        System.out.println(test.sumUpTo(0));
        System.out.println(test.reverseString("L"));
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        
    }
    
}
