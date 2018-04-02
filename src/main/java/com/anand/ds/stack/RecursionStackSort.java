/**
 * 
 */
package com.anand.ds.stack;

import java.util.Stack;

/**
 * @author U45999
 *
 */
public class RecursionStackSort {
    static void sortedInsert(Stack<Integer> s, int x){
        if (s.isEmpty() || x > s.peek()){
            s.push(x);
            return;
        }
        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp);
    }
    static void sortStack(Stack<Integer> s){
        if (!s.isEmpty()){
            int x = s.pop();
            System.out.println("S before sort Stack"+s);
            sortStack(s);
            System.out.println("S After sort Stack"+s);
            sortedInsert(s, x);
        }
    }
} 
