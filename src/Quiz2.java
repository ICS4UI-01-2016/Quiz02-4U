
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William Prevel
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
    Scanner input = new Scanner(System.in);
    public int sumUpTo(int n){
        
        //if n is equal to 0, return 0
        if(n == 0){
            return n;
            // if n is equal to 1, return one
        }else if(n == 1){
            return n;
        }
        // take the number you inputted and adds the number previous all the way to 0
        return n + sumUpTo(n-1);
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        return word;
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Scanner input = new Scanner(System.in);
        Quiz2 tests = new Quiz2();
        System.out.println(tests.reverseString("cat"));
        
    }
    
}
