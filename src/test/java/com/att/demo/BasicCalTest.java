package com.att.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author ParthasarathyShanmug
 *
 */
class BasicCalTest {

	private BasicCal basicCal = new BasicCal();

	@Test
	void testAdd() {
		assertEquals("11", String.valueOf(basicCal.checkOperation("5", "6", "ADD")));
	}

	@Test
	void testSub() {
		assertEquals("20", String.valueOf(basicCal.checkOperation("23", "3", "SUB")));
	}

	@Test
	void testMul() {
		assertEquals("90", String.valueOf(basicCal.checkOperation("45", "2", "MUL")));
	}

	@Test
	void testDiv() {
		assertEquals("10", String.valueOf(basicCal.checkOperation("30", "3", "DIV")));
	}

}
