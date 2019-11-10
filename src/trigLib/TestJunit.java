package trigLib;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	@SuppressWarnings("deprecation")
	@Test
	public void testSetup() {

		assertEquals(Main.sin(Main.Pi/2), 1,0.1);
		assertEquals(Main.cos(Main.Pi/2), 0,0.1);
		assertEquals(Main.tan(Main.Pi/4), 1,0.1);
		
	}
}
