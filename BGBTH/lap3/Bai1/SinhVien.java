package lap3.Bai1;

import java.util.ArrayList;

public class SinhVien {
    // private String hoTen;
    // private Diem dm1,dm2;

    // public SinhVien(String hoTen, Diem dm1, Diem dm2){
    //     this.hoTen = hoTen;
    //     this.dm1 = dm1;
    //     this.dm2 = dm2;
    // }

    // public double tinhDiemTB(){
    //     double tongDiem = dm1.tinhDiem() * dm1.getSoTinChi() + dm2.tinhDiem() * dm2.getSoTinChi();
    //     int tongTinChi = dm1.getSoTinChi() + dm2.getSoTinChi();
    //     return tongDiem / tongTinChi;
    // }


    // public String toString(){
    //     return hoTen + " " + dm1.toString() + " - "  + dm2.toString() + " - diem TB: " + String.format("%.2f", tinhDiemTB()) ;
    // }
    
    private String hoTen;
    private ArrayList<Diem> dsDiem;

    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
        this.dsDiem = new ArrayList<>();
    }

    public void themDiem(Diem diem) {
        dsDiem.add(diem);
    }

    public double tinhDiemTB() {
        double tongDiem = 0;
        int tongTinChi = 0;
        for (Diem d : dsDiem) {
            tongDiem += d.tinhDiem() * d.getSoTinChi();
            tongTinChi += d.getSoTinChi();
        }
        return tongTinChi > 0 ? tongDiem / tongTinChi : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(hoTen).append("\n");
        for (Diem d : dsDiem) {
            sb.append("  ").append(d.toString()).append("\n");
        }
        sb.append("  Diem TB: ").append(String.format("%.2f", tinhDiemTB()));
        return sb.toString();
    }
}
