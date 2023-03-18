/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String [] args){
        HocSinh hs= new HocSinh("vu trong phuong", 11, 7, 6, 8);
        HocSinhChuyenToan hsct = new HocSinhChuyenToan("hoang van thai", 9, 8, 6, 7);
        HocSinhChuyenToan asxa = new HocSinhChuyenToan("tcong dat", 8, 6, 6, 9);
                
         
        System.out.println(hs.toString() + hs.getDiemTrungBinh()+"\n");
        System.out.println(hsct.toString()+hsct.getdiemtrungbinh());
        System.out.println(asxa.toString()+asxa.getdiemtrungbinh());
    }
}
