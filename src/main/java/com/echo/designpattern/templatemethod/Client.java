package com.echo.designpattern.templatemethod;

public class Client {
public static void main(String[] args) {
	//Template template=new ConcreteTemplate();
	Template template=new ConcreteTemplateB();
	template.templateMethod();
}
}
