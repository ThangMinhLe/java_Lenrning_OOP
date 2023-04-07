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
public class NhanVienPV extends CanBo{
    private String congViec;

    public NhanVienPV() {
    }

    public NhanVienPV(String congViec) {
        this.congViec = congViec;
    }

    public NhanVienPV(String congViec, String hoTen, String gioiTinh, String diaChi, int namSinh) {
        super(hoTen, gioiTinh, diaChi, namSinh);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public void nhapTT() {
        super.nhapTT(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Moi nhap cong viec:");
        congViec=sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-10s%-20s%-15s","","", congViec); //To change body of generated methods, choose Tools | Templates.
    }
    
}
