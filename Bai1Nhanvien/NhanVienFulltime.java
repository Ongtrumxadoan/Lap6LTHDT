/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1Nhanvien;

/**
 *
 * @author Admin
 */
public class NhanVienFulltime extends NhanVien{
    public int loaichucvu;
    public int ngaylamthem; 
    
    public NhanVienFulltime(String ten, int ngaylamthem,int loaichucvu){
        this.ten = ten;
        this.ngaylamthem =ngaylamthem;
        this.loaichucvu= loaichucvu;
    }
    @Override
    public String getloaiNhanvien1(){
        return  
              "nhan vien fulltime"
                ;
    }
    @Override
    public void settinhluong1(){
        this.luong = this.ngaylamthem*200;
        System.out.println("so luong cua nhan vien fulltime la: "+this.luong);
    }
}
