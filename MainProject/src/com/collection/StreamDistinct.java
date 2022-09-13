package com.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,2,4,3,5,6,8,2,5);
		
		List<Integer>newlist = list.stream().distinct().collect(Collectors.toList());
		//long newlist = list.stream().distinct().count();
		System.out.println(newlist);
	}
}
