package Tuan_5;

import java.io.ObjectOutputStream.PutField;
import java.util.Scanner;

public class cau5 {
    private long maSV;
    private String tenSV;
    private double mark;
    private int age;
    private String lop;


    public cau5 () {

    }
    
    public cau5 (long maSV, String tenSV, double mark , int age, String lop) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.mark = mark;
        this.age = age; 
        this.lop = lop;

    }

    public void createData () {
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Nhap MSSV: ");
         maSV = sc.nextLong();
         sc.nextLine();

         System.out.print("Nhap Ten: ");
         tenSV = sc.nextLine();

         //Nhap diem voi dieu kien (0 <= DiemTB <= 10) 
        for (;;) {
            System.out.print("Nhap diem trung binh: ");
            mark = sc.nextDouble();
            if (mark <= 10 && mark >= 0) {
                break;
            }
        }

        // Nhap tuoi cho sinh vien voi dieu kien: tuoi >= 18
         do {
        System.out.print("Nhap tuoi cho sinh vien: ");
        age = sc.nextInt();
        } while(age < 18);
        sc.nextLine();
        
        //Nhap lop cho sinh vien voi dieu kien bat dau bang ki tu "DCT" hoac "DKP"
       for (;;) {
        System.out.print("Nhap ten lop cho sinh vien: ");
        lop = sc.nextLine();
        if(lop.substring(0, 3) != "DKP" ||
        lop.substring(0, 3) != "DCT" ||
        lop.substring(0, 3) != "dct" ||
        lop.substring(0, 3) != "dkp") {
            break;
        }
        } 
            
    } 

    public static void showData(cau5 sv[]) {

        System.out.println("");
        System.out.println("=============================Thong tin sinh vien. =======================================");
        System.out.println("");
        
        
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %20s | %10s | %10s |  %10s  |\n", 
        "ID", "Full Name", "Diem TB", "Tuoi", "Lop", "Hoc bong");
        System.out.println("------------------------------------------------------------------------------------------");

        for(int i = 0; i < sv.length; i++) {
            // String c;
            // if(sv[i].getHocBong()) ? "Co" : "Khong"
            System.out.printf("| %-10s | %-20s | %20.1f | %10d | %10s | %10s  |\n", 
            sv[i].getID(), sv[i].getName(), sv[i].getMark(), sv[i].getAge(), sv[i].getLop(),(sv[i].getHocBong()) ? "Co" : "Khong" );
        }
        
        
        System.out.println("------------------------------------------------------------------------------------------");
       

    }

    public double getMark () {
        return mark;
    }

    public int getAge () {
        return age;
    }

    public Long getID () {
        return maSV;

    }

    public String getName () {
        return tenSV;
    }

    public String getLop () {
        return lop;
    }

    public boolean getHocBong () {
        if(mark >= 8 && mark <= 10) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap so sinh vien: ");
                int n =sc.nextInt();
                cau5 sv[] = new cau5[n];
                System.out.println("");
                //Nhap Thong Tin Cho Sinh Vien.
                for (int i =0; i < n; i++) {
                    System.out.println("Nhap thong tin sinh vien thu " + (i+1) + "! ");
                    sv[i] = new cau5();
                    sv[i].createData();
                    System.out.println("");

                }

                //Show Thong Tin Sinh Vien.
                showData(sv);
                

    }

  

    }

