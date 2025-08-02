package lap3.Bai1;

public class Main {
    // public static void main(String[] arg){
    //     SinhVien[] sv = new SinhVien[3];
    //     sv[0] = new SinhVien("Nguyen Van A", new Diem("Toan", 3, 8, 7, 9), new Diem("Ly", 2, 6, 8, 7));
    //     sv[1] = new SinhVien("Tran Thi B", new Diem("Van", 3, 9, 8, 10), new Diem("Hoa", 2, 7, 6, 8));
    //     sv[2] = new SinhVien("Le Van C", new Diem("Su", 3, 5, 6, 7), new Diem("Dia", 2, 8, 9, 10));

    //     for(SinhVien s : sv){
    //         System.out.println(s);
    //         System.out.println("---------------------");
    //     }
    // }
    
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("Nguyen Van A");
        sv.themDiem(new Diem("Toan", 3, 8, 7, 9));
        sv.themDiem(new Diem("Ly", 2, 6, 8, 7));
        sv.themDiem(new Diem("Hoa", 2, 7, 6, 8));

        System.out.println(sv);
    }
}
