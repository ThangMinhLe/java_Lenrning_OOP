package tuan7;

import java.lang.Thread.State;
import java.util.*;

public class canbo {
    public String name;
    public String diachi;
    public int namsinh;
    public String gioiTinh;
   
    static Scanner sc = new Scanner(System.in);

    public canbo () {

    }

    public String getName () {
        return this.name;
    }

    public String getgioitinh () {
        return this.gioiTinh;
    } 
    
    public String getDia () {
        return this.diachi;
    } 
    
    public int getnamsinh () {
        return this.namsinh;
    }

    public void creatData () {

        System.out.print("Nhap ten cua can bo: ");
        this.name = sc.nextLine();
        

        for(;;) {
        System.out.print("Nhap gioi tinh cua can bo: ");
        this.gioiTinh = sc.nextLine();
            
            if(this.gioiTinh.equalsIgnoreCase("nam" ) || this.gioiTinh.equalsIgnoreCase("nu")) {
                break;
            }

        }

        do{
        System.out.print("Nhap nam sinh cua can bo: ");
        this.namsinh = sc.nextInt();
        } while((2023 - this.namsinh) < 18);

        System.out.print("Nhap dia chi cua can bo: ");
        sc.nextLine();
        this.diachi = sc.nextLine();

    }

        public  void showData () {
                System.out.printf("%-20s %-10s %-10d %-20s\n" , this.name, this.gioiTinh, this.namsinh, this.diachi );
            
        }

        public static void main(String[] args) {
            // Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so can bo: ");
            int n = sc.nextInt();
            sc.nextLine();
            canbo cb[] = new canbo[n];

            for (int i =0 ; i < n ; i++ ) {
                cb[i] = new canbo();
                cb[i].creatData();
            }

            System.out.printf("%-20s %-10s %-10s %-20s\n", "Name", "Gio Tinh", "Nam Sinh", "Dia Chi");
            for(int i = 0; i <= cb.length - 1; i++) { 
                cb[i].showData();
            }

        }


        
    }

    