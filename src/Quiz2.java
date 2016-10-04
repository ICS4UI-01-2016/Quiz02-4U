
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ajay Dhillon
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
        if(n==0)
        {
            return 0;
        }else{
            return n+sumUpTo(n-1);
        }      
                
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        if(word.length() ==1){
            return word;
        }else{
            String a = word.substring(0, word.length() - 1);
            String j = word.substring(word.length()-1);
            return j + reverseString(a);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
         Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println(test.sumUpTo(3));
        System.out.println(test.reverseString(word));
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        
    }
    
}
