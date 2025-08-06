package lap5a;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Nguyen Van A");
        sv1.themHocPhan(new HPLyThuyet("CTDL", 3, 8, 7, 9));
        sv1.themHocPhan(new HPThucHanh("Java Lab", 2, Arrays.asList(10.0, 9.5, 10.0)));
        sv1.themHocPhan(new HPDoAn("Do an 1", 2, new double[]{9, 8.5, 9.5, 9, 9}));

        SinhVien sv2 = new SinhVien("Tran Thi B");
        sv2.themHocPhan(new HPLyThuyet("Xac suat", 2, 9, 8, 8));
        sv2.themHocPhan(new HPThucHanh("Python Lab", 3, Arrays.asList(8.0, 9.0, 7.5, 8.5)));
        sv2.themHocPhan(new HPDoAn("Do an 2", 2, new double[]{8.5, 9, 9, 8.5, 9}));

        SinhVien sv3 = new SinhVien("Le Van C");
        sv3.themHocPhan(new HPThucHanh("Web Lab", 2, Arrays.asList(6.0, 7.0, 6.5)));
        sv3.themHocPhan(new HPDoAn("Do an Tot nghiep", 4, new double[]{9, 9, 9.5, 9, 10}));

        // In kết quả
        sv1.hienThi();
        sv2.hienThi();
        sv3.hienThi();
    }
}
