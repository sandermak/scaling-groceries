package com.picnic.groceries;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ErrorProneDemo {

	public static void main(String[] args) {
		new IllegalArgumentException();
	}

	public static List<String> oldCode() {
		var list = Stream.of(Optional.of("Hello"), Optional.of("World"));

		return list.filter(Optional::isPresent)
				   .map(Optional::get)
				   .collect(Collectors.toList());
	}

}
