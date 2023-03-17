package Tuan_5;

import java.util.Scanner;

public class cau3main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
            int n = sc.nextInt();  
        cau3 sv[] = new cau3[n];
        
        for (int i = 0; i < n; i++) {
            
            sv[i] = new cau3();
            System.out.println("Nhap thong tin cho sinh vien thu " + i + " ! ");
            sv[i].creat();
        }

        showTable(sv);


    }

    public static void showTable (cau3 sv[]) {
        System.out.println("");
        System.out.println("================Thong tin sinh vien ==========================");
        System.out.println("");

        
    System.out.println("-------------------------------------------------");
    System.out.printf("| %-10s | %-20s | %7s | %7s | %7s |\n", 
    "ID", "Full Name", "Diem LT", "Diem TH", "Diem TB");
    System.out.println("-------------------------------------------------");

   for(int i = 0; i < sv.length; i++) {
        System.out.printf("| %-10s | %-20s | %7.2f | %7.2f | %7.2f |\n", 
        sv[i].getSo(), sv[i].getName(), sv[i].getDiemLT(), sv[i].getDiemTH(), sv[i].getAVG());
    }
    System.out.println("-------------------------------------------------");
    }

}
