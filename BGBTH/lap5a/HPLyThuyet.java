package lap5a;

class HPLyThuyet extends DiemHP {
    private double chuyenCan, giuaKy, cuoiKy;

    public HPLyThuyet(String tenHP, int soTinChi, double chuyenCan, double giuaKy, double cuoiKy) {
        super(tenHP, soTinChi);
        this.chuyenCan = chuyenCan;
        this.giuaKy = giuaKy;
        this.cuoiKy = cuoiKy;
    }

    @Override
    public double tinhDiem() {
        return chuyenCan * 0.1 + giuaKy * 0.2 + cuoiKy * 0.7;
    }
}
