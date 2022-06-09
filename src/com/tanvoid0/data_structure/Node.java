package com.tanvoid0.data_structure;

import java.util.HashMap;
import java.util.Map;

class App {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    Node head = null;
    CustomLinkedList list = new CustomLinkedList();
    list.insertArray(head, nums);
    list.removeNthFromEnd(head, 2);
    list.display();
  }
}

class CustomLinkedList {
  private Node head;

  public void insert(int data) {
    Node newNode = new Node(data);
    if (this.head == null)
      head = newNode;
    else {
      Node currentNode = head;
      while(currentNode.getNext() != null)
        currentNode = currentNode.getNext();
      currentNode.setNext(newNode);
    }
  }

  public void insertArray(Node head, int[] nums) {
    Node current = new Node();
    for(int i=0; i<nums.length; i++) {
      Node temp = new Node(nums[i]);
      current.setNext(temp);
      current = current.getNext();
    }
  }

  public void insertAt(int index, int data) {
    Node nodeToBeInserted = new Node(data);
    Node node = head;
    for (int i=0; i<index-1; i++) {
      node = node.getNext();
    }
    nodeToBeInserted.setNext(node.getNext());
    node.setNext(nodeToBeInserted);
  }

  public void deleteNodeAt(int index) {
    Node node = head;
    for (int i=0; i<index-1; i++) {
      node = node.getNext();
    }
    node.setNext(node.getNext().getNext());
  }

  public Node removeNthFromEnd(Node head, int n) {
    if (head != null) {
      int size = 1;
      Node current = head;

      // Determine list size
      while(current.getNext() != null) {
        current = current.getNext();
        size++;
      }

      // item to be removed
      size = size - n;
      current = head;
      for (int i=0; i<size; i++) {
        current = current.getNext();
      }

      current = current.getNext();
    }
    return head;
  }

  public void display() {
    if (head !=null) {
      Node currentNode = head;
      while(currentNode.getNext() !=null) {
        System.out.println(currentNode.getData());
        currentNode = currentNode.getNext();
      }
      System.out.println(currentNode.getData());
    }
  }

  public Node reverse() {
    Node previous = null;
    Node current = head;
    Node next;

    while (current != null) {
      next = current.getNext();
      current.setNext(previous);
      previous = current;
      current = next;
    }
    return previous;
  }

  public boolean checkLoop() {
    boolean loopExists = false;
    Map<Node, Integer> map = new HashMap<>();
    Node tempNode = head;
    while(tempNode != null) {
      if(map.get(tempNode) == null){
        map.put(tempNode, 1);
      } else {
        map.put(tempNode, 2);
        loopExists = true;
        break;
      }
      tempNode = tempNode.getNext();
    }
    return loopExists;
  }
}



class Node {
  private int data;
  private Node next;

  public Node (int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}