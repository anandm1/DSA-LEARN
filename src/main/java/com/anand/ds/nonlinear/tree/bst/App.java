/**
 * 
 */
package com.anand.ds.nonlinear.tree.bst;

import com.anand.ds.nonlinear.tree.bst.BinarySearchTree;


/**
 * @author U45999
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = new int[]{10,40,30,15,5,2,8,80,2,100};
		Tree<Integer> t = new BinarySearchTree<Integer>();
		for(int i=0;i<A.length;++i){
			System.out.println("inserting ::"+A[i]);
			t.insert(A[i]);
		}
		t.getIndOrderTraversal();
		//System.out.println("Inorder Traversal for Tree :: "+t.getIndOrderTraversal());
		System.out.println("Maximumn in Treee ::"+t.getMaximum());
		System.out.println("Minimum in Tree"+t.getMinimum());

	}

}
