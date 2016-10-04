/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muntake Lali
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
        //if the the integr is 0 , return 0
        if(n==0){
        return 0;
    }
        //return the the number plus every number lower than that number, added all together 
        return n + sumUpTo(n-1);
        
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        //set new string to store reversed string in it 
        String reverse="";
        //if the length of the word in 1, the then return the string itself
        if(word.length()==1){
            //return word
            return word;
        }
        else{
            // take the last letter of the string, and add it to the string read backwards and store it in string 
           reverse = word.charAt(word.length()-1)+reverseString(word.substring(0,word.length()-1));
           //return the word backwards
              return reverse;      
 
          
        }
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        //test for sum up method and print to screen
        System.out.println(test.sumUpTo(5));
        //test for reverse string method and print to screen
        System.out.println(test.reverseString("cat"));
        
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        
    }
    
}
