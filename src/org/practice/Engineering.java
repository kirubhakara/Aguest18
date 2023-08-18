package org.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Engineering {
public static void main(String[] args) {
	Map<Character,String>m = new LinkedHashMap();
	m.put('A', "Anu");
	m.put('B', "Banu");
	m.put('1', "Kala");
	m.put('7', "Sri");
	m.put('C', "Sam");
	m.put('B', "Balu");
	m.put('3', "Anu");
	for(int i=0;i<m.size();i++) {
	if(m.values().equals("Sam")) {
		m.remove(m.values().equals("Sam"));
	}
	
	System.out.println(m);
}

}}


