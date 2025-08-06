package lap5b;

abstract class BuuPham {
    protected String loai;

    public BuuPham(String loai) {
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
    }

    public abstract int tinhTien();
    public abstract void hienThi(); 
}
