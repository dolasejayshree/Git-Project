package com.collection;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamFilter {

	


	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(1,2,3,4,53,2,5,6);
		
		List<Integer>  newlist = list.stream().filter(n ->n%2==0).collect(Collectors.toList());
	     System.out.println(newlist);
	}
	}

