
package polyphorm;

import java.util.Arrays;
import java.util.Scanner;

public class QLCB {
    static CongNhan ds[]= new CongNhan[0];
    public void taoDS(){
        int spt;
        System.out.println("Moi nhap so phan tu cua danh sach:");
        spt=Integer.parseInt(new Scanner(System.in).nextLine());
        for(int i=0;i<spt;i++){
            ds=Arrays.copyOf(ds,ds.length+1);
            ds[ds.length-1]=new CongNhan();
            ds[ds.length-1].nhapTT();
        }
    }
    
    public void xuatDS(){
        System.out.printf("%-30s%-10s%-20s%-10s%-10s\n", "hoTen" , "gioiTinh", "diaChi", "namSinh","bac");
        for(CongNhan x:ds){ //foreach
            x.xuatTT();
        }
        
        
            
        }
    public boolean timKiem(String st){
        for(CongNhan x:ds){
            if(st.equals(x.getHoTen()))
                return true;
        }
        return false;
    }
}
