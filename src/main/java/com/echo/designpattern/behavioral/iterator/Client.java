package com.echo.designpattern.behavioral.iterator;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午12:52
 */

public class Client {

    public static void main(String[] args) {
        Collect<String> c = new ListImpl<>();
        c.add("pen", "pie", "apple", "pen");

        Iter<String> iter = c.iter();

        // iterate for the 1st time
        iterAndCheck(iter, c);

        // check the iter has reach end
        if (iter.next() != null) {
            throw new RuntimeException("iter does not reach end");
        }

        // iterate for the 2nd time
        iterAndCheck(iter, c);
    }

    private static void iterAndCheck(Iter<String> iter, Collect<String> c) {
        String item;
        String expected;
        int i = 0;
        while (iter.hasNext()) {
            expected = c.get(i);
            item = iter.next();
            if (!expected.equals(item)) {
                throw new RuntimeException(String.format("item %d is incorrect, expect %s but got %s", i, expected, item));
            }
            i++;
        }
    }
}
