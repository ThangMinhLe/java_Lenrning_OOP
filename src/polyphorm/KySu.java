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
public class KySu extends CanBo{
   private String nganhDT;

    public KySu() {
    }

    public KySu(String nganhDT) {
        this.nganhDT = nganhDT;
    }

    public String getNganhDT() {
        return nganhDT;
    }

    public void setNganhDT(String nganhDT) {
        this.nganhDT = nganhDT;
    }

    @Override
    public void nhapTT() {
        super.nhapTT(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Moi nhap nganh dao tao:");
        nganhDT=sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() +String.format("%-10s%-15s","",nganhDT); //To change body of generated methods, choose Tools | Templates.
    }
   
}
