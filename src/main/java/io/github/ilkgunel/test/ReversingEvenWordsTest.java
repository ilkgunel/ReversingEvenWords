package io.github.ilkgunel.test;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import io.github.ilkgunel.reversingevenwords.ReadingFromFile;
import io.github.ilkgunel.reversingevenwords.WriteToFile;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
*
* @author İlkay Günel
*/

public class ReversingEvenWordsTest {
	String fileName = "words.txt";
	
	@Before
	public void isFileExisting(){
		File file = new File(fileName);
		assertTrue("Failure - File must be existing!", file.exists());
	}
	
	@Test
	public void testForReadingFile(){
		assertNotNull("The array can't be null!", new ReadingFromFile().readFromFile(fileName));
	}
	
	@Test
	public void testForWritingToFile(){
		assertTrue("Needed value is True! Error On Writing To File!",
				new WriteToFile().wirteContent(new ReadingFromFile().readFromFile(fileName)));
	}
}
