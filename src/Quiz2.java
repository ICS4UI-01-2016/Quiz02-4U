
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josh Butler
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
        if(n<=1){
            return n;
        }
        //add it to what the lower case is
        return n + sumUpTo(n-1);
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        //base cases
        if(word.length()==1){
            return word;
        }else if(word.length()==2){
            return "" + word.charAt(1) + word.charAt(0);
        }
        //call to solve the smaller problem.
        return word.charAt(word.length()-1) + reverseString(word.substring(1, word.length()-1)) + word.charAt(0);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        Scanner in = new Scanner(System.in);
        System.out.println(test.reverseString(in.nextLine()));
    }
    
}
