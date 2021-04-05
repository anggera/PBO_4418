/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementasiinheritance;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ACER
 */
public class MyQueue extends Inherit{
    Queue<String> queue;
    
    MyQueue() {
        queue = new LinkedList<>();
    }
    
    public void addQueue(String element) {
        queue.add(element);
    }
    
    public void peekQueue() {
        System.out.println("peek        : " +queue.peek());
    }
    
    public void removeQueue() {
        System.out.println("remove      : " +queue.remove());
    }
    
    public void sizeofQueue() {
        super.itsSize();
        System.out.println(" " +queue.size());
    }
}
