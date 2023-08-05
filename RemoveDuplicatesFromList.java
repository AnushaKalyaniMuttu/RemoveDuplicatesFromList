package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

	public static void main (String [] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,1,2,3);
		list.stream().distinct().collect(Collectors.toList()).forEach(System.out::print);
		list.stream().collect(Collectors.toSet()).forEach(System.out::print);
	}
}
