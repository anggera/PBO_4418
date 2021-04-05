/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementasiinheritance;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class MyArrayList extends Inherit{
    ArrayList<String> arrayList;
    
    MyArrayList() {
        arrayList = new ArrayList<>();
    }
    
    public void addArrayList(String element) {
        arrayList.add(element);
    }
    
    public void editArrayList(int Index, String element) {
        arrayList.set(Index, element);
    }
    
    public void removeArrayList(String element) {
        arrayList.remove(element);
    }
    
    public void sizeofArrayList() {
        super.itsSize();
        System.out.println(" " +arrayList.size());
    }
}
