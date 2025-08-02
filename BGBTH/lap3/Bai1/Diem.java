package lap3.Bai1;

public class Diem {
    private String tenHocPhan;
    private int soTinChi;
    private int chuyenCan;
    private int giuaKy;
    private int cuoiKy;

    public Diem(String tenHocPhan, int soTinChi, int chuyenCan, int giuaKy, int cuoiKy) {
        this.tenHocPhan = tenHocPhan;
        this.soTinChi = soTinChi;
        this.chuyenCan = chuyenCan;
        this.giuaKy = giuaKy;
        this.cuoiKy = cuoiKy;
    }
    
    public int getSoTinChi(){
        return soTinChi;
    }

    public String getTenHocPhan() {
        return tenHocPhan;
    }

    public double tinhDiem(){
        return (chuyenCan * 0.1 + giuaKy * 0.2 + cuoiKy * 0.7);
    }

    public String toString(){
        return tenHocPhan + " TC: " + soTinChi + " - Diem: " + tinhDiem();
    }
}
