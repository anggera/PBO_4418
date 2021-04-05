/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementasiinheritance;

/**
 *
 * @author ACER
 */
public class ImplementasiInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyArrayList data = new MyArrayList();
        data.addArrayList("Grape");
        data.addArrayList("Apple");
        System.out.println("Array List    : " +data.arrayList);
        data.editArrayList(0, "Banana");
        System.out.println("Array List    : " +data.arrayList);
        data.addArrayList("Mango");
        System.out.println("Array List    : " +data.arrayList);
        data.removeArrayList("Apple");
        System.out.println("Array List    : " +data.arrayList);
        data.finalUpdate();
        data.sizeofArrayList();
        System.out.println("");
        
        MyStack data2 = new MyStack();
        data2.pushStack("Panda");
        data2.pushStack("Dog");
        System.out.println("Stack       : " +data2.stack);
        data2.popStack();
        System.out.println("Stack       : " +data2.stack);
        data2.pushStack("Bear");
        System.out.println("Stack       : " +data2.stack);
        data2.editStack(0, "Tiger");
        System.out.println("Stack       : " +data2.stack);
        data2.peekStack();
        data2.finalUpdate();
        data2.sizeofStack();
        System.out.println("");
        
        MyQueue data3 = new MyQueue();
        data3.addQueue("Book");
        data3.addQueue("Smartphone");
        System.out.println("Queue       : " +data3.queue);
        data3.removeQueue();
        System.out.println("Queue       : " +data3.queue);
        data3.addQueue("Laptop");
        System.out.println("Queue       : " +data3.queue);
        data3.peekQueue();
        data3.finalUpdate();
        data3.sizeofQueue();
        System.out.println("");
    }
    
}
