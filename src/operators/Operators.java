package operators;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhap so nguyen thu nhat: ");
        a = input.nextInt();
        System.out.println("Nhap so nguyen thu hai: ");
        b = input.nextInt();
        int Tong = a+b;
        int Hieu = a-b;
        int Tich = a*b;
        if(b!=0)
        {
            double Thuong =(double) a/b;
            int Phepdu = a%b;
            System.out.println("Tong = "+Tong);
            System.out.println("Hieu = "+Hieu);
            System.out.println("Tich = "+Tich);
            System.out.println("Thuong = "+Thuong);
            System.out.println("Phep du = "+Phepdu);
        }
        else
        {
            System.out.println("Tong = "+Tong);
            System.out.println("Hieu = "+Hieu);
            System.out.println("Tich = "+Tich);
            System.out.println("Khong the chia cho 0");
        }
        input.close()  ;  
    } 
}