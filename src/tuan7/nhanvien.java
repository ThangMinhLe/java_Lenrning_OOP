package tuan7;

import java.security.PublicKey;
import java.lang.NullPointerException;
import java.util.*;
import java.util.Arrays;

public class nhanvien extends canbo {
    public String congViec;
    nhanvien ds[] = new nhanvien[0];
    static Scanner sc = new Scanner(System.in);
   
    @Override
    public void creatData () {
        super.creatData();
        System.out.print("Nhap cong viec cho nhan vien: ");
        this.congViec = sc.nextLine();

    }

    public void showData () {
        System.out.printf("%-20s %-10s %-10d %-20s %20s\n" , this.name, this.gioiTinh, this.namsinh, this.diachi, this.congViec );

    }
    // Ham Find by Name. 
    // public void find (nhanvien nv[]) {
    //     System.out.print("Moi nhap ten ban muon tim kiem: ");
    //     String findName = sc.nextLine();
    //     for(int i =0; i < nv.length; i++) {
    //         if(nv[i].name.equalsIgnoreCase(findName)) {
    //             System.out.println("Co " + findName + " trong danh sach");
    //             break;
    //         }
    //     }
    //     System.out.println("Khong co " + findName + " trong danh sach");
       
       
    // }

    public boolean timKiem(String st) {
        for (nhanvien x : ds) {
            if (st.equals(x.name)) {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        System.out.print("Nhap mang nhan vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        nhanvien nv[] = new nhanvien[0];

        for (int i = 0 ; i < n ; i++) {
            // nv[i] = new nhanvien();
           
            nv = Arrays.copyOf(nv, nv.length + 1);
            nv[i] = new nhanvien();
            nv[i].creatData();
        }


        // Show data
        System.out.printf("%-20s %-10s %-10s %-20s %20s\n", "Name", "Gio Tinh", "Nam Sinh", "Dia Chi", "Cong Viec");
        for (int i = 0 ; i < nv.length; i++) {
            nv[i].showData();
        }
    }

}
