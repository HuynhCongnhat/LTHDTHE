package lap5b;

class BuuKien extends BuuPham {
    public BuuKien() {
        super("BuuKien");
    }

    @Override
    public int tinhTien() {
        return 5000;
    }

    @Override
    public void hienThi() {
        System.out.println("- Buu Kien | Giá: 5000VND");
    }
}
