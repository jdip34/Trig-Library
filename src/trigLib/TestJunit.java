package trigLib;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	@Test
	public void testSetup() {
		testSin();
		testCos();
		testTan();
	}

	public void testSin() {
		assertEquals(0.5, Main.sin(Main.Pi / 6), 0.1);
		assertEquals(0.707, Main.sin(Main.Pi / 4), 0.1);
		assertEquals(0.866, Main.sin(Main.Pi / 3), 0.1);
		assertEquals(1, Main.sin(Main.Pi / 2), 0.1);
		assertEquals(0.5, Main.sin((5 * Main.Pi) / 6), 0.1);
		assertEquals(0.707, Main.sin((3 * Main.Pi / 4)), 0.1);
		assertEquals(0.866, Main.sin((2 * Main.Pi) / 3), 0.1);
		assertEquals(0, Main.sin(Main.Pi), 0.1);
		assertEquals(-0.5, Main.sin((7 * Main.Pi) / 6), 0.1);
		assertEquals(-0.707, Main.sin((5 * Main.Pi) / 4), 0.1);
		assertEquals(-0.866, Main.sin((4 * Main.Pi) / 3), 0.1);
		assertEquals(1, Main.sin((3 * Main.Pi) / 2), 0.1);
		assertEquals(-0.5, Main.sin((11 * Main.Pi) / 6), 0.1);
		assertEquals(-0.707, Main.sin((7 * Main.Pi) / 4), 0.1);
		assertEquals(-0.866, Main.sin((5 * Main.Pi) / 3), 0.1);
		assertEquals(0, Main.sin(2 * Main.Pi), 0.1);
	}

	public void testCos() {
		assertEquals(0.866, Main.cos(Main.Pi / 6), 0.1);
		assertEquals(0.707, Main.cos(Main.Pi / 4), 0.1);
		assertEquals(0.5, Main.cos(Main.Pi / 3), 0.1);
		assertEquals(1, Main.cos(Main.Pi / 2), 0.1);
		assertEquals(-0.866, Main.cos((5 * Main.Pi) / 6), 0.1);
		assertEquals(-0.707, Main.cos((3 * Main.Pi / 4)), 0.1);
		assertEquals(-0.5, Main.cos((2 * Main.Pi) / 3), 0.1);
		assertEquals(0, Main.cos(Main.Pi), 0.1);
		assertEquals(-0.866, Main.cos((7 * Main.Pi) / 6), 0.1);
		assertEquals(-0.707, Main.cos((5 * Main.Pi) / 4), 0.1);
		assertEquals(-0.5, Main.cos((4 * Main.Pi) / 3), 0.1);
		assertEquals(1, Main.cos((3 * Main.Pi) / 2), 0.1);
		assertEquals(0.866, Main.cos((11 * Main.Pi) / 6), 0.1);
		assertEquals(0.707, Main.cos((7 * Main.Pi) / 4), 0.1);
		assertEquals(0.5, Main.cos((5 * Main.Pi) / 3), 0.1);
		assertEquals(0, Main.cos(2 * Main.Pi), 0.1);
	}

	public void testTan() {
		assertEquals(0.577, Main.cos(Main.Pi / 6), 0.1);
		assertEquals(1, Main.cos(Main.Pi / 4), 0.1);
		assertEquals(1.73, Main.cos(Main.Pi / 3), 0.1);
		assertEquals(1, Main.cos(Main.Pi / 2), 0.1);
		assertEquals(-0.577, Main.cos((5 * Main.Pi) / 6), 0.1);
		assertEquals(-1, Main.cos((3 * Main.Pi / 4)), 0.1);
		assertEquals(-1.73, Main.cos((2 * Main.Pi) / 3), 0.1);
		assertEquals(0, Main.cos(Main.Pi), 0.1);
		assertEquals(0.577, Main.cos((7 * Main.Pi) / 6), 0.1);
		assertEquals(1, Main.cos((5 * Main.Pi) / 4), 0.1);
		assertEquals(1.73, Main.cos((4 * Main.Pi) / 3), 0.1);
		assertEquals(1, Main.cos((3 * Main.Pi) / 2), 0.1);
		assertEquals(-0.577, Main.cos((11 * Main.Pi) / 6), 0.1);
		assertEquals(-1, Main.cos((7 * Main.Pi) / 4), 0.1);
		assertEquals(-1.73, Main.cos((5 * Main.Pi) / 3), 0.1);
		assertEquals(0, Main.cos(2 * Main.Pi), 0.1);
	}
}
