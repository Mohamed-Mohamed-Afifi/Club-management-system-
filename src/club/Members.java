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
public class Members extends Person{
    private Vector sports;

    public Members() {
        sports=new Vector();
    }

public void play_sport(Sport sp){
        sports.addElement(sp);
    }
public void get_played_sport(){
        Enumeration en=sports.elements();
        int count=0;
        while (en.hasMoreElements()) {
            count++;
        Sport sp =(Sport) en.nextElement();
            System.out.println(count+":" +sp.getName());
        
    }
    }
    
}
