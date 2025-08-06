package lap5b;

public class Main {
    public static void main(String[] args) {
        ThungThu thung = new ThungThu();

        // Thêm bưu phẩm
        thung.them(new Thu(false)); // Thư thường
        thung.them(new Thu(true));  // Thư bảo đảm
        thung.them(new Thu(true));  // Thư bảo đảm
        thung.them(new BuuKien());  // Bưu kiện
        thung.them(new BuuKien());  // Bưu kiện
        thung.them(new Thu(false)); // Thư thường

        // Liệt kê
        thung.lietKeTatCa();
        thung.lietKeThuBaoDam();

        // Tổng tiền toàn thùng
        System.out.println("Tong tien tat ca buu pham: " + thung.tongTien() + "VND\n");

        // Tổng tiền từng loại
        thung.tongTienTungLoai();
    }
}
