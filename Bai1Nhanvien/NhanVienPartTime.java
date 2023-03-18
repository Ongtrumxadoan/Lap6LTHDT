/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1Nhanvien;

/**
 *
 * @author Admin
 */
public class NhanVienPartTime extends NhanVien{
    public int giolamviec;

    public NhanVienPartTime(String ten, int giolamviec) {
        this.ten =ten;
        this.giolamviec =giolamviec;
        
         
    }
    @Override
    public String getloaiNhanvien1(){
        return "nhan vien parttime";
    }
    @Override
    public void settinhluong1(){
        this.luong = this.giolamviec*20;
        System.out.println("luong nhan vien parttime la: "+this.luong);
    }

     
    
    }
    

