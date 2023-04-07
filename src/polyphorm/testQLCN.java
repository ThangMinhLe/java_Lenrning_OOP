/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polyphorm;

import java.util.Scanner;

/**
 *
 *
 */
public class testQLCN {
    public static void menu(){
        System.out.println("1.Nhap danh sach");
        System.out.println("2.Xuat danh sach");
        System.out.println("3.Tim kiem phan tu trong danh sach");
        System.out.println("4.Thoat");
    }
    public static void main(String[] args) {
        QLCB2 x = new QLCB2();
        for(;;){
            menu();
            System.out.println("\nMoi nhap lua chon:");
            int luaChon=Integer.parseInt(new Scanner(System.in).nextLine());
            if(luaChon==4)
                break;
            switch(luaChon){
                case 1: x.taoDS();break;
                case 2: x.xuatDS();break;
                case 3: System.out.println("Moi nhap gia tri can tim kiem:");
                    String st= new Scanner(System.in).nextLine();
                    if(x.timKiem(st))
                        System.out.println("Co "+st+"trong danh sach cong nhan");
                    else
                        System.out.println("khong Co "+st+"trong danh sach cong nhan");
                break;
                //case 4: break;
                default:System.out.println("Gia tri vua nhap khong hop le");
            }
        }
        
    }
}
