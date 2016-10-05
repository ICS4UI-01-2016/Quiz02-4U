/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fostp4040
 */
public class Quiz {
/**
      * Takes in a number and calculates the sum from 1 to that number
      * Example: sumUpTo(5) would return 15
      * Because 1 + 2 + 3 + 4 + 5 = 15
      * 
      * @param n the number to sum up to
      * @return 
      */
     public int sumUpTo(int n){
         /*
          * if number is 0, return as 0
          */
         if(n==0){
             return 0;
         }
         /*
          * take number and add up every number up to that number 
          */
         return (n+sumUpTo(n-1));
     }
     
     /**
      * Takes in a String and returns the same String in reverse
      * 
      * @param word the word to be reversed
      * @return the input word reversed
      */
     public String reverseString(String word){
         String last = word.substring(word.length()-1,word.length());
         String first = word.substring(0,1);
         String middle = word.substring(word.length()%2/2);
         
         return last+middle+first;
         
     }
     
     
     
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
         // Use this section for conducting tests
         Quiz test = new Quiz();
         System.out.println(test.sumUpTo(5));
         System.out.println(test.reverseString("cat"));
         //use test.sumUpTo(__)  or test.reverseString(___) to test
         
     }
     
 }
