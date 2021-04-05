/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementasiinheritance;

import java.util.Stack;

/**
 *
 * @author ACER
 */
public class MyStack extends Inherit{
    Stack<String> stack;
    
    MyStack() {
        stack = new Stack<>();
    }
    
    public void pushStack(String element) {
        System.out.println("push        : " +stack.push(element));
    }
    
    public void editStack(int Index, String element) {
        stack.set(Index, element);
    } 
    
    public void peekStack() {
        System.out.println("peek        : " +stack.peek());
    }
    
    public void popStack() {
        System.out.println("pop         : " +stack.pop());
    }
    
    public void sizeofStack() {
        super.itsSize();
        System.out.println(" " +stack.size());
    }
}
