/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.ilkgunel.reversingevenwords;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("İlkay Şaşırdın mı?");
        String [] arrayOfWords = {};
        try {
            BufferedReader bufferedReader;
            FileInputStream fis = new FileInputStream("words.txt");
            //bufferedReader = new BufferedReader(new FileReader("words.txt"));
            bufferedReader = new BufferedReader(new InputStreamReader( (InputStream) fis, "UTF-8"));
            StringBuilder stringBuilder = new StringBuilder();
            String line = bufferedReader.readLine();
            
            while(line!=null){
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
                line = bufferedReader.readLine();
            }
            
            String allOfFile = stringBuilder.toString();
            
            System.out.println("File Content is \n:"+allOfFile);
            
            arrayOfWords = allOfFile.split(" ");
            
            for(int i=0;i<arrayOfWords.length;i++){
                if(i>=0 && (i%2)==1){ 
                    arrayOfWords[i] = new StringBuffer(arrayOfWords[i]).reverse().toString();
                }
            }
            
            for(String s : arrayOfWords){
                System.out.print(s);
            }
        } 
        catch (IOException e) {
            System.out.println("An Error Occured! Error is:"+e);
        }
        
        try {
            WriteToFile writeToFile = new WriteToFile();
        writeToFile.wirteContent(arrayOfWords);
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        
    }
}
