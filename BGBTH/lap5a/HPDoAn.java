package lap5a;

class HPDoAn extends DiemHP {
    private double[] diemHoiDong = new double[5];

    public HPDoAn(String tenHP, int soTinChi, double[] diemHoiDong) {
        super(tenHP, soTinChi);
        if (diemHoiDong.length == 5) {
            this.diemHoiDong = diemHoiDong;
        }
    }

    @Override
    public double tinhDiem() {
        double tong = 0;
        for (double d : diemHoiDong) tong += d;
        return tong / 5;
    }
}
