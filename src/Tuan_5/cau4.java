package Tuan_5;

import java.util.Scanner;

public class cau4 {
    private String maSo;
    private String hoTen;
    private char xepLoai;
    private int ngayCong;
    private double luong;

    final int mucLuong = 200000;

    
    public cau4() {

    }

            public cau4(String maSo, String hoTen, int ngay ) {
                this.maSo = maSo;
                this.hoTen = hoTen;
                this.ngayCong = ngay;
            }

            public String getMaSo () {
            return maSo;
            }

            public String getName () {
            return hoTen;
            }

            public int getNgayCong () {
            return ngayCong;
            }
   
            public void creatData () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ma so nhan vien: ");
            maSo = sc.nextLine();
            System.out.print("Nhap ten: ");
            hoTen = sc.nextLine();
            System.out.print("Nhap so ngay cong cua nhan vien: ");
            ngayCong = sc.nextInt();
            }

            public char getLoai () {
            char c;
            if ( ngayCong > 26 ) {
                xepLoai = 'A';
                c = 'A';
                return c;

            }
            else if (ngayCong >= 22 && ngayCong <= 26) {
                xepLoai = 'B';
                c = 'B';
                return c;
            }
            else {
                xepLoai = 'C';
                c = 'C';
                return c;
            }
            }

            public double tinhLuong() {
                //Tinh toan luong cho nhan vien.
                double luong1;
                if (xepLoai == 'A') {
                luong1 = ((mucLuong * ngayCong) + ((mucLuong * ngayCong) * 0.05)) ;
                luong = (int) luong1;
                return luong;
                }
                else if(xepLoai == 'B') {
                luong1 = (mucLuong * ngayCong) + ((mucLuong * ngayCong) * 0.02) ;
                luong = (int) luong1;
                return luong;
                }
                else {
                luong1 = (int) (mucLuong * ngayCong);
                luong = (int) luong1;
                return luong;
                }
    
                }

            public static void showData(cau4 nv[]) {
            System.out.println("");
            System.out.println("=============================Thong tin nhan vien =======================================");
            System.out.println("");

            
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.printf("| %-10s | %-20s | %20s | %10s | %10s |\n", 
            "ID", "Full Name", "Ngay Cong", "Xep Loai", "Salary");
            System.out.println("------------------------------------------------------------------------------------------");

            for(int i = 0; i < nv.length; i++) {
                System.out.printf("| %-10s | %-20s | %20d | %10c | %10.0f |\n", 
                nv[i].getMaSo(), nv[i].getName(), nv[i].getNgayCong(), nv[i].getLoai(), nv[i].tinhLuong());
            }
            
            
            System.out.println("------------------------------------------------------------------------------------------");
            }
               
            

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Hay nhap so nhan vien cua ban: ");
                int n = sc.nextInt();
                cau4 nv[] = new cau4[n];
                //Truyen Data cho nhan vien trong cong ty!
                for (int i = 0 ; i < n ; i++) {
                    nv[i] = new cau4();
                    System.out.println();
                    System.out.println("Nhap thong tin cho nhan vien so " + i + "!");
                    nv[i].creatData();
                }

                showData(nv);

            }



    
}
