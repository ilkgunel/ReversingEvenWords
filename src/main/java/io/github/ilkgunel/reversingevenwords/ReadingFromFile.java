package io.github.ilkgunel.reversingevenwords;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author İlkay Günel
 */

public class ReadingFromFile {

	public String[] readFromFile(final String fileName) {
		String[] arrayOfWords = {};
		BufferedReader bufferedReader;
		try {
			final FileInputStream fis = new FileInputStream(fileName);
			// bufferedReader = new BufferedReader(new FileReader("words.txt"));
			bufferedReader = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
			final StringBuilder stringBuilder = new StringBuilder();
			String line = bufferedReader.readLine();

			while (line != null) {
				stringBuilder.append(line);
				stringBuilder.append(System.lineSeparator());
				line = bufferedReader.readLine();
			}

			final String allOfFile = stringBuilder.toString();

			System.out.println("File Content is \n:" + allOfFile);

			arrayOfWords = allOfFile.split(" ");

			for (int i = 0; i < arrayOfWords.length; i++) {
				if (i >= 0 && (i % 2) == 1) {
					arrayOfWords[i] = new StringBuffer(arrayOfWords[i]).reverse().toString();
				}
			}

			for (final String s : arrayOfWords) {
				System.out.print(s);
			}
		} catch (final IOException e) {
			System.out.println("An Error Occured! Error is:" + e);
		}
		return arrayOfWords;
	}
}
