package polyphorm;

import java.util.Scanner;

public class CanBo {

    private String hoTen, gioiTinh, diaChi;
    private int namSinh;
    static Scanner sc = new Scanner(System.in);

    public CanBo() {
    }

    public CanBo(String hoTen, String gioiTinh, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        while(true){
            if(gioiTinh.equalsIgnoreCase("Nam")||gioiTinh.equalsIgnoreCase("Nu"))
                break;
            System.out.println("Moi nhap gioi tinh hop le");
            gioiTinh=sc.nextLine();
        }
        this.gioiTinh = gioiTinh;
    }



    

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        for(;;){
            if(2023-namSinh>=18)break;
            System.out.println("Moi nhap nam sinh hop le (tuoi>=18):");
            namSinh=Integer.parseInt(sc.nextLine());
        }
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return String.format("%-30s%-10s%-20s%-10d", hoTen , gioiTinh, 
                diaChi, namSinh);
    }
    
    public void nhapTT(){
        System.out.println("Moi nhap ho ten:");
        setHoTen(sc.nextLine());
        System.out.println("Moi nhap gioi tinh:");
        setGioiTinh(sc.nextLine());
        System.out.println("Moi nhap nam sinh:");
        setNamSinh(Integer.parseInt(sc.nextLine()));
        System.out.println("Moi nhap dia chi:");
        setDiaChi(sc.nextLine());
    }


    public void xuatTT(){
        
        System.out.println(toString() );
    }
    
}
