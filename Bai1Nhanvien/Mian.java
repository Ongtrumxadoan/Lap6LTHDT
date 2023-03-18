/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1Nhanvien;

/**
 *
 * @author Admin
 */
public class Mian {
    public static void main(String [] args){
      NhanVienPartTime nv =new NhanVienPartTime("hoang van thai", 24);
        nv.toxuatthongtin();
        System.out.println(nv.getloaiNhanvien1());
        nv.settinhluong1();
        System.out.println("---------------------------------");
        
       NhanVien nvpt= new NhanVienPartTime("vutrong phuong",20);
          nvpt.toxuatthongtin();
          System.out.println( nvpt.getloaiNhanvien1());
          nvpt.settinhluong1();
          System.out.println("---------------------------------");
        
       NhanVien nv1= new NhanVienFulltime("hoang van b", 29, 2);
         nv1.toxuatthongtin();
         System.out.println(nv1.getloaiNhanvien1()); 
         nv1.settinhluong1();
         
         
          
         
    }
}
