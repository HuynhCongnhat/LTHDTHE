package lap3.bai2;

import java.util.Comparator;
import java.util.Arrays;

public class Main {
    public static void main(String[] arg){
        HCN[] arr = new HCN[5];
        arr[0] = new HCN(new Diem(0, 0), new Diem(2, 3));
        arr[1] = new HCN(new Diem(6, 8), new Diem(4, 5));
        arr[2] = new HCN(new Diem(-2, -1), new Diem(2, 2));
        arr[3] = new HCN(new Diem(3, 3), new Diem(6, 7));
        arr[4] = new HCN(new Diem(7,2), new Diem(3, 6));

        System.out.println("Danh sach hinh chu nhat");

        for(HCN h : arr){
            System.out.println(h +"  Chu vi "+ h.chuVi()+ " Dien tich " + h.dienTich());
        }

        Arrays.sort(arr, Comparator.comparingDouble(HCN::dienTich));

        System.out.println(" sau khi sap xep theo dien tich");
        for(HCN h : arr){
            System.out.println(h + " chu vi " + h.chuVi() + " Dien tich " + h.dienTich());
        }

    }
    
}
