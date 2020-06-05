package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
// import org.junit.Ignore;
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
}
