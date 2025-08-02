package lap2;

public class ATM {
    private String soTK;
    private double soDu;

    public ATM(String soTK, double soDu){
        this.soTK = soTK;
        this.soDu = soDu;
    }

    public String laySTK(){
        return this.soTK;
    }

    public double laySoDu(){
        return this.soDu;
    }

    public String toString(){
        return "So tai khoan: " + this.soTK + ",So du: "+ this.soDu;
    }

    public void napTien(double soTien){
        if(soTien > 0){
            this.soDu += soTien;
            System.out.println("nap tien thanh cong! So du hien tai: " + this.soDu);
        } else {
            System.out.println("so tien nap vao khong hop le!");
        }
    }
    

    public boolean rutTien(double soTien){
        if(soTien > 0  && soTien <= this.soDu){
            this.soDu -= soTien;
            System.out.println("Rut tien thanh cong ! So du hien tai: "+ this.soDu); 
            return true;
        }
        else {
            System.out.println("Rut tien khong thanh cong! Sodu hien tai: " + this.soDu);
            return false;
            
        }
    }

    public boolean chuyenTien(ATM tk, double soTien){
        if(soTien >0 && soTien <= this.soDu){
            this.soDu -= soTien;
            tk.napTien(soTien);
            System.out.println("chuyen tien thanh cong! So du hien tai: " + this.soDu);
            return true;
        }else{
            System.out.println("Chuyen tien khong thanh cong! So du hien tai: " + this.soDu);
            return false;
        }
    }

    public static void main(String[] arg){
        ATM[] dsAtm = new ATM[5];
        dsAtm[0] = new ATM("111111111", 1000000);
        dsAtm[1] = new ATM("922222222", 500000);
        dsAtm[2] = new ATM("333333333", 200000);
        dsAtm[3] = new ATM("444555666", 750000);
        dsAtm[4] = new ATM("777888999", 300000);

        //tai khoan 111111111 nap tien vao tai khoan 1000
        dsAtm[0].napTien(1000);

        // tai khoan 111111111 chuyen tien cho tai khoan 922222222 so tien 500
        dsAtm[0].chuyenTien(dsAtm[1], 500);

        // tai khoan 333333333 rut tien 200
        dsAtm[2].rutTien(200);

        // in so tien hien co cua cac tai khoan
        System.out.println("So du hien tai cua cac tai khoan: ");
        for (ATM atm : dsAtm){
            System.out.println(atm);
        }

        // in tong so tien trong tat ca cac tai khoan
        double tongSoDu = 0;
        for (ATM atm : dsAtm){
            tongSoDu += atm.laySoDu();
        }
        System.out.println("Tong so tien trong tat ca cac tai khoan: " + tongSoDu);




    }
}
