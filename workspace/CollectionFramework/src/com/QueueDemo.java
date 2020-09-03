package com;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
	PriorityQueue pq = new PriorityQueue();
	pq.add(3);
	pq.add(4);
	pq.add(1);
	pq.add(5);
	pq.add(2);
System.out.println(pq);
System.out.println("Remove "+pq.poll());
System.out.println(pq);
System.out.println("Remove "+pq.poll());
System.out.println(pq);
System.out.println("Remove "+pq.poll());
	}

}
