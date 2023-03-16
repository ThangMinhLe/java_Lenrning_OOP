package Tuan_5;

import java.util.Scanner;

public class HCN {
    int chieudai;
    int chieurong;
    public HCN (int chieudai, int chieurong) {
        if(chieudai > 0 && chieurong > 0 && chieudai > chieurong) {
        
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
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
        System.out.println("Chu vi cua hinh chu nhat la: " + (int) chuvi());
        System.out.println("Dien tich cua hinh chu nhat la: " + (int) dientich());
    }

}

    public static void main(String[] args) {
        int dai; int rong;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai cho hinh chu nhat: ");
        dai = sc.nextInt();
        System.out.print("Nhap chieu rong cho hinh chu nhat: ");
        rong = sc.nextInt();

        HCN hcn1 = new HCN(dai, rong);
        hcn1.display();
    }


    // write a function to say hello by java?
    // write a function to take a data by python?
}
