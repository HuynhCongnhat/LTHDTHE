package lap2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NhanVien {
    private String hoTen;
    private LocalDate ngaySinh;
    private String chucVu;
    private double heSoLuong;
    private double luongCoBan;

    public NhanVien(String hoTen, String ngaySinh, String chucVu, double heSoLuong, double luongCoBan){
        this.hoTen = hoTen;
        this.ngaySinh = LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
    }

    public double layHeSoPhuCap(){
        switch (chucVu.toLowerCase()){
            case "giam doc": return 1.0;
            case "pho giam doc": return 0.8;
            case "truong phong": return 0.6;
            case "pho phong": return 0.5;
            default: return 0.0;
        }
    }
    
    public double tinhLuong(){
        return (heSoLuong + layHeSoPhuCap()) * luongCoBan;
    }

    public double baoHiemXaHoi(){
        return tinhLuong() * 0.06;
    }

    public double baoHiemThatNghiep(){
        return tinhLuong() * 0.01;
    }

    public double soTienConNhan(){
        return tinhLuong() - baoHiemXaHoi() - baoHiemThatNghiep();
    }

    public int layTuoi() {
        return LocalDate.now().getYear() - ngaySinh.getYear();
    }

    public String getHoTen() {
        return hoTen;
    }

    public String toString(){
            return String.format("%-20s | Lương: %.2f | BHXH: %.2f | BHTN: %.2f | Số tiền còn nhận: %.2f | Tuổi: %d",
            hoTen, tinhLuong(), baoHiemXaHoi(), baoHiemThatNghiep(), soTienConNhan(), layTuoi());
    }

    public static void main(String[] arg){
        NhanVien[] nv = new NhanVien[5];
        nv[0] = new NhanVien("Nguyen Van A", "01/01/1990", "Giam Doc", 2.5, 1500000);
        nv[1] = new NhanVien("Tran Thi B", "15/05/1992", "Pho Giam Doc", 2.0, 1500000);
        nv[2] = new NhanVien("Le Van C", "20/10/1995", "Truong Phong", 1.8, 1500000);
        nv[3] = new NhanVien("Pham Thi D", "30/12/1998", "Pho Phong", 1.5, 1500000);
        nv[4] = new NhanVien("Hoang Van E", "05/03/2000", "Nhan Vien", 1.2, 1500000);

        System.out.println("Danh sach nha vien:");
        double tongLuong = 0;
        int maxTuoi = nv[0].layTuoi();
        int idxMaxTuoi = 0;
        for (int i = 0; i < nv.length; i++) {
            System.out.println(nv[i]);
            tongLuong += nv[i].tinhLuong();
            if (nv[i].layTuoi() > maxTuoi) {
                maxTuoi = nv[i].layTuoi();
                idxMaxTuoi = i;
            }
        }

        System.out.println("\nTong luong cua cac nhan vien: " + tongLuong);
        System.out.println("Nhan vien co tuoi cao nhat: " + nv[idxMaxTuoi].getHoTen() + " (" + maxTuoi + " tuoi)");
        System.out.println("Luong trung binh: " + (tongLuong / nv.length));
        



    }
}
