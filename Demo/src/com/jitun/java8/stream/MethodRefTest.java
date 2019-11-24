package com.jitun.java8.stream;

import java.util.Arrays;
import java.util.List;

public class MethodRefTest {

	public static void main(String[] args) {
		List<String> name= Arrays.asList("java","oracle","angular","cobol");
		
		name.forEach(str-> System.out.println(str));
		name.forEach(System.out::println);

		MyPrinter myPrinter= new MyPrinter();
		
		//for static method we need the full class name eg: StringParser else use the object for instance method
		myPrinter.print("Jitun", StringParser::convert );
		
		//for instance method belwo is the example eg: StringParser else use the object for instance method
		/*StringParser parser=new StringParser();
		myPrinter.print("Jitun", parser::convert );*/
	}

}

interface Parser{
	String parse(String str);
}

class StringParser{
	public static String convert(String s) {
		if (s.length()<3) {
			return s.toUpperCase();
		} else {
			return s.toLowerCase();
		}
	}
}
class MyPrinter{
	public void print(String str, Parser parser) {
		str=parser.parse(str);
		System.out.println(str);
	}
}
