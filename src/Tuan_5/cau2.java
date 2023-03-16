package Tuan_5;

import java.util.Scanner;
import java.lang.Math;

public class cau2 {
    int a;
    int b; 
    int c;

    public  int geta () {
        return a;
    } 

    public  int getb () {
        return b;
    } 

    public  int getc () {
        return c;
    } 

    public void inputData () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        c = sc.nextInt();
    }

    public void chuvi () {
        int chuVi;
        chuVi = a + b + c;
        System.out.println("The value of Chu Vi la: " + chuVi);
        
    }

    public void dienTich () {
        double s;
        double p = (a + b + c)/2;
        s = Math.sqrt(p * (p - a ) * (p - b) * (p - c ) );
        System.out.println("The value of Dien Tich la: " + s);
    }

    public static void main(String[] args) {
        cau2 tamGiac = new cau2();
        tamGiac.inputData();
        tamGiac.chuvi();
        tamGiac.dienTich();
        
    }



    
}



// bai tap cần làm: Bài số 3, 4.
// Note: Có thể làm thêm bài số 5.

// lớp - đối tượng
// biết cách tạo đối tượng
// constructor.
// Dùng Setter/Getter.
// Method.
// atribute.