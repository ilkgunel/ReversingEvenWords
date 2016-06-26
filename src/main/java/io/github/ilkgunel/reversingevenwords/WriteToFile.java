/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.ilkgunel.reversingevenwords;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;


/**
 *
 * @author İlkay Günel
 */
public class WriteToFile {
    
    public boolean wirteContent(String [] array){
        Writer writer = null;
        boolean returnedValue = false;
        
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                  new FileOutputStream("reversedWords.txt"), "utf-8"));
            for(String s:array) {
                writer.write(s);
            }
            returnedValue = true;
        } 
        
        catch (IOException ex) {
            System.err.println("An Error Occured! Error is:"+ex);
            returnedValue = false;
        } 
        
        finally {
           try {
        	   writer.close();
           } 
           catch (Exception ex) {
        	   System.err.println("writer object couldn't close!");
           }
        }
        return returnedValue;
    }
}
