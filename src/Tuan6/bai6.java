package Tuan6;

//Import Library
import java.util.Scanner;
import java.util.Arrays;
import java.lang.NullPointerException;


public class bai6 {
    private long maSV;
    private String tenSV;
    private double mark;
    private int age;
    private String lop;
    private static int n;


    public bai6 () {

    }
    
    public bai6 (long maSV, String tenSV, double mark , int age, String lop) {
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

    public static void showData(bai6 sv[]) {

        System.out.println("");
        System.out.println("===================================Thong tin sinh vien. ============================================");
        System.out.println("");
        
        
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %20s | %10s | %10s | %10s |\n", 
        "ID", "Full Name", "Diem TB", "Tuoi", "Lop", "Hoc bong");
        System.out.println("----------------------------------------------------------------------------------------------------");

        for(int i = 0; i <= sv.length-1; i++) {
            // String c;
            // if(sv[i].getHocBong()) ? "Co" : "Khong"
            System.out.printf("| %-10s | %-20s | %20.1f | %10d | %10s | %10s  |\n", 
            sv[i].getID(), sv[i].getName(), sv[i].getMark(), sv[i].getAge(), sv[i].getLop(),(sv[i].getHocBong()) ? "Co" : "Khong" );
        }
        
        
        System.out.println("----------------------------------------------------------------------------------------------------");
       

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

    public static void getInfByID (bai6 sv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID ma ban muon tim kiem: ");
        long ID = sc.nextLong();
        for(int i = 0; i < sv.length; i++) 
        {     if (ID == sv[i].maSV) {

            System.out.println("");
        System.out.println("===================================Day la thong tin cua sinh vien co ID la: " + ID + " ============================================");
        System.out.println("");
        
        
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %20s | %10s | %10s | %10s |\n", 
        "ID", "Full Name", "Diem TB", "Tuoi", "Lop", "Hoc bong");
        System.out.println("----------------------------------------------------------------------------------------------------");

        
            // String c;
            // if(sv[i].getHocBong()) ? "Co" : "Khong"
            System.out.printf("| %-10s | %-20s | %20.1f | %10d | %10s | %10s  |\n", 
            sv[i].getID(), sv[i].getName(), sv[i].getMark(), sv[i].getAge(), sv[i].getLop(),(sv[i].getHocBong()) ? "Co" : "Khong" );
        
        
        
        System.out.println("----------------------------------------------------------------------------------------------------");
       

        }}
    }

    public static void InfHocBong (bai6 sv[]) {
        
        
            for (int i = 0; i < sv.length; i++) {
                 if (sv[i].getHocBong()) {
                    System.out.println("==================Cac Sinh Vien duoc hoc bong la: ====================================");
                    System.out.printf("| %-10s | %-20s | %20s | %10s | %10s |\n", "ID", "Full Name", "Diem TB", "Tuoi", "Lop");
                System.out.println("-----------------------------------------------------------------------------------------");    
                }
                    break;
            }


            for (int i = 0; i < sv.length; i++) {
            if (sv[i].getHocBong()) {
                System.out.printf("| %-10s | %-20s | %20.1f | %10d | %10s |\n", 
            sv[i].getID(), sv[i].getName(), sv[i].getMark(), sv[i].getAge(), sv[i].getLop() );
                
            }
            else {
                System.out.println("Khong co sinh vien nao duoc hoc bong!");
            }

        }
        System.out.println("");

    }

    public static void addElenment (bai6 sv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Vi Tri Ban Muon Them: ");
        int k = sc.nextInt();
        for (int i = sv.length-1; i > k-1; i-- ) { 
            sv[i] = sv[i-1];
        }
        
        //Tao Mot doi tuong sinh vien moi:
        bai6 newSV = new bai6();

        System.out.print("Nhap MSSV: ");
        newSV.maSV = sc.nextLong();
        sc.nextLine();

        System.out.print("Nhap Ten: ");
        newSV.tenSV = sc.nextLine();

        //Nhap diem voi dieu kien (0 <= DiemTB <= 10) 
       for (;;) {
           System.out.print("Nhap diem trung binh: ");
           newSV.mark = sc.nextDouble();
           if (newSV.mark <= 10 && newSV.mark >= 0) {
               break;
           }
       }

       // Nhap tuoi cho sinh vien voi dieu kien: tuoi >= 18
        do {
       System.out.print("Nhap tuoi cho sinh vien: ");
       newSV.age = sc.nextInt();
       } while(newSV.age < 18);
       sc.nextLine();
       
       //Nhap lop cho sinh vien voi dieu kien bat dau bang ki tu "DCT" hoac "DKP"
      for (;;) {
       System.out.print("Nhap ten lop cho sinh vien: ");
       newSV.lop = sc.nextLine();
       if(newSV.lop.substring(0, 3) != "DKP" ||
       newSV.lop.substring(0, 3) != "DCT" ||
       newSV.lop.substring(0, 3) != "dct" ||
       newSV.lop.substring(0, 3) != "dkp") {
           break;
       }
       } 

       //Gắn đối tượng newSV vào Đôis tượng sv[k-1] của mảng đối tượng.
       sv[k-1] = newSV;
        
    }
//
    
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap so sinh vien: ");
                n =sc.nextInt();
                bai6 sv[] = new bai6[n];
                System.out.println("");
                //Nhap Thong Tin Cho Sinh Vien.
                for (int i =0; i < n; i++) {
                    System.out.println("Nhap thong tin sinh vien thu " + (i+1) + "! ");
                    sv[i] = new bai6();
                    sv[i].createData();
                    System.out.println("");

                }

                //Show Thong Tin Sinh Vien.
                // getInfByID(sv);
                // InfHocBong(sv);
                

                
                //Stat at to add element
                n += 1;
                bai6 arr[] = new bai6[1];
                arr = Arrays.copyOf(sv, sv.length + 1); 
                addElenment(arr);
                showData(arr);
                // Break to stop Function Add Element.
                
                
                // showData(sv);

                // Tính năng: 
                // 1. ADD 
                // 2. Delete
                // 3. Find
                // 4. Check Học Bổng
                // 5. Show Thông tin
                // 0. Exit

                

    }

  


}
