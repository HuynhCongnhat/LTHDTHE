import java.util.*;
abstract class Diem{
    protected String tenHocPhan;
    protected int soTinChi;

    public Diem(String tenHP, int stc){
        this.tenHocPhan = tenHP;
        this.soTinChi = stc;
    }
    public int laySoTinChi(){
        return soTinChi;
    }
    public String layTenHocPhan(){
        return tenHocPhan;
    }
    public abstract String loaiHP();
    public abstract double tinhDiem();
    public void hienThi(){
        System.out.println("Hoc phan: "+ tenHocPhan + " so tin chi: "+ soTinChi + " diem hoc phan: " + this.tinhDiem());
    }
}
class HPLyThuyet extends Diem {
    private int  chuyenCan, giuaKy, cuoiKy;
    public HPLyThuyet(String tenHP, int stc, int chc, int gk, int ck){
        super(tenHP, stc);
        this.chuyenCan = chc;
        this.giuaKy = gk;
        this.cuoiKy = ck;
    }
    public String loaiHP(){
        return "HPLyThuyet";
    }
    public double tinhDiem(){
        return this.chuyenCan*0.1 + this.giuaKy * 0.2 + this.cuoiKy*0.7;
    }
    public void hienThi(){
        super.hienThi();
    }
}
class HPThucHanh extends Diem {
    private int  db1, db2, db3;
    public HPThucHanh(String tenHP, int stc, int db1, int db2, int db3){
        super(tenHP, stc);
        this.db1 = db1;
        this.db2 = db2;
        this.db3 = db3;
    }
    public String loaiHP(){
        return "HPThucHanh";
    }
    public double tinhDiem(){
        return (this.db1 + this.db2 + this.db3)/3;
    }
    public void hienThi(){
        super.hienThi();
    }
}

class HPDoAn extends Diem {
    private int  dtv1, dtv2, dtv3, dtv4, dtv5;
    public HPDoAn(String tenHP, int stc, int dtv1, int dtv2, int dtv3, int dtv4, int dtv5){
        super(tenHP, stc);
        this.dtv1 = dtv1;
        this.dtv2 = dtv2;
        this.dtv3 = dtv3;
        this.dtv4 = dtv4;
        this.dtv5 = dtv5;
    }
    public String loaiHP(){
        return "HPDoAn";
    }
    public double tinhDiem(){
        return (this.dtv1 + this.dtv2 + this.dtv3 + this.dtv4 + this.dtv5)/5;
    }
    public void hienThi(){
        super.hienThi();
    }
}

class SinhVien{
    private String hoTen;
    private Diem dm1, dm2;
    public SinhVien(String ht, Diem d1, Diem d2){
        this.hoTen = ht;
        this.dm1 = d1;
        this.dm2 = d2;
    }
    public String layTenHo(){
        return hoTen;
    }
    public Diem layHP1(){
        return dm1;
    }
    public double tinhDTB(){
        return (dm1.tinhDiem()*dm1.laySoTinChi() + dm2.tinhDiem()*dm2.laySoTinChi())/(dm1.laySoTinChi()+dm2.laySoTinChi());
    }
    public void hienThi(){
        System.out.println("Ho ten: "+ hoTen + " diem trung binh: " + this.tinhDTB());
    }
}
/*
class DSSV{
    private SinhVien[] ds;
    private int soSV;
    public DSSV(int n){
        ds = new SinhVien[n];
        soSV = 0;
    }
    public void themSV(SinhVien sv){
        if(soSV < ds.length){
            ds[soSV] = sv;
            soSV++;
        }
    }
    public SinhVien laySV(int viTri){
        if(viTri < soSV){
            return ds[viTri];
        }
        return null;
    }
    public void hienThi(){
        for (int i = 0; i < soSV; i++) {
            ds[i].hienThi();
        }
    }
    public void sapHoTen(){
        SinhVien bienDem;
        for (int i = 0; i < soSV-1; i++) {
            for (int j = i+1; j < soSV; j++) {
                if(ds[i].layTenHo().compareTo(ds[j].layTenHo()) > 0){
                    bienDem = ds[i];
                    ds[i] = ds[j];
                    ds[j] = bienDem;
                }
            }
        }
    }
    public SinhVien timTen(String ten){
        for (int i = 0; i < soSV; i++) {
            if (ds[i].layTenHo().equals(ten)) {
                return ds[i];
            }
        }
        return null;
    }
    public void xoaSV(String ten){
        for (int i = 0; i < soSV; i++) {
            if (ds[i].layTenHo().equals(ten)) {
                for (int j = i; j < soSV-1; j++) {
                    ds[j] = ds[j+1];
                }
                soSV--;
            }
        }
    }
}

class DSSVLIST {
    private Vector ds;
    public DSSVLIST(){
        ds = new Vector<>();
    }
    public void themSV(SinhVien sv){
        ds.addElement(sv);
    }
    public SinhVien laySinhVien(int viTri){
        return ds.get(viTri);
    }
    public void hienThi(){
        for (SinhVien sv : ds) {
            sv.hienThi();
        }
    }
    public void sapHoTen(){
        SinhVien bienDem, obj1, obj2;
        for (int i = 0; i < ds.size()-1; i++) {
            obj1 = ds.get(i);
            for (int j = i+1; j < ds.size(); j++) {
                obj2 = ds.get(j);
                if (obj1.layTenHo().compareTo(obj2.layTenHo()) > 0) {
                    bienDem = ds.get(i);
                    ds.set(i, ds.get(j));
                    ds.set(j, bienDem);
                }
            }
        }
    }
    public SinhVien timTen(String ten){
        for (SinhVien sv : ds) {
            if (sv.layTenHo().equals(ten)) {
                return sv;
            }
        }
        return null;
    }
    public void xoaSV(Sring ten){
        for (SinhVien sv : ds) {
            if (sv.layTenHo().equals(ten)) {
                ds.remove(sv);
            }
        }
    }
    
}
 */
class SuDung{
    public static void main(String[] args) {
        //SinhVien a = new SinhVien("Nguyen Van Teo", new HPLyThuyet("MacLeNin", 3, 7, 7, 10), new HPThucHanh("Lap rap may tinh", 1, 10, 10, 10));
        //a.hienThi();
        //a.layHP1().hienThi();

        SinhVien b = new SinhVien("Nguyen Van Ti", new HPLyThuyet("MacLeNin", 3, 7, 7, 10), new HPDoAn("Chem Gio", 10, 9, 9,9,9,9));
        b.hienThi();
    }

}