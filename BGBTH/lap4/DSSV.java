package lap4;

import java.util.Arrays;

public class DSSV {
    private SV[] danhSach;
    private int soSV;

    // Constructor khởi tạo mảng
    public DSSV(int capacity) {
        danhSach = new SV[capacity];
        soSV = 0;
    }

    public int getSoSV() {
        return soSV;
    }

    // Thêm sinh viên
    public void them(SV sv) {
        if (soSV < danhSach.length) {
            danhSach[soSV++] = sv;
        } else {
            System.out.println("Danh sách đầy, không thể thêm!");
        }
    }

    // Lấy sinh viên theo chỉ số
    public SV laySV(int index) {
        if (index >= 0 && index < soSV) {
            return danhSach[index];
        } else {
            return null;
        }
    }

    // Hiển thị toàn bộ danh sách
    public void hienThi() {
        for (int i = 0; i < soSV; i++) {
            System.out.println("----- Sinh viên " + (i + 1) + " -----");
            System.out.println(danhSach[i].hienThi());
        }
    }

    // Sắp xếp theo họ tên
    public void sapHoTen() {
        Arrays.sort(danhSach, 0, soSV, (a, b) -> a.getHoTen().compareToIgnoreCase(b.getHoTen()));
    }

    // Sắp xếp theo tuổi (giảm dần)
    public void sapTuoi() {
        Arrays.sort(danhSach, 0, soSV, (a, b) -> Integer.compare(b.layTuoi(), a.layTuoi()));
    }

    // Sắp xếp theo điểm TB (giảm dần)
    public void sapDTB() {
        Arrays.sort(danhSach, 0, soSV, (a, b) -> Double.compare(b.getDtb(), a.getDtb()));
    }

    // Tìm theo tên
    public void timTen(String ten) {
        boolean found = false;
        for (int i = 0; i < soSV; i++) {
            if (danhSach[i].layTen().equalsIgnoreCase(ten)) {
                danhSach[i].hienThi();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên tên: " + ten);
        }
    }

    // Liệt kê theo xếp loại
    public void lietKeXepLoai(String loai) {
        boolean found = false;
        for (int i = 0; i < soSV; i++) {
            if (danhSach[i].layXepLoai().equalsIgnoreCase(loai)) {
                danhSach[i].hienThi();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có sinh viên nào xếp loại: " + loai);
        }
    }

    // Xóa theo tên (xóa SV đầu tiên có tên trùng)
    public void xoa(String ten) {
        for (int i = 0; i < soSV; i++) {
            if (danhSach[i].layTen().equalsIgnoreCase(ten)) {
                for (int j = i; j < soSV - 1; j++) {
                    danhSach[j] = danhSach[j + 1];
                }
                danhSach[--soSV] = null;
                System.out.println("Đã xóa sinh viên tên: " + ten);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên để xóa: " + ten);
    }

    // Sắp xếp theo tên + họ + đệm (kiểu Việt)
    public void sapHoTenViet() {
        Arrays.sort(danhSach, 0, soSV, (a, b) -> {
            String s1 = a.layTen() + " " + a.layHo() + " " + a.layDem();
            String s2 = b.layTen() + " " + b.layHo() + " " + b.layDem();
            return s1.compareToIgnoreCase(s2);
        });
    }

}
