package lap3.bai2;

public class HCN {
    private Diem d1,d2;

    public HCN(Diem d1, Diem d2){
        this.d1 = d1;
        this.d2 = d2;
    }

    public double chuVi(){
        double dai = Math.abs(d1.getX() - d1.getY());
        double rong = Math.abs(d2.getX() - d2.getY());
        return 2 * (dai + rong);
    }

    public double dienTich(){
        double dai = Math.abs(d1.getX() - d1.getY());
        double rong = Math.abs(d2.getX() - d2.getY());
        return dai * rong;
    }

    public String toString(){
        return "[" + d1 + ", " + d2 + "]";
    }
    
}
