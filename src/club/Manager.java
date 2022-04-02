/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package club;

import java.util.Vector;

/**
 *
 * @author DELL 7510
 */
public class Manager extends Person{
    private Vector members;

    public Manager() {
        members=new Vector();          
    }
    
    public void add_member(Members me){
        members.addElement(me);
    }
    public void Remove_member(Members me){
        members.remove(me);
    }
    
    
    
    
}
