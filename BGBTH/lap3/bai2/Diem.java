package lap3.bai2;

public class Diem {
    private double x,y;

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double khoangCach(Diem p){
        return Math.sqrt(Math.pow(this.x - p.x,2) + Math.pow(this.y - p.y,2));
    }

    public double getX(){ return x; }
    public double getY(){ return y; }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    
}
