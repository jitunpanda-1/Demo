package com.jitun.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	/**
	 * https://github.com/joeyajames/Java/tree/master/Java%208%20Streams
	 * @param args
	 */
	public static void main(String[] args) {
		/*List<Integer> l1= new ArrayList<>();
		l1.add(0);
		l1.add(5);
		l1.add(10);
		l1.add(15);
		l1.add(20);
		l1.add(25);
		System.out.println(l1);
		List<Integer> l2 = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(l2);
		
		List<Integer> marks= new ArrayList<>();
		marks.add(0);
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		List<Integer> updatedMark = marks.stream().map(i->i+5).collect(Collectors.toList());
		
		System.out.println(updatedMark);*/
		
		
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		
		//Integer stream with skip
		IntStream.range(1, 10).skip(5).forEach(x-> System.out.print(x));
		System.out.println();
		
		//Integer stream with sum
		System.out.println("Sum of 1-5 :"+IntStream.range(1, 5).sum());
		
		//Stream.of , sorted, and findfirst
		Stream.of("java", "oracle", "aython").sorted().findFirst().ifPresent(System.out::print);
		System.out.println();
		
		// 5. Stream from Array, sort, filter and print
		String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
		Arrays.stream(names).filter(x->x.startsWith("S")).sorted().forEach(System.out::println);
		
		
		// 6. average of squares of an int array
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
					.map(x -> x * x)
					.average()
					.ifPresent(System.out::println);
	}

}
