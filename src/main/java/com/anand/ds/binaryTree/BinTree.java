/**
 * 
 */
package com.anand.ds.binaryTree;

import java.util.HashMap;

/**
 * @author U45999
 *
 */
class Node<T> {
	int key;
	String name;
	Node<T> leftChild;
	Node<T> rightChild;
	Node(int key,String name){
		this.key = key;
		this.name = name;
	}
	public String toString(){
		return "Node Name is :: "+name+" Has this Key :: "+key;
	}
}
public class BinTree {
	
	Node root;
	public void addNode(int key,String name){
		Node newNode = new Node(key,name);
		if(root==null){
			root = newNode;
		}else{
			Node focusNode = root;
			Node parent;
		}
	}
	
}
