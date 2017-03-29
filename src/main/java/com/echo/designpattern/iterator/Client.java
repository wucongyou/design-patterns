package com.echo.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add("Mary");
        ICollection collection = new CollectionImpl(list);
        IIterator iter = collection.iterator();
        while (iter.hasNext()) {
            String item = (String) iter.next();
            System.out.println(item);
        }

        System.out.println("Current item : " + iter.next());

        while (iter.hasNext()) {
            String item = (String) iter.next();
            System.out.println(item);
        }


    }

}
