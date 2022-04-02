/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package club;

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
        sp1.setName("basketball");
        Sport sp3=new Sport();
        sp1.setName("tennis");
        Sport sp4=new Sport();
        sp1.setName("basketball");
        
//      Add Members
        Members meb1=new Members();
        meb1.setName("Mohamed Afifi");
        meb1.setId("1800253");
        meb1.play_sport(sp1);
        meb1.play_sport(sp2);
        
//      Add Members
        Members meb2=new Members();
        meb2.setName("Mohamed Elsayed");
        meb2.setId("1800253");
        meb2.play_sport(sp3);
        meb2.play_sport(sp4);
//      Add Stadium

        Stadium stad1=new Stadium();
        stad1.setName("stade elsalam");
        Stadium stad2=new Stadium();
        stad1.setName("stade elqahar");
//      Add Events
        Events ev1=new Events();
        ev1.setData("5-4-2022");
        ev1.setName("take mark");
//      Add Manager
        Manager man1=new Manager();
        man1.setName("Mo 3fifi");
        man1.setId("01145626715");
        man1.add_member(meb2);
        man1.add_member(meb1);        
//      Club structure
        ClubStructure clb=new ClubStructure();
        clb.add_event(ev1);
        clb.setName("teachers club");
        clb.setAddress("Menouf,Cairo Egypt");
        clb.add_manager(man1);
        
        
    }

}
