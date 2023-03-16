package Tuan_5;

public class HCN {
    int chieudai;
    int chieurong;
    public HCN (int chieudai, int chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public static void main(String[] args) {
        HCN hcn1 = new HCN(3, 4);
        hcn1.display();
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
        System.out.println("Chu vi cua hinh chu nhat la: " + (int) chuvi());
        System.out.println("Dien tich cua hinh chu nhat la: " + (int) dientich());
    }
}
