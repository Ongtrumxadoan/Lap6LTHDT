/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Bai1Nhanvien;

/**
 *
 * @author Admin
 */
public class NhanVien {
    public String ten;
    public long luong;
    
    public NhanVien(){
        this.luong = 0;
        this.ten = null;
    }
    public NhanVien(String ten){
        this.ten = ten;
    }
    public String getloaiNhanvien1(){
        return "nhan vien loai";
    }
    public void settinhluong1(){
        
    }
 
    public void toxuatthongtin(){
         System.out.println("ten nhan vien la:"+this.ten  );
       
    }
}
