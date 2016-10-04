/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Katrina
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
        // base case - if the number is 1 return 1
        if(n == 1){
            return 1;
        }
        // recusive part - make the number smaller by 1
        return sumUpTo(n - 1) + n;
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        // base case - once the word is less than 2 stop the recursion
        if(word.length() < 2){
            return word;
        } 
        // recursive part - take the first letter of the word and add it to the end
        char w = word.charAt(0);
        return reverseString(word.substring(1)) + w;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        
        System.out.println("sumUpTo: ");
        System.out.println(test.sumUpTo(5));
        
        System.out.println("reverseString: ");
        System.out.println(test.reverseString("computer"));
    }
    
}
