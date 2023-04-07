/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polyphorm;

/**
 *
 * 
 */
public class CongNhan extends CanBo{
    private String bac;

    public CongNhan() {
    }

    public CongNhan(String bac) {
        this.bac = bac;
    }

    public CongNhan(String bac, String hoTen, String gioiTinh, String diaChi, int namSinh) {
        super(hoTen, gioiTinh, diaChi, namSinh);
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    @Override
    public void nhapTT() {
        super.nhapTT(); // hàm nhập của lớp cha
        System.out.println("nhap bac:");
        bac=sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() +String.format("%-10s", bac); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
