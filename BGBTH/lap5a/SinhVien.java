package lap5a;

import java.util.ArrayList;
import java.util.List;

class SinhVien {
    private String hoTen;
    private List<DiemHP> danhSachHP;

    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
        this.danhSachHP = new ArrayList<>();
    }

    public void themHocPhan(DiemHP hp) {
        danhSachHP.add(hp);
    }

    public double tinhDTB() {
        double tongDiem = 0;
        int tongTinChi = 0;
        for (DiemHP hp : danhSachHP) {
            tongDiem += hp.tinhDiem() * hp.laySoTinChi();
            tongTinChi += hp.laySoTinChi();
        }
        return tongTinChi > 0 ? tongDiem / tongTinChi : 0;
    }

    public void hienThi() {
        System.out.println("Họ tên: " + hoTen);
        for (DiemHP hp : danhSachHP) {
            System.out.println("- " + hp.layTenHP() + ": " + String.format("%.2f", hp.tinhDiem()));
        }
        System.out.println(">> Diem trung binh : " + String.format("%.2f", tinhDTB()));
        System.out.println();
    }
}
