package lap4;

import java.time.format.DateTimeFormatter;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DSSV dssv = new DSSV(5);

        // Tạo danh sách 5 sinh viên
        dssv.them(new SV("Nguyen Van Nam", LocalDate.parse("01/01/1995", formatter), 8.6));
        dssv.them(new SV("Tran Thi Hoa", LocalDate.parse("25/12/1978", formatter), 7.0));
        dssv.them(new SV("Le Van An", LocalDate.parse("11/05/1985", formatter), 6.5));
        dssv.them(new SV("Nguyen Thi Mai", LocalDate.parse("10/08/2000", formatter), 9.0));
        dssv.them(new SV("Pham Van Hoa", LocalDate.parse("14/02/1990", formatter), 5.5));


        System.out.println("== DANH SÁCH BAN ĐẦU ==");
        dssv.hienThi();

        // Sắp xếp theo họ tên kiểu Việt Nam (tên + họ + đệm)
        System.out.println("== DANH SÁCH SAU KHI SẮP THEO HỌ TÊN KIỂU VIỆT NAM ==");
        dssv.sapHoTenViet();
        dssv.hienThi();

        // Liệt kê sinh viên giỏi
        System.out.println("== LIỆT KÊ SINH VIÊN GIỎI ==");
        dssv.lietKeXepLoai("Giỏi");

        // Tìm sinh viên tên "Nam"
        System.out.println("== TÌM SINH VIÊN TÊN 'Nam' ==");
        dssv.timTen("Nam");

        // Xoá sinh viên đầu tiên tên "Hòa"
        System.out.println("== XOÁ SINH VIÊN TÊN 'Hòa' ==");
        dssv.xoa("Hòa");
        dssv.hienThi();

        // Tính tuổi trung bình
        System.out.println("== TUỔI TRUNG BÌNH ==");
        double tongTuoi = 0;
        for (int i = 0; i < dssv.getSoSV(); i++) {
            tongTuoi += dssv.laySV(i).layTuoi();
        }
        double tbTuoi = tongTuoi / dssv.getSoSV();
        System.out.printf("Tuổi trung bình: %.2f\n", tbTuoi);

        // Tăng điểm trung bình 0.5 cho SV sinh trước năm 1980
        System.out.println("== TĂNG ĐTB CHO SV SINH TRƯỚC 1980 ==");
        for (int i = 0; i < dssv.getSoSV(); i++) {
            SV sv = dssv.laySV(i);
            LocalDate ngaySinh = sv.getNgaySinh();
            if (ngaySinh.getYear() < 1980) {
                sv.setDtb(sv.getDtb() + 0.5);
            }
        }
        dssv.hienThi();

        // CHUẨN HÓA HỌ TÊN
        System.out.println("== CHUẨN HÓA HỌ TÊN ==");
        dssv.chuanHoTen();
        dssv.hienThi();

        // LIỆT KÊ SINH VIÊN TRÙNG NHAU
        System.out.println("== SINH VIÊN TRÙNG NHAU ==");
        dssv.trungSV();

        // SV sv1 = dssv.laySV(0); // SV đầu
        // SV sv2 = dssv.laySV(1); // SV thứ hai

        // System.out.println("\n== So sánh 2 sinh viên đầu tiên ==");

        // System.out.println(sv1.getHoTen() + " lớn hơn " + sv2.getHoTen() + ": " + sv1.lonHon(sv2));
        // System.out.println(sv1.getHoTen() + " giỏi hơn " + sv2.getHoTen() + ": " + sv1.gioiHon(sv2));
        // System.out.println("Hai sinh viên giống nhau: " + sv1.giongNhau(sv2));


    }
}

