import java.util.Scanner;

public class lap11 {

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <0){
            System.out.println("Giai thua khong xac dinh co so am");

        }else{
            long factorial = 1;
            for (int i=1;i<=n;i++){
                factorial *= i;
            }
            System.out.println("Giai thua cua " + n + " la: " + factorial);
        }

        sc.close();

    }
}