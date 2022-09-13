package com.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCount {

	public static void main(String [] args) {
		
		List<String> vehicle = Arrays.asList("Bus","Car","Bus","Bike","Car","Flight");
		
		long newvheicle = vehicle.stream().count();
		System.out.println(newvheicle);
	}
}
