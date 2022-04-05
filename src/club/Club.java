/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package club;
import java.util.Vector;
import java.util.Scanner;
/**
 *
 * @author DELL 7510
 */
//Main clus
public class Club {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      Add Sports  
        Sport sp1=new Sport();
        sp1.setName("Football");
        Sport sp2=new Sport();
        sp2.setName("basketball");
        Sport sp3=new Sport();
        sp3.setName("tennis");
        Sport sp4=new Sport();
        sp4.setName("basketball");
        
//      Add Members
        Members meb1=new Members();
        meb1.setName("Mohamed Afifi");
        meb1.setId(1800253);
        meb1.play_sport(sp1);
        meb1.play_sport(sp2);
        
//      Add Members
        Members meb2=new Members();
        meb2.setName("Mohamed Elsayed");
        meb2.setId(1800253);
        meb2.play_sport(sp3);
        meb2.play_sport(sp4);
        
//      Add Stadium
        Stadium stad1=new Stadium();
        stad1.setName("stade elsalam");
        stad1.set_type_of_sport("this stadim for basketball");
        Stadium stad2=new Stadium();
        stad2.setName("stade elqahar");
        stad2.set_type_of_sport("this stadim for tennis");
        
//      Add Events
        Events ev1=new Events();
        ev1.setData("5-4-2022");
        ev1.setName("take mark");
        
//      Add Manager
        Administrator man1=new Administrator();
        man1.setName("Mo 3fifi");
        man1.setId(01145626715);
        man1.add_member(meb1);
        man1.add_member(meb2); 
        
//      Club structure
        ClubStructure clb=new ClubStructure();
//          clb.add_event(ev1);
        clb.setName("teachers club");
        clb.setAddress("Menouf,Cairo Egypt");
//          clb.add_stadium(stad2);
        

        Vector ids=new Vector();
        ids.addElement(meb1.getId());
        ids.addElement(meb2.getId());
        
       
//      Output
        System.out.println("The Name of Club is :"+clb.getName());
        System.out.println("The Name of Manager is :"+man1.getName());
        System.out.println("The Number of members is :"+man1.get_num_members());
        man1.Print_members();
        System.out.println("There is a Event at " +ev1.getData() +" Called :"+ ev1.getName());
        
        SecurityMember sec=new SecurityMember();
        Scanner sc=new Scanner(System.in);
        System.err.println("Please Enter Id to check :");
        double id=sc.nextDouble();
        if(sec.check_id(id, ids)){
            System.err.println("This id is valid to enter the club");
        }else{
            System.err.println("This id is denay please renew your id");
        }
    }

}
