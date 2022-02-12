package com.studevs.experiment.myleetcodesolutions.solution.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsomorphicStringsTest {
	
	private final IsomorphicStrings bean = new IsomorphicStrings();
	
	@Test
	void isIsomorphic1() {
		assertTrue(bean.isIsomorphic("egg", "add"));
	}
	
	@Test
	void isIsomorphic2() {
		assertFalse(bean.isIsomorphic("foo", "bar"));
	}
	
	@Test
	void isIsomorphic3() {
		assertTrue(bean.isIsomorphic("paper", "title"));
	}
	
	@Test
	void isIsomorphic4() {
		assertFalse(bean.isIsomorphic("afabacp", "egekalk"));
	}
}