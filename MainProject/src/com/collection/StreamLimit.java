package com.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimit {
	public static void main(String[] args) {
		
		List<String> name =Arrays.asList("Bhagyashree","Shital","Nikita","Dipali");
		List<String> limit = name.stream().limit(3).collect(Collectors.toList());
		System.out.println(limit);
	    // name .stream().limit(3).forEach(s ->System.out.println(s));
	}

}
