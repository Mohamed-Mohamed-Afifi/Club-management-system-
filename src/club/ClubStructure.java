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
    private Vector managers;
    private Manager man;
    public ClubStructure() {
        Stadium st=new Stadium();
        man=new Manager();
    }
    
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
    public void add_event(Events ev){
        events.addElement(ev);
    }
    public Enumeration get_event(){
        return events.elements();
    }
    public void add_manager(Manager men){
        managers.addElement(men);
    }
}
