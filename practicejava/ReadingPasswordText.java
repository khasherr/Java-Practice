package practicejava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This program reads from passwords from textfile and checks conditions
 * 
 * @author Sher Khan
 */
public class ReadingPasswordText {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // file path 
        String filename = "C:\\password\\passwords.txt";
        //array to hold 8 passwords from textfile
        String [] passwords = new String [8];
        File file = new File(filename);

            try {
                BufferedReader br = new BufferedReader(new FileReader(filename));
                for (int lineCount = 0; lineCount < passwords.length; lineCount++) { 
                   passwords[lineCount]  = br.readLine();
                }
           
             //exceptions 
            } catch (FileNotFoundException ex) {
                System.out.println("file not found");
            } catch (IOException ex) {
                System.out.println("could not open the file");
            }
            
            // prints out passwords
             for (String password : passwords){ 
                 System.out.println(password);
             
                 //transversing through array of passwords
             for (int counter = 0; counter < password.length(); counter++){ 
                 
                 // condition 1 - contains numbers
                 if ("0123456789".contains(password.substring(counter, counter+1))){ 
                     System.out.println("there exist number at index" + " " + counter);
                     System.out.println("*********************************************");
                 }
                 
                 //condition 2 - contains alpha
                 if("abcdefghijklmnopqrstuvwxyz".contains(password.substring(counter, counter+1))){ 
                     System.out.println("there exit an alphabet at index" + " "  + counter);
                     System.out.println("**********************************************");
                     
                 }
                 
                 //condition 3 - contains special characters 
                 if("!@#$%^&*)(-+_~{}[]".contains(password.substring(counter, counter+1))){
                     System.out.println("there exist an special character at index" + " "  +  counter);
                     System.out.println("*****************************************************");
                 }
                 
                 
             }
            }
            
            
    } 
} 

   
    
       
    
