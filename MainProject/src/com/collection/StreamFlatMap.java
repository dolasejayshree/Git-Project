package com.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {

	public static void main(String[] args) {
		
		List<Integer> numlist = Arrays.asList(1,3,4,52,3,1,2);
		
	    List<Integer> numset =  Arrays.asList(10,20,30);
		
		List<List<Integer>> newset = Arrays.asList(numlist,numset);
		
		List<Integer> fun = newset.stream().flatMap( n -> n.stream()).map(s ->s*3).collect(Collectors.toList());
		System.out.println(fun);
	}
}
