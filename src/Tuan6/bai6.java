package Tuan6;

//Import Library
import java.util.Scanner;

import javafx.scene.control.Menu;
import javafx.scene.media.Media;

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
            if ( mark >= 0 && mark <= 10 ) {
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
        if(lop.substring(0, 3).toUpperCase() != "DKP" ||
        lop.substring(0, 3).toUpperCase() != "DCT" )
        {
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

        if(k < 1 ) {
            k = 1;
        }
        else if (k > sv.length) {
            k = sv.length;
        }

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
           if ( newSV.mark >= 0 && newSV.mark <= 10 ) {
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
        
                if(newSV.lop.substring(0, 3).toUpperCase() != "DKP" ||
                    newSV.lop.substring(0, 3).toUpperCase() != "DCT" )
                {
                break;
                }
        } 

            

       //Gắn đối tượng newSV vào Đôis tượng sv[k-1] của mảng đối tượng.
       sv[k-1] = newSV;
        
    }
               
            // Ham xap xep.
    public static void xapxep(bai6 sv[]) {
        int n = sv.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (sv[j].mark < sv[minIndex].mark) {
                    minIndex = j;
                }
            }
            bai6 temp = new bai6();
            temp = sv[i];
            sv[i] = sv[minIndex];
            sv[minIndex] = temp;
        }
    }
                
            //Ham Delete.
    public static void deleteElenment (bai6 sv[]) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Nhap Vi Tri Ban Muon Xoa: ");
                    int k = sc.nextInt();

                    if(k < 0 ) {
                        k = 0;
                    }
                    else if (k > sv.length) {
                        k = sv.length - 1;
                    }

                    for (int i = k; i < sv.length - 2; i++ ) { 
                        sv[i] = sv[i+1];
                    }}

    public static char getCharAfterLastWhiteSpace(String str) {
                        str = str.trim();
                        int lastSpaceIndex = str.lastIndexOf(' ');
                        if (lastSpaceIndex != -1 && lastSpaceIndex < str.length() - 1 && lastSpaceIndex < str.length() - 1) {
                            return str.charAt(lastSpaceIndex + 1);
                        } else {
                            // Nếu không tìm thấy khoản trắng cuối cùng hoặc kí tự đằng sau khoản trắng cuối cùng là kí tự cuối cùng của chuỗi
                            // Trả về kí tự rỗng
                            return '\0';
                        }
                    }
        
    public static void demA (bai6 sv[]) {
        int Count = 0;
        for(int i = 0; i < sv.length; i++) {
            
            

            if (sv[i].tenSV.contains(" ")) {
                char str = getCharAfterLastWhiteSpace(sv[i].tenSV.toUpperCase());
                if (str == 'A') {
                    Count += 1;
                }
            }
            else {
                char c = sv[i].tenSV.charAt(0);
                c = Character.toUpperCase(c);
                if(c == 'A'){
                    Count += 1; 
                }
            }

                }      

        System.out.println("Co " + Count + " ban co ten bat dau bang chu A");

    }

    public static void updateData(bai6 sv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vi tri sinh vien can Update: ");
        int i = sc.nextInt();

        if (i >= sv.length) {
            i = sv.length - 1; 
        }else if (i < 0) {
            i = 0;
        }

           int k;
            
            do {
                    do{
                        System.out.println("==================Thong tin sinh vien can Update Thong Tin: ====================================");
                System.out.printf("| %-10s | %-20s | %20s | %10s | %10s |\n", "ID", "Full Name", "Diem TB", "Tuoi", "Lop");
                System.out.println("-----------------------------------------------------------------------------------------");    
                System.out.printf("| %-10s | %-20s | %20.1f | %10d | %10s | %10s  |\n", 
                sv[i].getID(), sv[i].getName(), sv[i].getMark(), sv[i].getAge(), sv[i].getLop(),(sv[i].getHocBong()) ? "Co" : "Khong" );
            System.out.println("----------------------------------------------------------------------------------------------------");

                        System.out.println("1: Update ID.");
                        System.out.println("2: Update ten.");
                        System.out.println("3: Update Diem.");
                        System.out.println("4: Update Tuoi.");
                        System.out.println("5: Update Lop.");
                        System.out.println("0: Exit!");
                        System.out.print("Moi ban chon lua chon can update thong tin: ");
                        k = sc.nextInt();

                        if( k < 0 || k > 5) {
                            System.out.println("Lua chon cua ban khong hop le.");
                        }
                    }while( k < 0 || k > 5);

                    switch(k) {
                        case 1: {
                            System.out.print("Nhap lai ID cua sinh vien ban muon cap nhat: ");
                            sv[i].maSV = sc.nextLong();
                            break;
                        }

                        case 2: {
                            System.out.print("Nhap lai ten ban muon cap nhat: ");
                            sc.nextLine();
                            sv[i].tenSV = sc.nextLine();
                            break;
                        }
                        
                        case 3: {
                            for (;;) {
                            System.out.print("Nhap lai diem cua sinh vien ban muon cap nhat: ");
                                sv[i].mark = sc.nextDouble();
                                if ( sv[i].mark >= 0 && sv[i].mark <= 10 ) {
                                    break;
                                }
                            }
                            break;
                        }
                        
                        case 4: {

                            do {
                            System.out.print("Nhap lai tuoi cua sinh vien ban muon cap nhat: ");
                            sv[i].age = sc.nextInt();
                            }while (sv[i].age < 18);
                            
                            break;
                        }
                        
                        case 5: {

                            for (;;) {
                                System.out.print("Nhap lai lop cua sinh vien ban muon cap nhat: ");
                                sc.nextLine();
                                sv[i].lop = sc.nextLine();
                                
                                        if(sv[i].lop.substring(0, 3).toUpperCase() != "DKP" ||
                                            sv[i].lop.substring(0, 3).toUpperCase() != "DCT" )
                                        {
                                        break;
                                        }
                                }
                            
                        }
                    }

            }while( k != 0);
    
                System.out.println("Da Update thanh cong thong tin cho sinh vien ma so " + sv[i].maSV);
                System.out.println("");
            }

            //Ham Menu.
    public static void menu (bai6 sv[]) {
                        Scanner sc = new Scanner(System.in);
                        int option;

                do {
                    
                        do {
                            System.out.println("================================================");
                            System.out.printf("| %-48s |\n","1: ADD. ");
                            System.out.printf("| %-48s |\n","2: DELETE. ");
                            System.out.printf("| %-48s |\n","3: FIND BY ID. ");
                            System.out.printf("| %-48s |\n","4: SHOW THON TIN CAC BAN DUOC HOC BONG. ");
                            System.out.printf("| %-48s |\n","5: XAP XEP. ");
                            System.out.printf("| %-48s |\n","6: DEM SO SINH VIEN BAT DAU BANG CHU 'A'. ");
                            System.out.printf("| %-48s |\n","7: Update. ");
                            System.out.printf("| %-48s |\n","8: SHOW DATA. ");
                            System.out.printf("| %-48s |\n","0: EXIT. ");
                            System.out.println("================================================");
                            System.out.print("Moi ban nhap lua chon: ");
                            option = sc.nextInt(); 
                            if(option < 0 || option > 8) {
                                System.out.println(" Lua chon cua ban khong hop le! ");
                            }
                        }while (option < 0 || option > 8);

                        switch (option) {
                            case 1 :
                            {
                                //Stat at to add element
                                sv = Arrays.copyOf(sv, sv.length + 1); 
                                addElenment(sv);
                                // Break to stop Function Add Element.
                                break;
                            }
                            case 2 :  
                            {   
                                if(sv.length > 0)   
                                {
                                //xoa elment
                                    deleteElenment(sv);
                                    sv = Arrays.copyOf(sv, sv.length - 1);
                                    break;
                                }
                                else {
                                    System.out.println("Mang rong khong the xoa!");
                                    break;

                                }
                            }
                            case 3 : 
                            {
                                //Lay Thing tin sinh vien bat dau bang MaSV
                                getInfByID(sv);
                                break;
                            }
                            case 4 : 
                            {
                                // Hoc Bong
                                InfHocBong(sv);
                                break;
                            }
                           
                            case 5: {
                                // Hoc Bong
                                xapxep(sv);
                                break;

                            }
                            case 6: {
                                // So sinh vien bat dau bang chu A
                               demA(sv);
                                break;
                            }

                            case 7: {
                                updateData(sv);
                                break;
                            }



                            case 8 : 
                            {
                                // Show Data
                                showData(sv);
                                break;
                            }
                        }
                    
                        

                }while (option != 0 );


                    }

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

                //Menu option!
                menu(sv);
                }
                
            
            }
