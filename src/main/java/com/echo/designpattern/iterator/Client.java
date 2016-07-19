package com.echo.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add("Hello");
		list.add("Mary");
		Collection collection = new ConcreteCollection(list);
		Iterator iter=collection.iterator();
		while(iter.hasNext()){
			String item=(String)iter.next();
			System.out.println(item);
		}
		
		System.out.println("Current item : "+iter.next());
		
		while(iter.hasNext()){
			String item=(String)iter.next();
			System.out.println(item);
		}
		
		
	}

}
