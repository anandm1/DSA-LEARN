/**
 * 
 */
package com.anand.ds.nonlinear.tree.bst;

/**
 * @author U45999
 *
 */
public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>{

	private Node<T> root;
	
	public void insert(T data){
		
		if(root==null){
			root = new Node<T>(data);
		}else{
			insertNode(data,root);
		}
	}
	
	@Override
	public void traversal() {
		// TODO Auto-generated method stub
		
	}

	
	private void insertNode(T newData,Node<T> node) {
		System.out.println("InserNode :: "+node);
		if(newData.compareTo(node.getData()) < 0){
			if(null != node.getLeftChild()){
				insertNode(newData,node.getLeftChild());
			}else{
				Node<T> newNode = new Node<T>(newData);
				node.setLeftChild(newNode);
			}
			
		}else if(newData.compareTo(node.getData()) >= 0){
			if(null!=node.getRightChild()){
				insertNode(newData,node.getRightChild());
			}else{
				Node<T> newNode = new Node<T>(newData);
				node.setRightChild(newNode);
			}
		}
		
	}

	@Override
	public void delete(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getMaximum() {
		if(root == null) return null;
		return getMaxValue(root);
	}
	
	private T getMaxValue(Node<T> node){
		if(node.getRightChild()!=null){
			return getMaxValue(node.getRightChild());
		}
		return node.getData();
	}

	@Override
	public T getMinimum() {
		if(root==null)	return null;
		return getMinValue(root);
	}
	
	private T getMinValue(Node<T> node){
		if(node.getLeftChild()!=null){
			return getMinValue(node.getLeftChild());
		}
		return node.getData();
	}

	@Override
	public void getIndOrderTraversal() {
		if(root==null) System.out.println("Empty Tree");
		inOrder(root);
		
	}
	
	private void inOrder(Node<T> node){
		if(null!=node){
			inOrder(node.getLeftChild());
			System.out.print(node.getData()+",");
			inOrder(node.getRightChild());
		}
	}

}
