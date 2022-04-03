/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package club;

import java.util.Enumeration;
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
//  add Member by manager
    public void add_member(Members me){
        members.addElement(me);
    }
//  remove Member by manager
    public void Remove_member(Members me){
        members.remove(me);
    }
//  number of members    
    public double get_num_members(){
        return members.size();
    }
//  Member data    
    public void Print_members(){
     Enumeration en=members.elements();
     int count=0;
        while (en.hasMoreElements()) {
            count++;
            Members me =(Members) en.nextElement();
            System.out.println("Member number "+ count+":"+ "\n" +" The Name :  " +me.getName()+ "\n" +" Id Number : " + me.getId());
            me.get_played_sport();
        }
    }
    
}
