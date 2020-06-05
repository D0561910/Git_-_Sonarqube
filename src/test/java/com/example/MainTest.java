package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link Main}.
 *
 * @author Charles@example.com (Author)
 */
@RunWith(JUnit4.class)
public class MainTest {

    @Test
	public void testCheckTriangle1() {
		Main test = new Main();
		assertEquals("是直角三角形", test.checkTriangle(3, 4, 5));
	}

	@Test
	public void testCheckTriangle2() {
		Main test = new Main();
		assertEquals("三条边不能构成三角形", test.checkTriangle(-3, -4, -5));
	}

	@Test
	public void testCheckTriangle3() {
		Main test = new Main();
		assertEquals("三条边不能构成三角形", test.checkTriangle(-5, 12, -13));
	}

	@Test
	public void testCheckTriangle4() {
		Main test = new Main();
		assertEquals("是等腰三角形", test.checkTriangle(3, 3, 4));
	}

	@Test
	public void testCheckTriangle5() {
		Main test = new Main();
		assertEquals("三条边不能构成三角形", test.checkTriangle(3, -4, 4));
	}

	@Test
	public void testCheckTriangle6() {
		Main test = new Main();
		assertEquals("是等腰三角形", test.checkTriangle(3, 4, 3));
	}

	@Test
	public void testCheckTriangle7() {
		Main test = new Main();
		assertEquals("是等边三角形", test.checkTriangle(3, 3, 3));
	}

	@Test
	public void testCheckTriangle8() {
		Main test = new Main();
		assertEquals("三条边不能构成三角形", test.checkTriangle(1, 2, 4));
	}
}
