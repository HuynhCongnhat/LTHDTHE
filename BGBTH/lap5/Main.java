package lap5;

public class Main {
    public static void main(String[] arg){
        SinhVien[] ds = new SinhVien[3];

        ds[0] = new SinhVien ("Nguyen Van A", 
                new HPLyThuyet("CTDL-GT", 3, 9, 8, 7),  
                new HPThucHanh("Java lap", 2, 10, 9, 10));

        ds[1] = new SinhVien ("Nguyen Van B",
                new HPLyThuyet("Toan roi rac", 3, 5, 6, 7),  
                new HPThucHanh("Lap trinh C++ lap", 2, 8, 9, 10));

        ds[2] = new SinhVien ("Nguyen Van C",
                new HPLyThuyet("Dai so", 3, 6, 7, 8),
                new HPThucHanh("Lap trinh Python", 2, 9, 10, 10));

        for (SinhVien sv : ds){
            sv.hienThi();
        }
    }
    
}
