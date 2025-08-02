import java.util.Scanner;
public class lap13 {

    //ham nhap mang 
    public static void nhapmang(int a[], int n, Scanner scaner){
        
        for (int i=0; i<n; i++){
            System.out.print("Nhap so nguyen thu " + (i+1) + ": ");
            a[i] = scaner.nextInt();
        }
    }

    //ham kiem tra so chinh phuong
    public static boolean isPerfectSquare(int x) {
        int s = (int)Math.sqrt(x);
        return s * s == x;
    }

    //ham kiem tra so Fibonacci
    public static boolean isFibonacci(int n){
        int x1 = 5*n*n + 4;
        int x2 = 5*n*n - 4;
        return isPerfectSquare(x1) || isPerfectSquare(x2);
    }

    // ham main
    public static void main(String[] arg){

        Scanner scaner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scaner.nextInt();
        int a[] = new int[n];
        nhapmang(a, n, scaner);
        System.out.println("Cac so Fibonacci trong mang la:");
        for (int i = 0; i < n; i++) {
            if (isFibonacci(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
        
        scaner.close();
    }
    
}
