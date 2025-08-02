import java.util.Scanner;

public class lap12 {
    // ham nhap mang n so nguyen

    public static void nhapmang(int a[], int n, Scanner scaner){
        for (int i=0; i<n; i++){
            System.out.print("Nhap so nguyen thu " + (i+1) + ": ");
            a[i] = scaner.nextInt();
        }
    }

    //ham kiem tra so nguyen to
    public static boolean lasonguyento(int n){
        if(n < 2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
            
        }return true;
    }

    // ham main
    public static void main(String[] a){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = scanner.nextInt();
        int b[] = new int[n];
        nhapmang (b,n, scanner);
        System.out.println("cac so nguyen to trong mang la: ");
        for (int i=0; i<n;i++){
            if(lasonguyento(b[i])) System.out.println(b[i]);
        }
        System.exit(0);
        scanner.close();
    }
}
