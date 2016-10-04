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
        if(n == 0){
         return n;  
        }       
        return n +sumUpTo(n-1);
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){ 
     int n = word.length();
     if(word.length() == 0 || word.length() == 1){       
     return word;
     }else{  
//      return word.charAt(0) + word.charAt(n-1);
     }return reverseString (word.substring(1 , n-1)); 
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        System.out.println(test.sumUpTo(5));
        System.out.println(test.reverseString("hello"));
    }
    
}
