package com.studevs.experiment.myleetcodesolutions.solution.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsomorphicStringsTest {
	
	private final IsomorphicStrings bean = new IsomorphicStrings();
	
	@Test
	void isIsomorphic1() {
		assertTrue(this.bean.isIsomorphic("egg", "add"));
	}
	
	@Test
	void isIsomorphic2() {
		assertFalse(this.bean.isIsomorphic("foo", "bar"));
	}
	
	@Test
	void isIsomorphic3() {
		assertTrue(this.bean.isIsomorphic("paper", "title"));
	}
	
	@Test
	void isIsomorphic4() {
		assertFalse(this.bean.isIsomorphic("afabacp", "egekalk"));
	}
}