package Tuan_5;

import java.util.Scanner;

public class cau3 {
    private String name;
    private String maSo;
    private double diemLT;
    private double diemTH;

    public cau3() {

    }

    public cau3(String name, String so, double TH, double LT) {
        this.name = name;
        this.maSo = so;
        this.diemLT = LT;
        this.diemTH = TH;
    }

    public void creat () {
           

            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập tên sv: ");
            this.name = sc.nextLine();
            System.out.print("Nhập số ma so sinh vien : ");
            this.maSo = sc.nextLine();
            System.out.print("Nhap Diem LT: ");
            this.diemLT = sc.nextDouble();
            System.out.print("Nhap Diem TH: ");
            this.diemTH = sc.nextDouble();

            

    }

    public void show() {
        System.out.println("ID: " + maSo);
        System.out.println("Name: " + name);
        System.out.println("Diem TH: " + diemTH);
        System.out.println("Diem LT: " + diemLT);
        System.out.println("Dien TB cua sinh vien la: " + getAVG());
    }


    public String getName() {
        return name;
    }

    public int getSo() {
        return maSo;
    }
    
    public double getDiemLT()
    {
        return diemLT;
    }

    public double getDiemTH()
    {
        return diemTH;
    }

    public double getAVG() {
        double diemTrungBinh;
        diemTrungBinh = (diemLT + diemTH) / 2;

        return diemTrungBinh;
    }

    public static void main(String[] args) {
        cau3 sv1 = new cau3();
        sv1.creat();  
        sv1.show();      

    }

}
