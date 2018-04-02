/**
 * 
 */
package com.anand.ds.nonlinear.tree.bst;

/**
 * @author U45999
 *
 */
public interface Tree<T> {
	public void traversal();
	public void insert(T data);
	//public void insertNode(T data,Node<T> node);
	public void delete(T data);
	public T getMaximum();
	public T getMinimum();
	public void getIndOrderTraversal();
}
