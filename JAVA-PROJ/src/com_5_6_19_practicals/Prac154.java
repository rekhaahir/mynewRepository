package com_5_6_19_practicals;

import java.util.HashMap;
import java.util.Map;

public class Prac154 {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("1", "hi");
		m.put("2", "hello");
		m.put("3", "world");
		for (Map.Entry entry : m.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

}
