/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin yu
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
        //base case for if n equals 0, whch means there is nothing left to add onto sum
        if(n == 0){
            //return n(or 0)
            return n;
        }
        //return the first value of n, followed by adding the recursive function of n-1
        return n + sumUpTo(n-1);
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        
        //create middle integer that divides the length of the s string by 2, to find how many spots the word has left
        int middle = word.length() / 2;
        
        //base case for when the method reaches the middle of the word/is done reversing word
        if (middle == 0) {
            //return true boolean, because the word is a palindrome
            return word;
        }
       //create string for holding the left most letter of the s string
        String firstLetter = word.substring(0, 1);
        //create string for holding the right most letter of the s string
        String lastLetter = word.substring(word.length() - 1, word.length());
        
        //return the last letter in the first position, and the first letter in the last position to perform swap
        //and add the recursive swapping of the next set of letters in, placed in the middle of the
       //last and first letter
        return lastLetter + reverseString(word.substring(1, word.length() - 1)) + firstLetter;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        
        System.out.println(test.sumUpTo(5));
        System.out.println(test.reverseString("nam noitaripsni eht sined"));
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        
    }
    
}
