package lap5b;

public class ThungThu {
    private BuuPham[] danhSach;
    private int soLuong;

    public ThungThu() {
        danhSach = new BuuPham[100];
        soLuong = 0;
    }

    public void them(BuuPham bp) {
        if (soLuong < 100) {
            danhSach[soLuong++] = bp;
        } else {
            System.out.println("Thung thu da day.");
        }
    }

    public void lietKeTatCa() {
        System.out.println("Danh sach tat ca buu pham:");
        for (int i = 0; i < soLuong; i++) {
            danhSach[i].hienThi();
        }
        System.out.println();
    }

    public void lietKeThuBaoDam() {
        System.out.println("Danh sach thu bao dam:");
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i] instanceof Thu) {
                Thu t = (Thu) danhSach[i];
                if (t.isBaoDam()) {
                    t.hienThi();
                }
            }
        }
        System.out.println();
    }

    public int tongTien() {
        int tong = 0;
        for (int i = 0; i < soLuong; i++) {
            tong += danhSach[i].tinhTien();
        }
        return tong;
    }

    public void tongTienTungLoai() {
        int tongThuThuong = 0, tongThuBaoDam = 0, tongBuuKien = 0;
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i] instanceof Thu) {
                Thu t = (Thu) danhSach[i];
                if (t.isBaoDam()) tongThuBaoDam += t.tinhTien();
                else tongThuThuong += t.tinhTien();
            } else if (danhSach[i] instanceof BuuKien) {
                tongBuuKien += danhSach[i].tinhTien();
            }
        }

        System.out.println("Tong tien tung loai:");
        System.out.println("- Thu thuong: " + tongThuThuong + "VND");
        System.out.println("- Thu bao dam: " + tongThuBaoDam + "VND");
        System.out.println("- Buu kien: " + tongBuuKien + "VND");
        System.out.println();
    }
}
