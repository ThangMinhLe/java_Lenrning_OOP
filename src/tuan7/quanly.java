package tuan7;

import java.util.*;

import javax.swing.text.AbstractDocument.BranchElement;

public class quanly extends nhanvien {
    static Scanner sc = new Scanner(System.in);

    // Ham add Element.
    public static void add (nhanvien nv[]) {
        System.out.print("Nhap vi tri ban muon them: ");
        // int k = Integer.parseInt(sc.nextLine());
        int k = sc.nextInt();
        if (k > nv.length ) {
            k = nv.length;
        }   else if(k < 1) {
            k = 1;
        }


        for (int i = nv.length - 1  ; i > k - 1  ; i--) {
                nv[i] = nv[i-1];
        }
        
         nv[k-1] = new nhanvien();

        nv[k-1].creatData();

    }

    


    public static void menu (nhanvien nv[]) {
        int option;    
        for(;;) {
                
                System.out.println("1: Add element.");
                System.out.println("2: Show Table");
                System.out.println("3: Tim kiem theo ten.");
                System.out.println("4: Exit.");
                System.out.println("=====================================");
                System.out.println("Moi ban nhap lua chon!");
                // option = Integer.parseInt(sc.nextLine());
                option = sc.nextInt();
                
            
                if (option == 0 ){
                    break;
                }

                switch(option) {
                    case 1: {
                        nv = Arrays.copyOf(nv, nv.length + 1);
                        add(nv);

                        break;
                    }

                    case 2: {
                        System.out.printf("%-20s %-10s %-10s %-20s %20s\n", "Name", "Gio Tinh", "Nam Sinh", "Dia Chi", "Cong Viec");
                        for (int i = 0 ; i < nv.length; i++) {
                            nv[i].showData();
                        }
                        break;
                    }

                    case 3: {
                        find(nv);
                            break;
                    }

                    default: 
                    System.out.println("Lua chon cua ban khong hop le.");
                        break;

                }


            }
          



    }

    public static void main(String[] args) {
        int n;
        System.out.print("Nhap so nhan vien: ");
        n = sc.nextInt();
        nhanvien nv[] = new nhanvien[0];

        for (int i = 0 ; i < n ; i++) {
            // nv[i] = new nhanvien();
           
            nv = Arrays.copyOf(nv, nv.length + 1);
            nv[i] = new nhanvien();
            nv[i].creatData();
        }
        menu(nv);
    }

}



