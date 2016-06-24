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
 * @author 010533
 */
public class WriteToFile {
    
    public void wirteContent(String [] array){
        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                  new FileOutputStream("reversedWords.txt"), "utf-8"));
            for(String s:array) {
                writer.write(s);
            }
        } catch (IOException ex) {
            System.err.println("An Error Occured! Error is:"+ex);
        } finally {
           try {writer.close();} catch (Exception ex) {/*ignore*/}
        }
    }
}
