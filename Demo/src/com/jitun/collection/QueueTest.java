package com.jitun.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest extends Inherit{
	

	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		super.m1();
	}

	public 	QueueTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Queue<Integer> queue= new PriorityQueue<Integer>();
		
		queue.offer(6);
		queue.offer(5);
		queue.offer(7);
		queue.offer(5);
		
//		System.out.println(queue);
		
//		System.out.println((int)Math.abs(12.50f));
		System.out.println();//getExponent(12.50)
		PriorityQueue<Integer> priorityQueue= new PriorityQueue<>();
		priorityQueue.offer(5);
		priorityQueue.offer(6);
		priorityQueue.offer(8);
		priorityQueue.offer(4);
		
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.element());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue);
		
		
	}

}
