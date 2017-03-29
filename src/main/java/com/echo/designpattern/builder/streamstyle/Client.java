package com.echo.designpattern.builder.streamstyle;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午9:33
 */
public class Client {

    public static void main(String[] args) {
        Contact jd = Contact.builder("John", "Doe")
            .phone("fake number")
            .address("fake address")
            .build();
        System.out.println(jd);
    }
}
