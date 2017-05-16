package com.rajesh.algos.test;

import org.junit.Test;

import com.rajesh.algos.MyLinkedList;

public class LinkedListTest 
{ 
	@Test
	public void testCyclic(String args[]) 
	{ 
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.appendIntoTail(new MyLinkedList.Node("101"));
		linkedList.appendIntoTail(new MyLinkedList.Node("201"));
		linkedList.appendIntoTail(new MyLinkedList.Node("301"));
		linkedList.appendIntoTail(new MyLinkedList.Node("401"));
		System.out.println("Linked List : " + linkedList);
		if(linkedList.isCyclic())
			{
				System.out.println("Linked List is cyclic as it contains cycles or loop"); 
			}else
			{ 
				System.out.println("LinkedList is not cyclic, no loop or cycle found");
			}
		} 
}

