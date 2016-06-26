/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.ilkgunel.reversingevenwords;

/**
 *
 * @author İlkay Günel
 */

public class MainClass {
	public static void main(final String[] args) {
		final ReadingFromFile readingFromFile = new ReadingFromFile();
		final WriteToFile writeToFile = new WriteToFile();

		try {
			writeToFile.wirteContent(readingFromFile.readFromFile("words.txt"));
		} catch (final Exception e) {
			System.out.println("Error:" + e);
		}

	}
}
