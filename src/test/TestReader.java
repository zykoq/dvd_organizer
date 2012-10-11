package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import reader.Reader;

public class TestReader {

	@Test
	public void testReadFile() {
		Reader reader = new Reader();
		assertEquals("Could not read File", reader.readFile(null), 0);
	}
}
