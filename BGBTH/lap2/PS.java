package lap2;

import java.util.Arrays;

public class PS {
    private int tu, mau;

    public PS() {
        this.tu = 0;
        this.mau = 1;
    }

    public PS(int n){
        this.tu = n;
        this.mau = 1;

    }

    public PS(int t, int m){
        this.tu = t;
        this.mau = (m == 0) ? 1 : m;
        rutGon();
    }

    public PS(PS p){
        this.tu = p.tu;
        this.mau = p.mau;
    }

    public void ganTu(int t){
        this.tu = t;
    }

    public int layTu(){
        return this.tu;
    }

    public void ganMau(int m){
        this.mau = (m == 0) ? 1 : m;
    }

    public int layMau(){
        return this.mau;
    }

    public void hienThi(){
        System.out.println(this.toString());
    }

    private int UCLN(int a,int b){
        if(b == 0) return a;
        return UCLN(b, a%b);
    }

    public void rutGon(){
        int gcd = UCLN(Math.abs(tu), Math.abs(mau));
        tu /= gcd;
        mau /= gcd;
        if(mau <0){
            tu = -tu;
            mau = -mau;
        }
    }

    public void tang(int n){
        tu += n*mau;
        rutGon();
    }

    public void giam(int n){
        tu -= n*mau;
        rutGon();
    }

    public PS cong(int n){
        PS kq = new PS(this.tu + n *this.mau, this.mau);
        kq.rutGon();
        return kq;
    }

    public PS cong (PS p){
        int newTu = this.tu * p.mau + p.tu * this.mau;
        int newMau = this.mau * p.mau;
        return new PS(newTu, newMau);
    }

    public PS tru(int n){
        return cong(-n);
    }

    public PS tru(PS p){
        int newTu = this.tu * p.mau - p.tu * this.mau;
        int newMau = this.mau * p.mau;
        return new PS(newTu, newMau);
    }

    public PS nhan(int n){
        return new PS(this.tu * n, this.mau);
    }
    
    public PS nhan(PS p) {
        return new PS(this.tu * p.tu, this.mau * p.mau);
    }

    public PS chia(int n) {
        return new PS(this.tu, this.mau * n);
    }

    public PS chia(PS p) {
        return new PS(this.tu * p.mau, this.mau * p.tu);
    }

    public String toString() {
        return tu + "/" + mau;
    }

    public int soSanh(PS p) {
        int left = this.tu * p.mau;
        int right = p.tu * this.mau;
        return Integer.compare(left, right); // >0: this > p, 0: =, <0: this < p
    }

    public static void main(String[] args) {
        // Tạo p = 1/2, q = 5/7
        PS p = new PS(1, 2);
        PS q = new PS(5, 7);

        // r = p + q, hiển thị r
        PS r = p.cong(q);
        System.out.print("p + q = ");
        r.hienThi();

        // t = 2*p - q, hiển thị t
        PS t = (p.nhan(2)).tru(q);
        System.out.print("t = 2*p - q = ");
        t.hienThi();

        // So sánh 2 phân số p và q
        int cmp = p.soSanh(q);
        if (cmp < 0)
            System.out.println("p < q");
        else if (cmp == 0)
            System.out.println("p = q");
        else
            System.out.println("p > q");

        // Mảng phân số gồm 5 phần tử
        PS[] arr = {
            new PS(1, 2),
            new PS(13, 2),
            new PS(5, 7),
            new PS(6, 9),
            new PS(30, 23)
        };

        // Sắp xếp tăng dần
        Arrays.sort(arr, (a, b) -> a.soSanh(b));

        System.out.println("Các phân số sau khi sắp xếp tăng dần:");
        for (PS ps : arr) {
            System.out.println(ps);
        }
    }

}
