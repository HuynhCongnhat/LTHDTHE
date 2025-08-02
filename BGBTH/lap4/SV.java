package lap4;

import java.time.LocalDate;
//import java.time.Period;
import java.util.*;

public class SV {
    private String hoTen;
    private LocalDate ngaySinh;
    private double dtb;

    public SV(String hoTen, LocalDate ngaySinh, double dtb) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.dtb = dtb;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDtb() {
        return dtb;
    }
    public void setDtb(double dtb) {
        this.dtb = dtb;
    }
    
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }


    public String layHoTen(){
        return hoTen;
    }

    public String ganHoTen(String hoTen){
        return this.hoTen;
    }

    public LocalDate layNgaySinh(){
        return ngaySinh;
    }

    public LocalDate ganNgaySinh(Date ngaySinh){
        return this.ngaySinh;
    }

    public double layDtb(){
        return dtb;
    }

    public double ganDtb(double dtb){
        return this.dtb;
    }

    public String hienThi(){
        return hoTen + " - " + ngaySinh + " - " + dtb;
    }

    public String layHo(){
        String[] parts = hoTen.trim().split(" ");
        return parts.length > 0 ? parts[0] : " ";
    }

    public String layTen(){
        String[] parts = hoTen.trim().split(" ");
        return parts.length > 1 ? parts[parts.length - 1] : " ";
    }

    public String layDem(){
        String[] parts = hoTen.trim().split(" ");
        return parts.length > 2 ? String.join(" ", Arrays.copyOfRange(parts, 1, parts.length - 1)) : "";
    }

    public int layTuoi(){
        // return Period.between(ngaySinh, LocalDate.now()).getYears();
        int yearNow = LocalDate.now().getYear();
        return yearNow - ngaySinh.getYear();
    }

    public String layXepLoai(){
       return dtb >= 8 ? "Giỏi" : dtb >= 7 ? "Khá" : dtb >= 5 ? "Trung bình" : "Yếu";
    }
    
}
