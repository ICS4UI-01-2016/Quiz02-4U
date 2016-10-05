/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheBigJ77
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
        
        //if the length if equal to 1 or 0 return the number
        if(n==0 || n == 1){
            return n;
        }
        
        //return the number + each number before it
        return n + sumUpTo(n -1);
        
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        
        //if the length of the word is 0 or 1 return the word
        if (word.length() == 0 || word.length() == 1) 
         return word;

        //take all the letters except for the last one and keep putting it in fron of the one that wasnt taken 
    return reverseString(word.substring(1)) + word.charAt(0);
        
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        
        //test sumUpTo
         int num = test.sumUpTo(3);
         
         //output the result
        System.out.println(num);
        
        //test reverseString
        String words = test.reverseString("kip");
        //output result
        System.out.println(words);
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        
    }
    
}
