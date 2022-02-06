package com.studevs.experiment.myleetcodesolutions.solution.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMinimumInRotatedSortedArrayTest {
	
	private FindMinimumInRotatedSortedArray bean = new FindMinimumInRotatedSortedArray();
	
	@Test
	void findMin1() {
		int[] nums = {5, 6, 7, 1, 2, 3, 4};
		assertEquals(1, bean.findMin(nums));
	}
	
	@Test
	void findMin2() {
		int[] nums = {3, 4, 5, 1, 2};
		assertEquals(1, bean.findMin(nums));
	}
	
	@Test
	void findMin3() {
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		assertEquals(0, bean.findMin(nums));
	}
	
	@Test
	void findMin4() {
		int[] nums = {11, 13, 15, 17};
		assertEquals(11, bean.findMin(nums));
	}
	
	
	@Test
	void findMin5() {
		int[] nums = {2, 3, 1};
		assertEquals(1, bean.findMin(nums));
	}
}