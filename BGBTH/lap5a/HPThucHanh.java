package lap5a;

import java.util.List;

class HPThucHanh extends DiemHP {
    private List<Double> diemBaiTap;

    public HPThucHanh(String tenHP, int soTinChi, List<Double> diemBaiTap) {
        super(tenHP, soTinChi);
        this.diemBaiTap = diemBaiTap;
    }

    @Override
    public double tinhDiem() {
        return diemBaiTap.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

}