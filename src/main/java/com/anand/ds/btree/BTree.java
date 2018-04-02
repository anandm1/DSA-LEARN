/**
 * 
 */
package com.anand.ds.btree;

/**
 * @author U45999
 *
 */
public class BTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = new int[]{10,40,30,15,5,2,8};
		BinaryTree bTree = new BinaryTree();
		//BTree binTree = new BTree();
		Node rootNode = null;
		for(int i=0;i<A.length;++i){
			System.out.println("inserting ::"+A[i]);
			rootNode = bTree.insertNodeInBTree(rootNode,A[i]);
			System.out.println("After inserting ::"+A[i]+" Node ::"+rootNode);
			
		}
	}
}	
	class Node{
		private int key;
		Node left,right;
		Node(int key){
			this.key=key;
			left = right = null;
		}
		int length = 0;
		@Override
		public String toString() {
			return "Node [key=" + key + ", left=" + left + ", right=" + right + ", length=" + length + "]";
		}
		
	}
	
	class BinaryTree{
		//private Node node = null;
		Node insertNodeInBTree(Node node ,int nodeValue){
			if(null==node){
					//root node
					node = new Node(nodeValue);
					node.length+=1;
					System.out.println("Root Node value"+node);
					return node;
			}
			if(null!=node){
				if(node.length>0 && node.length%2==1){
					//Left node
					/*if(node.left!=null){
						return insertNodeInBTree(node.left,nodeValue);
					}*/
					Node leftLeafNode=node;
					while(leftLeafNode.left!=null){
						leftLeafNode=leftLeafNode.left;
					}
					if(node.left==null || leftLeafNode.left==null){
						Node leftChildNode = new Node(nodeValue);
						leftLeafNode.left=leftChildNode;
						node.length+=1;
						System.out.println("Left Node value"+node);
						return node;
					}
					
				}
				if(node.length>0 && node.length%2==0){
					//right node
					/*if(node.right!=null){
						return insertNodeInBTree(node.right,nodeValue);
					}*/
					Node rightLeafNode=node;
					while(rightLeafNode.right!=null){
						rightLeafNode = rightLeafNode.right;
					}
					if(node.right==null || rightLeafNode.right==null){
						Node rightChildNode = new Node(nodeValue);
						rightLeafNode.right=rightChildNode;
						node.length+=1;
						return node;
					}
					
				}
			}
			return node;
		}
	}
	


