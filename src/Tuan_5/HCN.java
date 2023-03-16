package Tuan_5;

import java.util.Scanner;

public class HCN {
    int chieudai;
    int chieurong;
//     public HCN (int chieudai, int chieurong) {
//         if(chieudai > 0 && chieurong > 0 && chieudai > chieurong) {
        
//         this.chieudai = chieudai;
//         this.chieurong = chieurong;
//     }
// }

    public void input() {
        Scanner sc = new Scanner(System.in);
        do {
        System.out.print("Vui long nhap chieu dai: ");
        this.chieudai = sc.nextInt();
        } while (chieudai <= 0);
    
        do {
        System.out.print("Vui long nhap chieu rong: ");
        this.chieurong = sc.nextInt();
        } while (chieurong <= 0 || chieudai < chieurong);
        System.out.println("");

    }

    public void displaySoDoHCN () {
        System.out.println("Chieu dai hinh chu nhat ban da nhap la: " + chieudai);
        System.out.println("Chieu rong hinh chu nhat ban da nhap la: " + chieurong);
        System.out.println("");

    }

public double chuvi () {
    double c;
    c = (this.chieudai + this.chieurong) * 2;
    return c;
}


public double dientich () {
    double s;
    s = this.chieudai * this.chieurong;
    return s;
}

public void display () {
    if (chuvi() == 0 || dientich() == 0){
    System.out.println("Chieu va chieu rong ban nhap khong hop le");
    
    }
    else {
        System.out.println("Chu vi cua hinh chu nhat la: (" + chieudai + " + " + chieurong + ") * 2 = " + (int) chuvi());
        System.out.println("Dien tich cua hinh chu nhat la: " + chieudai + " * " + chieurong + " = " + (int) dientich());
    }

}

    public static void main(String[] args) {
        int dai; int rong;
        Scanner sc = new Scanner(System.in);
        // System.out.print("Nhap chieu dai cho hinh chu nhat: ");
        // dai = sc.nextInt();
        // System.out.print("Nhap chieu rong cho hinh chu nhat: ");
        // rong = sc.nextInt();

        HCN hcn1 = new HCN();
        hcn1.input();
        hcn1.displaySoDoHCN();
        hcn1.display();
    }


    // write a function to say hello by java?
    // write a function to take a data by python?
}
