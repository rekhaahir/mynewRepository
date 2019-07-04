package com_5_6_19_practicals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Prac145 {
	public static <T> List<T> convertArrayToList(T array[]) {

		List<T> list = new ArrayList<>();

		Collections.addAll(list, array);

		return list;
	}

	public static void main(String args[]) {
		String array[] = { "a", "b", "c", "d" };
		System.out.println("Array" + Arrays.toString(array));
		List<String> list = convertArrayToList(array);
		System.out.println("List: " + list);
	}

}
