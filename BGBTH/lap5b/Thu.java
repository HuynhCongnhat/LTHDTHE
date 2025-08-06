package lap5b;

class Thu extends BuuPham {
    private boolean baoDam;

    public Thu(boolean baoDam) {
        super("Thu");
        this.baoDam = baoDam;
    }

    @Override
    public int tinhTien() {
        return baoDam ? 2000 : 800;
    }

    public boolean isBaoDam() {
        return baoDam;
    }

    @Override
    public void hienThi() {
        System.out.println("- " + (baoDam ? "Thu bao dam " : "Thu thuong") + " | Gia: " + tinhTien() + "VND");
    }
}
