/**
 * 
 */
package com.anand.ds.problem.cart;

/**
 * @author U45999
 *
 */
public interface Catalogue {
	
	public int addItem(Item item , int count);
	public boolean removeItem(Item item);
	public int getCount();

}
