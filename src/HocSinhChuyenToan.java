 
public class HocSinhChuyenToan extends HocSinh{
   public HocSinhChuyenToan(String hoTen, int lop, double toan, double hoa, double ly){
       super(hoTen, lop, toan, ly, hoa);
   }
public String getdiemtrungbinh(){
return "diem trung binh hoc sinh chuyen toan la: "+(this.toan*2+this.ly+this.hoa)/4+"\n";
}

        }
 
    

