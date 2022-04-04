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
public class SecurityMember extends Person{
    public  boolean check_id(double s , Vector members_id ){
        Enumeration en=members_id.elements();
        while (en.hasMoreElements()) {
            if(s == (double)en.nextElement()){
                return true;
            }
        }
        return false;
    }
}
