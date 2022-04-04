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
public class ClubStructure {
    private String name;
    private String address;
    
    private Vector events;
    private Vector stades;
    
    private Manager man;
    private Stadium st;
    
    private Vector Securities;
    
//  When Club is created stadium and manager is found Composition relation
    public ClubStructure() {
        st=new Stadium();
        man=new Manager();
    }
//  Geter and Setter For name and address  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
//  Organize Event in club  [ev refer to Event class ==>set of event and set date of event]
    public void add_event(Events ev){
        events.addElement(ev);
    }
    public Enumeration get_event(){
        return events.elements();
    }
//  Add stade to club  
    public void add_stadium(Stadium s){
        stades.addElement(s);
    }
    public Enumeration get_stades(){
        return stades.elements();
    }
//  Add Security member
    public void add_security(SecurityMember se){
        Securities.addElement(se);
    }
    public Enumeration get_securites(){
        return Securities.elements();
    }
}
