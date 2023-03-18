
public class HocSinh {
    public String hoTen;
    public int lop;
    public double toan;
    public double ly;
    public double hoa;
    
    public HocSinh(){
        this.hoTen =null;
        this.hoa = 0;
        this.lop =0;
        this.ly = 0;
        this.toan= 0;
        
    }
    public HocSinh(String hoTen, int lop, double toan,double ly, double hoa){
        this.hoTen= hoTen;
        this.hoa =hoa;
        this.lop =lop;
        this.ly =ly;
        this.toan =toan;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getLop() {
        return this.lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public double getToan() {
        return this.toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return this.ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return this.hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
   public String getDiemTrungBinh(){
       return "diem trung binh la: "+(this.toan+ this.ly+this.hoa)/3;
       
   }
    @Override
   public String toString(){
       return "ho ten la: "+ this.hoTen+"\n"+
               "lop la: "+this.lop+"\n"+
               "diem toan la: "+this.toan+"\n"+
               "diem ly la: "+this.ly+"\n"+
               "diem hoa la: "+this.hoa+"\n";
   }
}
   

