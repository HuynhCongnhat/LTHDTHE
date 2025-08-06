package lap5;

public class SinhVien {
    private String hoTen;
    private DiemHP hp1, hp2;

    public SinhVien(String hoTen, DiemHP hp1, DiemHP hp2) {
        this.hoTen = hoTen;
        this.hp1 = hp1;
        this.hp2 = hp2;
    }

    public double tinhDTB() {
        return (hp1.tinhDiem() * hp1.laySoTinChi() + hp2.tinhDiem() * hp2.laySoTinChi()) / (hp1.laySoTinChi() + hp2.laySoTinChi());
    }

    public void hienThi(){
        System.out.println("Họ tên: " + hoTen);
        System.out.println("- " + hp1.layTenHP() + ": " + String.format("%.2f", hp1.tinhDiem()));
        System.out.println("- " + hp2.layTenHP() + ": " + String.format("%.2f", hp2.tinhDiem()));
        System.out.println(">> Diem trung binh: " + String.format("%.2f", tinhDTB()));
        System.out.println();
    }
}